package model;

public class Animal {
    private int age;
    private int weight;

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public Animal() {}

    public void run() {
        System.out.println("Running");
    }

    public void eat() {
        System.out.println("Eating");
    }
}
