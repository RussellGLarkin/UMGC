//
//  multiplication.h
//
//  Created by Russell Larkin on 4/21/24.
//  Project 2
//  UMGC CMSC 330 7381
//
//  Evaluates the product of the left and right

class Multiplication: public SubExpression {
public:
    Multiplication(Expression* left, Expression* right): SubExpression(left, right) {
    }
    double evaluate() {
        return left->evaluate() * right->evaluate();
    }
};
