//
//  symboltable.h
//
//  Updated by Russell Larkin on 5/4/24.
//  Project 2
//  UMGC CMSC 330 7381

// This file contains the class definition of the SymbolTable class. The symbol table is represented
// with a vector (list) of type Symbol which is a pair consisting of a variable and its associated value.
// The body of its functions are defined in symboltable.cpp.


class SymbolTable {
public:
    SymbolTable() {}
    void insert(string variable, double value);
    double lookUp(string variable) const;
    void reset() {
        elements.clear(); // added clear all elements
    }
private:
    struct Symbol {
        Symbol(string variable, double value) {
            this->variable = variable;
            this->value = value;
        }
        string variable;
        double value;
    };
    vector<Symbol> elements;
};
