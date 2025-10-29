package com.oliiarchyk.designpatterns;

import com.oliiarchyk.designpatterns.builder.ContactBuilder;

public class Main {

    public static void main(String[] args) {
        var a = new ContactBuilder()
                .name("Name")
                .age(30)
                .city("London")
                .build();
    }
}
