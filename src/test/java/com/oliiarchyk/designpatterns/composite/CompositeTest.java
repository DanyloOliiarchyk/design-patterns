package com.oliiarchyk.designpatterns.composite;

import com.oliiarchyk.designpatterns.composite.impl.CompositeFirst;
import com.oliiarchyk.designpatterns.composite.impl.CompositeSecond;
import com.oliiarchyk.designpatterns.composite.impl.CompositeThird;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompositeTest {

    @Test
    void compositesTest() {
        var first = new CompositeFirst();
        var second = new CompositeSecond();
        var third = new CompositeThird();

        var composites = List.of(first, second, third);

        Arrays.stream(CompositeType.values()).forEach(type -> {

            var actual = composites.stream()
                    .filter(composite -> composite.isSupported(type))
                    .map(composite -> composite.process("test-task"))
                    .findFirst()
                    .orElse("wrong execution");

            var expected = String.format("Task: [test-task] processed by %s composite", type.name().toLowerCase());

            assertEquals(expected, actual);
        });
    }

}