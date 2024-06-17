package constructor;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void animalSound() {
        System.out.println(name + " is barking");
    }
}
