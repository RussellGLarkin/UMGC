//
//  remainder.h
//
//  Created by Russell Larkin on 4/1/24.
//  Project 2
//  UMGC CMSC 330 7381
//
//  Get the remainder of the quotient

class Remainder: public SubExpression {
public:
    Remainder(Expression* left, Expression* right): SubExpression(left, right) {
    }
    double evaluate() {
        double dividend = left->evaluate();
        double divisor = right->evaluate();
        double quotient = dividend / divisor;
        
        return dividend - (int(quotient) * divisor);
    }
};
