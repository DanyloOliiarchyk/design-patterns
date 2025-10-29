package com.oliiarchyk.designpatterns.factory;

import com.oliiarchyk.designpatterns.factory.entities.Cat;
import com.oliiarchyk.designpatterns.factory.entities.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class PetFactoryTest {

    private PetFactory unit = new PetFactory();

    @Test
    void buildDogTest(){
        var type = "dog";
        var name = "name";

        var actual = unit.buildPet(type, name);

        assertInstanceOf(Dog.class, actual);
        assertEquals(name, actual.getName());
    }


    @Test
    void buildCatTest(){
        var type = "cat";
        var name = "name";

        var actual = unit.buildPet(type, name);

        assertInstanceOf(Cat.class, actual);
        assertEquals(name, actual.getName());
    }
}