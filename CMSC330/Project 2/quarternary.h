//
//  quarternary.h
//
//  Created by Russell Larkin on 4/21/24.
//  Project 2
//  UMGC CMSC 330 7381
//
//  If the expression to the left of the operator # is less than 0, the value of the expression is the value of the first expression after the operator #. If it is equal to 0, the value of the expression is the value of the second expression after the operator #. If it is greater than 0, the value of the expression is the value of the third expression after the operator #.

class Quarternary: public SubExpression {
public:
    Quarternary(Expression* left, Expression* right, Expression* next2, Expression* last): SubExpression(left, right, next2, last){
    }
    double evaluate(){
        double result = left->evaluate();
        if (result < 0) {
            return right->evaluate();
        } else if (result == 0) {
            return next->evaluate();
        } else {
            return last->evaluate();
        }
    }
};
