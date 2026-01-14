package org.example;

public class Animal {

    public String name;

    public Animal(String name){
        this.name = name;
    }

    public String toString() {
        return "Animal{name='%s'}".formatted(name);
    }

    public void eat(){
        System.out.println(name + " їсть");
    }

}
