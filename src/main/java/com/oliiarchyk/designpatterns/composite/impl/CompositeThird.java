package com.oliiarchyk.designpatterns.composite.impl;

import com.oliiarchyk.designpatterns.composite.CompositeAbstract;
import com.oliiarchyk.designpatterns.composite.CompositeType;

import static com.oliiarchyk.designpatterns.composite.CompositeType.THIRD;

public class CompositeThird extends CompositeAbstract {

    @Override
    public boolean isSupported(CompositeType type) {
        return THIRD.equals(type);
    }

    @Override
    protected String name() {
        return "third";
    }
}
