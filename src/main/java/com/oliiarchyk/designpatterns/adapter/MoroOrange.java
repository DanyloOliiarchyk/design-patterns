package com.oliiarchyk.designpatterns.adapter;

public class MoroOrange implements Orange{

    @Override
    public String getVariety() {
        return "Moro Orange";
    }

    @Override
    public void eat() {
        System.out.println("Moro orange eating...");
    }

    @Override
    public void peel() {
        System.out.println("Moro orange peeling...");
    }

    @Override
    public void juice() {
        System.out.println("Moro orange juice...");
    }
}
