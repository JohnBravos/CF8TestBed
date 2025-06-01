package gr.aueb.cf.ch15;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // public API

    public void speak() {
        System.out.println("I am an animal");
    }

    public String animalToString() {
        return "[name=" + name + ", age=" + age + "]";
    }
}
