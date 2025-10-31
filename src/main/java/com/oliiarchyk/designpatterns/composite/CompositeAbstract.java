package com.oliiarchyk.designpatterns.composite;

public abstract class CompositeAbstract implements Composite {

    @Override
    public String process(String task) {
        return String.format("Task: [%s] processed by %s composite", task, name());
    }

    protected abstract String name();
}
