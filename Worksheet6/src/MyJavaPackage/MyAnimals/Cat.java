package MyJavaPackage.MyAnimals;

public class Cat extends Animal implements Pet {
    String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
    }

    @Override
    public String eat() {
        return "Cat eats";
    }

    public String walk(){
        return "cat walks with 4 legs";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String play() {
        return "Cat plays with a ball";
    }
}
