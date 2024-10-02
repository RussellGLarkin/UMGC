//
//  ternary.h
//
//  Created by Russell Larkin on 4/21/24.
//  Project 2
//  UMGC CMSC 330 7381
//
//  If the expression to the left of the operator ? is not 0, the value of the expression is the value of the first expression after the operator ?.

//  If it is 0, the value of the expression is the value of the second expression after the operator ?.

class Ternary: public SubExpression {
public:
    Ternary(Expression* left, Expression* right, Expression* next): SubExpression(left, right, next) {
    }
    double evaluate() {
        double ifTrue = right->evaluate();
        double ifFalse = next->evaluate();
        
        if (left->evaluate() == 0) {
            return ifTrue;
        }
        return ifFalse;
    }
};
