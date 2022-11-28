package MyJavaPackage.MyAnimals;

public class Spider extends Animal {

    public Spider() {
        super(8);
    }

    @Override
    public String eat() {
        return "Spider eats";
    }

    public String walk(){
        return "Spider walks with 8 legs";
    }
}
