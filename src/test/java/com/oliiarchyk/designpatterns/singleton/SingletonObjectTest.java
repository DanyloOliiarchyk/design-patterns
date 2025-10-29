package com.oliiarchyk.designpatterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonObjectTest {

    @Test
    void getInstanceTest() {
        var singleton1 = SingletonObject.getInstance();
        var singleton2 = SingletonObject.getInstance();

        assertEquals(singleton1, singleton2);
    }

}