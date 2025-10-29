package com.oliiarchyk.designpatterns.factory;

import com.oliiarchyk.designpatterns.factory.entities.Cat;
import com.oliiarchyk.designpatterns.factory.entities.Dog;
import com.oliiarchyk.designpatterns.factory.entities.Pet;

public class PetFactory {

    public Pet buildPet(String type, String name) {
        return switch (type) {
            case "dog" -> new Dog(name);
            case "cat" -> new Cat(name);
            default -> throw new IllegalArgumentException("Unknown animal type: " + type);
        };
    }
}
