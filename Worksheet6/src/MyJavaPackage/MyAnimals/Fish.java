package MyJavaPackage.MyAnimals;

public class Fish extends Animal{

    public Fish() {
        super(0);
    }

    @Override
    public String eat() {
        return "Fish eats in the water";
    }


    public String walk(){
        return "Fish cannot walk";
    }
}
