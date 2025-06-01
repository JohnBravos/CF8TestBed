package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Tom", 12);
        Animal doggy = new Dog("lola", 5);
        Animal pussy = new Cat("jerry", 2);

        doSpeak(animal);
        System.out.println(animal.animalToString());
        doSpeak(doggy);
        System.out.println(doggy.animalToString());
        doSpeak(pussy);
        System.out.println(pussy.animalToString());
    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}
