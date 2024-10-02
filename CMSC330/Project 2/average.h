//
//  average.h
//
//  Created by Russell Larkin on 4/8/24.
//  Project 2
//  UMGC CMSC 330 7381
//
//  Evaluates the average of the left and right

class Average: public SubExpression {
public:
    Average(Expression* left, Expression* right): SubExpression(left, right) {
    }
    double evaluate() {
        double total = left->evaluate() + right->evaluate();
        return total / 2.0;
    }
};
