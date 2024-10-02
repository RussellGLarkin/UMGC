//
//  division.h
//
//  Created by Russell Larkin on 4/1/24.
//  Project 2
//  UMGC CMSC 330 7381
//
//  Evaluates the quotient of the left and right


class Division: public SubExpression {
public:
    Division(Expression* left, Expression* right): SubExpression(left, right) {
    }
    double evaluate() {
        return left->evaluate() / right->evaluate();
    }
};
