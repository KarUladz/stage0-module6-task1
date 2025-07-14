package com.epam.mjc.stage0;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();

        System.out.println(dog.getDescription());   // Output from Dog
        System.out.println(bird.getDescription());  // Output from Bird
    }
}
