package com.oliiarchyk.designpatterns.singleton;

public class SingletonObject {

    private static SingletonObject instance;

    private SingletonObject() {
        super();
    }

    public static SingletonObject getInstance() {
        if (null == instance) {
            instance = new SingletonObject();
        }
        return instance;
    }
}
