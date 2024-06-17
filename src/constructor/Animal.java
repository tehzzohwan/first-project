package constructor;

public class Animal {
    public String name;
    public int leg;
    public String eye;
    public String mouth;

    public Animal(String name) {
        this.name = name;
    }
    public void animalSound() {
        System.out.println(name + " is making a sound");
    }

}


