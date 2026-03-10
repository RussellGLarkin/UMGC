//
//  exponentiation.h
//
//  Created by Russell Larkin on 4/1/24.
//  Project 2
//  UMGC CMSC 330 7381
//
//  Evaluates the base (left) to the power of the exponent (right)

class Exponentiation: public SubExpression {
public:
    Exponentiation(Expression* left, Expression* right): SubExpression(left, right) {
    }
    double evaluate() {
        double exponent = right->evaluate();
        double base = left->evaluate();
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
};
