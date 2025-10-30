package com.oliiarchyk.designpatterns.interpreter;

import com.oliiarchyk.designpatterns.interpreter.impl.AddExpression;
import com.oliiarchyk.designpatterns.interpreter.impl.MultiplyExpression;
import com.oliiarchyk.designpatterns.interpreter.impl.NumberExpression;
import com.oliiarchyk.designpatterns.interpreter.impl.SubtractExpression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpressionTest {

    @Test
    void interpreterTest() {
        // Equivalent to: 5 + 10 - 2
        var expression = new MultiplyExpression(new SubtractExpression(
                new AddExpression(
                        new NumberExpression(5),
                        new NumberExpression(10)
                ),
                new NumberExpression(2)
        ), new NumberExpression(10));

        int result = expression.interpret();

        assertEquals(130, result);
        System.out.println("Result: " + result);
    }

}