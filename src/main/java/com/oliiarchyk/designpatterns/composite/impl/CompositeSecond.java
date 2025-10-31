package com.oliiarchyk.designpatterns.composite.impl;

import com.oliiarchyk.designpatterns.composite.CompositeAbstract;
import com.oliiarchyk.designpatterns.composite.CompositeType;

import static com.oliiarchyk.designpatterns.composite.CompositeType.SECOND;

public class CompositeSecond extends CompositeAbstract {

    @Override
    public boolean isSupported(CompositeType type) {
        return SECOND.equals(type);
    }

    @Override
    protected String name() {
        return "second";
    }
}
