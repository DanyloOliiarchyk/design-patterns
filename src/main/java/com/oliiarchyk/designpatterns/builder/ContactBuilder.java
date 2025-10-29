package com.oliiarchyk.designpatterns.builder;

public class ContactBuilder {

    private Contact contact;

    public ContactBuilder builder() {
        contact = new Contact();
        return this;
    }

    public ContactBuilder name(String name) {
        contact.setName(name);
        return this;
    }

    public ContactBuilder age(Integer age) {
        contact.setAge(age);
        return this;
    }

    public ContactBuilder city(String city) {
        contact.setCity(city);
        return this;
    }

    public Contact build() {
        return contact;
    }
}
