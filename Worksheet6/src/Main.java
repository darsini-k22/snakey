import Language.SentenceGenerate;
import Language.WordGenerate;

import java.util.Scanner;
import MyJavaPackage.MyAnimals.*;

public class Main {

    public static void main(String[] argc){

//        Scanner sc=new Scanner(System.in);
////        String[] noun=new String[5]{"cake","school","bag","time","bus"};
////        String[] verb=new String[]{"going","drawing","eat","describe","drink"};
//        String[] noun=new String[5];
//        String[] verb=new String[5];
//        System.out.println("Enter 5 nouns:");
//
//        for(int i=0;i<5;i++){
//            noun[i]=sc.nextLine();
//        }
//        System.out.println("Enter 5 verbs:");
//        for(int j=0;j<5;j++){
//            verb[j]=sc.nextLine();
//        }
//
//        SentenceGenerate s1=new SentenceGenerate(noun,verb);
//        String sentences=s1.getSentence(20);
//        for(int i=0;i<20;i++){
//            System.out.println(sentences);
//        }
//
//        WordGenerate w=new WordGenerate("hello",3);
//        System.out.println(w.repeatEnd("hello",1));
//



                Fish f = new Fish();
                Cat c = new Cat("Fluffy");
                Animal a = new Fish();
                Animal e = new Spider();
                Pet p = new Cat();

                System.out.println(f.walk() + " " + f.eat());
                c.setName("Mark");
                System.out.println(c.getName() + " " + c.walk() + " " + c.eat() + " " + c.play());
                System.out.println(a.walk()+" "+a.eat());
                System.out.println(e.walk()+" "+e.eat());
                p.setName("Snow bell");
                System.out.println(p.getName()+" "+p.play()+" ");



    }
}