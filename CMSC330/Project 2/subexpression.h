//
//  subexpression.h
//
//  Updated by Russell Larkin on 4/1/24.
//  Project 2
//  UMGC CMSC 330 7381

// This file contains the class definition of the SubExpression class, which is a subclass of Expression.
// Because it does not implement the abstract function evalauate, it is an abstract class. SubExpression
// objects are represented with the left and right subexpressions. The body of its constructor and the
// static (class) function parse are defined in subexpression.cpp. 


class SubExpression: public Expression {
public:
    SubExpression(Expression* left, Expression* right);
    SubExpression(Expression* left, Expression* right, Expression* next); // Added
    SubExpression(Expression* left, Expression* right, Expression* next,  Expression* last); // Added
    static Expression* parse(stringstream& in);
protected: 
    Expression* left;
    Expression* right;
    Expression* next; // Added
    Expression* last; // Added
};
