//
//  parse.cpp
//
//  Updated by Russell Larkin on 4/8/24.
//  Project 2
//  UMGC CMSC 330 7381
//
// This file contains the body of the function parseName. That function consumes all alphanumeric
// characters until the next whitespace and returns the name that those characters form.

#include <cctype>
#include <sstream>
#include <string>
using namespace std;

#include "parse.h"

string parseName(stringstream& in) {
    char alnum;
    string name = "";
    string invalidChar = "";
    
    in >> ws;
    if (in.peek() == '_') { // catch first '_' appearing as the first character
        in >> alnum;
        invalidChar = alnum;
        throw runtime_error("Invalid first character '" + invalidChar + "' in variable name");
    }
    while (isalnum(in.peek()) || in.peek() == '_') { // added to allow '_' within variable names
        in >> alnum;
        name += alnum;
    }
    return name;
}
