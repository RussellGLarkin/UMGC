//
//  unary.h
//
//  Created by Russell Larkin on 5/4/24.
//  Project 2
//  UMGC CMSC 330 7381
//

//  The single unary operator ~ is the negation operator. Unlike the unary minus in most languages it is a postfix operator rather than a prefix one.

class Unary: public SubExpression {
public:
    Unary(Expression* left, Expression* right): SubExpression(left, right) {
    }
    double evaluate() {
        return left->evaluate() * -1;
    }
};
