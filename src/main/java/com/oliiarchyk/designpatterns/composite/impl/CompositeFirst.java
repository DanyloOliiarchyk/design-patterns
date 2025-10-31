package com.oliiarchyk.designpatterns.composite.impl;

import com.oliiarchyk.designpatterns.composite.CompositeAbstract;
import com.oliiarchyk.designpatterns.composite.CompositeType;

import static com.oliiarchyk.designpatterns.composite.CompositeType.FIRST;

public class CompositeFirst extends CompositeAbstract {

    @Override
    public boolean isSupported(CompositeType type) {
        return FIRST.equals(type);
    }

    @Override
    protected String name() {
        return "first";
    }
}
