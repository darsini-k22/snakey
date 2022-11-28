import java.util.ArrayList;
import java.util.HashSet;

class MyownClass {
    String s;
    int age;

    MyownClass(String s, int age) {
        this.age = age;
        this.s = s;
    }

    @Override
    public String toString() {
        return
                "s='" + s + '\'' +
                        ", age=" + age;
    }
}

public class HashSetMain {
    public static void main(String[] argc) {
        HashSet<ArrayList> set = new HashSet<>();
        ArrayList<String> s = new ArrayList<>();
        ArrayList<MyownClass> mc = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();

        s.add("Hello");
        s.add("World");
        s.add("Java");
        s.add("Language");

        mc.add(new MyownClass("Meenakshi", 50));
        mc.add(new MyownClass("Kabilan", 53));
        mc.add(new MyownClass("kavyashree", 15));
        mc.add(new MyownClass("Darsini", 20));

        in.add(22);
        in.add(56);
        in.add(90);
        in.add(345);

        set.add(s);
        set.add(mc);
        set.add(in);

        System.out.println(set);

    }
}
