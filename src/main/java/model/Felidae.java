package model;

public class Felidae extends Animal{

    public Felidae(int age, int weight) {
        super(age, weight);
    }

    public Felidae() {
        super();
    }
    public void meow() {
        System.out.println("Moew Meow!");
    }
}
