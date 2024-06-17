package constructor;

public class Person {
    private String name = "kilo";
    private String eye = "black";
    private int legs = 2;

    public Person() {
    }

    public Person(String name, String eye, int legs) {
        this.name = name;
        this.eye = eye;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEye() {
        return eye;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public  void talk() {
        System.out.println("my name is " + name + " I have " + eye + " set of eyes.");
    }

    public void walk() {
        System.out.println(name + " is walking with her " + legs + " legs");
    }

    public void sit() {
        System.out.println(name + " is sitting now");
    }
}
