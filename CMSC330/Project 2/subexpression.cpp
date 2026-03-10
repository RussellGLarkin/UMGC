//
//  subexpression.cpp
//
//  Updated by Russell Larkin on 4/1/24.
//  Project 2
//  UMGC CMSC 330 7381
//
// This file contains the body of the functions contained in The SubExpression class, which includes
// the constructor that initializes the left and right subexpressions and the static function parse
// parses the subexpression.

#include <iostream>
#include <sstream>
using namespace std;

#include "expression.h"
#include "subexpression.h"
#include "operand.h"
#include "plus.h"
#include "minus.h"

//added
#include "multiplication.h"
#include "division.h"
#include "remainder.h"
#include "exponentiation.h"
#include "minimum.h"
#include "maximum.h"
#include "average.h"
#include "unary.h"
#include "ternary.h"
#include "quarternary.h"

SubExpression::SubExpression(Expression* left, Expression* right) {
    this->left = left;
    this->right = right;
}

SubExpression::SubExpression(Expression* left, Expression* right, Expression* next) {
    this->left = left;
    this->right = right;
    this->next = next;
}

SubExpression::SubExpression(Expression* left, Expression* right, Expression* next, Expression* last) {
    this->left = left;
    this->right = right;
    this->next = next;
    this->last = last;
}

Expression* SubExpression::parse(stringstream& in) {
    Expression* left;
    Expression* right;
    Expression* next;
    Expression* last;
    char operation, paren;
    
    left = Operand::parse(in);
    in >> operation;
    
    //  for ternary.h
    if (operation == '?') {
        right = Operand::parse(in);
        next = Operand::parse(in);
        in >> operation;
        return new Ternary(left, right, next);
    }
    
    //  for quaternary.h
    if (operation == '#') {
        right = Operand::parse(in);
        next = Operand::parse(in);
        last = Operand::parse(in);
        in >> operation;
        return new Quarternary (left, right, next, last);
    }
    
    right = Operand::parse(in);
    in >> paren;
    
    switch (operation) {
        case '+':
            return new Plus(left, right);
        case '-':
            return new Minus(left, right);
            
        //  Added
        case '~':
            return new Unary(left, right);
        case '*':
        	return new Multiplication(left, right);
        case '/':
        	return new Division(left, right);
        case '%':
        	return new Remainder(left, right);
        case '^':
        	return new Exponentiation(left, right);
        case '<':
            return new Minimum(left, right);
        case '>':
            return new Maximum(left, right);
        case '&':
            return new Average(left, right);
    }
    return 0;
}
        
