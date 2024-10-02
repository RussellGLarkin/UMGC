//
//  minimum.h
//
//  Created by Russell Larkin on 4/8/24.
//  Project 2
//  UMGC CMSC 330 7381
//
//  Evaluates the minimum of either the left or right

class Minimum: public SubExpression {
public:
    Minimum(Expression* left, Expression* right): SubExpression(left, right) {
    }
    double evaluate() {
        if (left->evaluate() < right->evaluate()) {
            return left->evaluate();
        }
        return right->evaluate();
    }
};
