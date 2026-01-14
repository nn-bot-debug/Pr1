package org.example;

public class Cat extends Animal {

    private final String breed;

    public Cat(String name, String breed){
        super(name);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat ==> %s".formatted(super.toString());
    }
}
