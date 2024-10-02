//
//  symboltable.cpp
//
//  Updated by Russell Larkin on 5/4/24.
//  Project 2
//  UMGC CMSC 330 7381

// This file contains the body of the functions contained in The SymbolTable class. The insert function 
// inserts a new variable symbol and its value into the symbol table and the lookUp function returns
// that value of the supplied variable symbol name.

#include <string>
#include <vector>
#include <stdexcept> // this is what I was missing and why it wouldn't compile on Windows, but was working on my mac
using namespace std;

#include "symboltable.h"

// edited to identify variables that had already been used
void SymbolTable::insert(string variable, double value) {
    for(int i = 0; i < elements.size(); i++) {
        if (elements[i].variable == variable) {
            throw runtime_error("Variable '" + variable + "' already exists. Cannot duplicate");
        }
    }
    const Symbol& symbol = Symbol(variable, value);
    elements.push_back(symbol);
}

// edited to identify variables that were not initialized
double SymbolTable::lookUp(string variable) const {
    for (int i = 0; i < elements.size(); i++) {
        if (elements[i].variable == variable) {
            return elements[i].value;
        }
    }
    throw runtime_error("Variable '" + variable + "' not initialized");
    return 0; // deals with a warning during compiling
}
