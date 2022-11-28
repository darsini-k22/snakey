import java.util.Scanner;

public class MyException  extends Exception{

    int a;
    int b;
    int c;

    MyException(String string,int b){
        try{
            this.a=string.length();
            this.b=b;
        }
        catch (Exception e){
             e.getMessage();
        }

    }

    int calculateC(){
        c=b/a;
        return c;
    }

    @Override
    public String toString() {
        return "a="+a+" b="+b+" c="+c;
    }
}

class Main{
    public static void main(String[] argc){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string");
        String string=sc.nextLine();
        System.out.println("Enter the value for b:");
        int b=sc.nextInt();

        MyException ex=new MyException(string,b);

        System.out.println(ex.calculateC());
        ex.toString();

    }
}