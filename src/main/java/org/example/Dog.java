package org.example;

public class Dog extends Animal {

    private final String breed;

    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog ==> %s".formatted(super.toString());
    }

    @Override
    public void eat() {
        System.out.println(name + " їсть собачий корм");
    }

    public void bark() {
        System.out.println(name + " гавкає!");
    }
}
