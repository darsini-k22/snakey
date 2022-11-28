import java.util.ArrayList;
import java.util.Collections;


public class Q4 {
    public static void main(String[] argc) {

        ArrayList<String> l=new ArrayList<>();
        l.add("Hello");
        l.add("World");
        l.add("Java");
        l.add("Language");

        Collections.sort(l);
        System.out.println(l);
        Collections.shuffle(l);
        System.out.println(l);



    }
}

