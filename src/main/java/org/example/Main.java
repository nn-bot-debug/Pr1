package org.example;

public class Main {
    Animal patron = new Dog("Пес Патрон", "Джек");

    public void main(String[] args) {

        Dog dog = new Dog("Мухтар", "мопс");
        System.out.println(dog);

        Cat cat = new Cat("Мурка", "британка");
        System.out.println(cat);

        Animal animal = new Animal("хтось");
        System.out.println(animal);

        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println("String == : " + (s1 == s2));
        System.out.println("String equals: " + s1.equals(s2));

        for (int i = -128; i <= 130; i++){
            Integer a = i;
            Integer b = i;
            if (a == b) {
                System.out.println("Числа однакові за посиланням:" + i);
            }
        }

        /**
         * What I can say about it. Values from -128 to 127 are stored in the
         * Integer Cache. Values outside this range are always created as new objects
         * in Heap memory.
         */

        feed(dog);
        feed(cat);
        feed(patron);
    }

    public static void feed(Animal dog) {
        dog.eat();

        if(dog instanceof Dog d){
            d.bark();
        }
    }
}