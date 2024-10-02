//
//  project2.cpp
//
//  Updated by Russell Larkin on 5/4/24.
//  Project 2
//  UMGC CMSC 330 7381
//
// This file contains the main function for project 2. It reads an input file named input.txt
// that contains one statement that includes an expression following by a sequence of variable assignments.
// It parses each statement and then evaluates it.

#include <iostream>
#include <fstream>
#include <sstream>
#include <string>
#include <vector>
using namespace std;

#include "expression.h"
#include "subexpression.h"
#include "symboltable.h"
#include "parse.h"

SymbolTable symbolTable;

void parseAssignments(stringstream& in);

int main() {
    const int SIZE = 256;
    Expression* expression;
    char paren, comma, line[SIZE];
    string filename;
    
    ifstream fin;
    
    while (true) { // enter file name until you get it right, or exit to exit.
        cout << "Enter the name of the input file or 'exit' to exit: ";
        getline(cin,filename);
        
        if (filename == "exit" || filename == "'exit'") {
            cout << "Exiting the program." << endl;
            return 0;
        }
        
        fin.open(filename);
        if (!(fin.is_open())) {
            cout << "File could not be opened. Please check name and try again" << endl;
            system("pause");
            continue;
        }
        break;
    }
    while (true) {
        symbolTable.reset(); //  clears the elements for each statement
        fin.getline(line, SIZE);
        if (!fin)
            break;
        stringstream in(line, ios_base::in);
        in >> paren;
        cout << "\n" << line << endl; //  added \n to get some space between the outputs
        try {
            expression = SubExpression::parse(in);
            in >> comma;
            parseAssignments(in);
            double result = expression->evaluate();
            cout << "Value = " << result << endl;
        }
        catch (const runtime_error& e) { //  catch and display the runtime errors
            cout << "Error: " << e.what() << endl;
        }
    }
    system("pause");
    return 0;
}

void parseAssignments(stringstream& in) {
    char assignop, delimiter;
    string variable;
    double value;
    do {
        variable = parseName(in);
        in >> ws >> assignop >> value >> delimiter;
        symbolTable.insert(variable, value);
    }
    while (delimiter == ',');
}
   
