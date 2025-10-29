package com.oliiarchyk.designpatterns.interpreter.impl;

import com.oliiarchyk.designpatterns.interpreter.Expression;

public class NumberExpression implements Expression {

    private final int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}