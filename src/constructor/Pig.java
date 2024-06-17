package constructor;

public class Pig extends Animal {
    int leg = 4;

    public Pig(String name) {
        super(name);
    }

    @Override
    public void animalSound() {
        System.out.println(name + " is oinking");
    }

    public String day(String weekday) {
        return weekday;
    }

    public int day() {
        return 24;
    }
}
