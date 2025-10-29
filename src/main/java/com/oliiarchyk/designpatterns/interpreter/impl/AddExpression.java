package com.oliiarchyk.designpatterns.interpreter.impl;

import com.oliiarchyk.designpatterns.interpreter.Expression;

public class AddExpression implements Expression {

    private final Expression left;
    private final Expression right;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}