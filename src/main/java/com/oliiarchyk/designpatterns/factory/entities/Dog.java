package com.oliiarchyk.designpatterns.factory.entities;

public class Dog implements Pet {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
