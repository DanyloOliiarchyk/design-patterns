package com.oliiarchyk.designpatterns.composite;

public interface Composite {

    boolean isSupported(CompositeType type);

    String process(String task);
}
