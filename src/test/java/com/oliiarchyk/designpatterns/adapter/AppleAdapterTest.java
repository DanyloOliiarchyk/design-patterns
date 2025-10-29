package com.oliiarchyk.designpatterns.adapter;

import org.junit.jupiter.api.Test;

class AppleAdapterTest {

    @Test
    void testAppleAdapter() {
        var orange = new MoroOrange();
        var apple = new AppleAdapter(orange);

        System.out.println(apple.getVariety());
        apple.eat();
    }

}