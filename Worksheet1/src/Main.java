//
//import java.util.*;
//
//enum Grades{
//    A(4),B(3),C(2),D(1),F(0);
//  public final double grade;
//    private Grades(int i) {
//        this.grade=i;
//    }
//
//    double getGradeValue(String letter){
//        return this.grade;
//    }
//
//    double getModifiedValue(char s){
//        switch (s){
//            case '+':
//                return grade+(grade<4 && grade>0 ?0.3:0);
//            case '-':
//                return grade+(grade>0?-0.3:0);
//            default:
//                System.out.println("Invalid input!");
//        }
//        return grade;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the Grade:");
//        String letter=sc.nextLine();
//
//        Grades g=Grades.valueOf(letter.substring(0,1));
//        if(letter.length()>1){
//            System.out.println(g.getModifiedValue(letter.charAt(1)));
//
//        }
//        else{
//            System.out.println(g.grade);
//        }
//
//
//
//    }
//}

//3
//
//import java.util.*;
//
//
//public class Main{
////
//public static class Card
//{
//    private String denom;
//    private String suite;
//    private String String1;
//    private String String2;
//
//    public Card(String s1)
//    {
//        denom = s1.substring(0, 1);
//        suite = s1.substring(1);
//    }
//
//    public String getDescription()
//    {
//        if (denom.equalsIgnoreCase("K"))
//        {
//            String1 = "King";
//        }
//        else if (denom.equalsIgnoreCase("Q"))
//        {
//            String1 = "Queen";
//        }
//        else if (denom.equalsIgnoreCase("J"))
//        {
//            String1 = "Jack";
//        }
//        else if (denom.equals("10"))
//        {
//            String1 = "Ten";
//        }
//        else if (denom.equals("9"))
//        {
//            String1 = "Nine";
//        }
//        else if (denom.equals("8"))
//        {
//            String1 = "Eight";
//        }
//        else if (denom.equals("7"))
//        {
//            String1 = "Seven";
//        }
//        else if (denom.equals("6"))
//        {
//            String1 = "Six";
//        }
//        else if (denom.equals("5"))
//        {
//            String1 = "Five";
//        }
//        else if (denom.equals("4"))
//        {
//            String1 = "Four";
//        }
//        else if (denom.equals("3"))
//        {
//            String1 = "Three";
//        }
//        else if (denom.equals("2"))
//        {
//            String1 = "Two";
//        }
//        else if (denom.equalsIgnoreCase("A"))
//        {
//            String1 = "Ace";
//        }
//
//
//        if (suite.equalsIgnoreCase("D"))
//        {
//            String2 = "Diamonds";
//        }
//        else if (suite.equalsIgnoreCase("H"))
//        {
//            String2 = "Hearts";
//        }
//        else if (suite.equalsIgnoreCase("C"))
//        {
//            String2 = "Clubs";
//        }
//        else if (suite.equalsIgnoreCase("S"))
//        {
//            String2 = "Spades";
//        }
//
//        return String1 + " of " + String2;
//    }
//}
//
//         public static void main(String[] argc) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter the card notation:");
//             String card = sc.nextLine();
//
//             String denom = card.substring(0, 1);
//             String suite = card.substring(1);
//             Card c= new Card(card);
//             System.out.println(c.getDescription());
//
//
//         }
//
//}
//import java.util.*;
//public class Main{
//    public static void main(String[] argc){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the Number of gallons of gas in the tank:");
//        float no_of_gallons_gas=sc.nextFloat();
//        System.out.println("Enter the fuel efficiency in miles per gallon:");
//        float efficiency=sc.nextFloat();
//        System.out.println("Enter the price of gas per gallon:");
//        double price=sc.nextDouble();
//
//        double distance=no_of_gallons_gas*efficiency;
//        double cost_per_mile=(100/efficiency)*price;
//
//        System.out.println("The car can travel = "+distance+" miles");
//        System.out.println("Cost per mile = "+cost_per_mile);
//    }
//}
//
//import java.util.*;
//
//public class Main{
//    public static void main(String[] argc){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Your Astrological Sign:");
//        String sign=sc.nextLine();
//        String fortune = null;
//
//        switch (sign){
//            case "scorpio":
//                fortune="The flamboyance with which you do your work leaves people awestruck." +
//                        "At work, your dedication will win rich favour from your bosses.";
//            case "aris":
//                fortune="Today you may want to do only those things that you love to do." +
//                        " You have a very optimistic outlook.";
//            case "taurus":
//                fortune="At work or in business, you are likely to feel uneasy about " +
//                        "the people around you, says Ganesha.";
//            case "gemini":
//                fortune="Though you are always open to advice, " +
//                        "you need to take your own, independent decision today. ";
//            case "cancer":
//                fortune="Both your physical and mental health will " +
//                        "" +
//                        "remain stable today, predicts Ganesha.";
//            case "leo":
//                fortune="It's an early thanksgiving for you today, " +
//                        "says Ganesha, as you feel full of the spirit of joy and blessing. ";
//            case "virgo":
//                fortune="Today, you shall be in a receptive frame of mind, open to all ideas; " +
//                        "yet the stubborn will rule when decision-making matters, predicts Ganesha";
//            case "libra":
//                fortune="The mind is a pool of infinite thoughts; this is more " +
//                        "true for you today than any other day.";
//            case "sagittarius":
//                fortune="A delightfully emotional experience would stir up your soul today. ";
//            case "capricon":
//                fortune="You may have a good control over your temper, but Ganesha says you are very " +
//                        "likely to lose it today, and most likely, at work.";
//            case "aquarius":
//                fortune="Your friends will make your day, especially those " +
//                        "in high places will prove invaluable.";
//            case "pisces":
//                fortune="Your social standing ought to receive a boost today, and the financial success coming your" +
//                        " way today plays no small part in it, says Ganesha. ";
//
//
//        }
//
//        System.out.println(sign+" : "+fortune);
//    }
//}

//import java.text.DecimalFormat;
//import java.util.*;
//
//
//public class Main{
//    public static void main(String[] argc){
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the unicode number:");
//        int unicode=sc.nextInt();
//
//        String pattern="0.00";
//        DecimalFormat df=new DecimalFormat(pattern);
//
//        if(Character.isLetter(unicode)){
//            System.out.println("You have entered letter!");
//        }
//
//
//        char charUni=(char) unicode;
//        System.out.println(charUni);
//
//        double result=(unicode*27/27);
//        System.out.println("Before formatting the result:"+result);
//        System.out.println("After formatting the result:"+df.format(result));
//
//
//    }
//}

import java.util.*;
//
//public class Main {
//    public static void main(String[] argc) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the date to be validated:");
//        String date = sc.nextLine();
//        String convDate = date.replace(",", "");
//
//        int month = Integer.parseInt(convDate.substring(0, 2));
//
//        int date_ = Integer.parseInt(convDate.substring(2, 4));
//
//        int year = Integer.parseInt(convDate.substring(4, 8));
//
//        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
//            if (date_ <= 31) {
//                System.out.println("Valid Date");
//            }
//            else if (month == 4 || month == 6 || month == 9 || month == 11) {
//                if (date_ <= 30) {
//                    System.out.println("Valid Date");
//                } else {
//                    System.out.println("Invalid Date");
//                }
//            }
//        }
//        else if (month == 2) {
//            if (year % 4 == 0) {
//                if (year % 100 == 0) {
//                    if (year % 400 == 0) {
//                        if (date_ <= 29) {
//                            System.out.println("leap year but Valid Date!");
//                        } else {
//                            System.out.println("not a leap year but Date is valid!");
//                        }
//
//                    }
//                }
//            }
//
//        }
//        else {
//            System.out.println("Invalid Date");
//        }
//
//
//    }
//}

//public class Main{
//    public static void main(String[] argc){
//        char array[]={'A','B','C','a','b','c','0','1','2','$','*','+','/',' '};
//
//        int b=0;
//        for(int i=0;i<14;i++){
//            b = array[i];
//            System.out.println(b);
//        }
//
//    }
//}

//public class Main {
//    public static void main(String[] argc) {
//        int[][] A = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6}};
//        double[] power = new double[A[0].length];
//        for (int j = 0; j < A[0].length; j++) {
//            power[j] = Math.pow(A[0][j], A[1][j]);
//        }
//
//        for (int i = 0; i < A[0].length; i++) {
//            System.out.println(power[i]);
//        }
//    }
//}

//public class Main{
//    static void colsum(float mat[][]){
//        float sum=0;
//        int row=mat[0].length;
//        int col=mat.length;
//
//        for (int i = 0; i < mat[0].length; ++i) {
//            for (int j = 0; j < mat.length; ++j) {
//
//                sum = sum + mat[j][i];
//            }
//            mat[row][i]=sum;
//
//            sum=0;
//        }
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//            System.out.print(mat[i][j]+"  ");
//            }
//        System.out.print("\n");}
//
//    }
//    public static void main(String[] argc){
//
//
//        float[][] mat={{4,7,1,8},
//            {3,8,9,5},
//            {1,3,4,5},
//            {8,1,5,6},
//            {0,0,0,0}};
//        float sum=0;
//        colsum(mat);
//    }
//}

//public class PrimeRange {
//
//    public static boolean checkPrime(int n){
//        if(n==1||n==0){
//            return false;
//        }
//
//        if(n==2){
//            return true;
//        }
//
//        for(int i=2;i*i<n;i++){
//            return n%i != 0;
//        }
//
//        return true;
//    }
//
//    public static void main(String[] argc){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the first number:");
//        int a=sc.nextInt();
//        System.out.println("Enter the last number:");
//        int b=sc.nextInt();
//
//        System.out.println("The prime numbers between " +a +" and "+b+" is:");
//        for(int j=a;j<=b;j++){
//            if(checkPrime(j)){
//                System.out.print(j+" ");
//            }
//        }
//
//
//    }
//}


//import java.util.*;
//
//public class Main {
//
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        final double FLUID_OUNCE_TO_LITER = 0.029586;
//        final double GALLON_TO_LITER = 3.758;
//        final double OUNCE_TO_GRAM = 28.3495;
//        final double POUND_TO_GRAM = 453.6;
//        final double INCH_TO_METER = 0.00254;
//        final double FOOT_TO_METER = 0.305;
//        final double MILE_TO_METER = 1609.0;
//        System.out.print("Convert from (fl.oz, gal, oz, lb, in, ft, mi): ");
//        String convert_from = input.next();
//        System.out.print("Convert to (ml, l, g, kg, mm, cm, m, km): ");
//        String convert_to = input.next();
//        System.out.print("Enter value: ");
//        double value = input.nextDouble();
//        input.close();
//
//        double c_factor = 0.0;
//
//        if (convert_from.equals("fl.oz")) {
//            if (convert_to.equals("ml")) {
//                c_factor = FLUID_OUNCE_TO_LITER * 1000;
//            }
//            else if (convert_to.equals("l")) {
//                c_factor = FLUID_OUNCE_TO_LITER;
//            }
//        }
//        else if (convert_from.equals("gal")) {
//            if (convert_to.equals("ml")) {
//                c_factor = GALLON_TO_LITER * 1000;
//            }
//            else if (convert_to.equals("l")) {
//                c_factor = GALLON_TO_LITER;
//            }
//        }
//        else if (convert_from.equals("oz")) {
//            if (convert_to.equals("g")) {
//                c_factor = OUNCE_TO_GRAM;
//            }
//            else if (convert_to.equals("kg")) {
//                c_factor = OUNCE_TO_GRAM / 1000;
//            }
//        }
//        else if (convert_from.equals("lb")) {
//            if (convert_to.equals("g")) {
//                c_factor = POUND_TO_GRAM;
//            }
//            else if (convert_to.equals("kg")){
//                c_factor = POUND_TO_GRAM / 1000;
//            }
//        }
//        else if (convert_from.equals("in")) {
//            if (convert_to.equals("mm")) {
//                c_factor = INCH_TO_METER * 1000;
//            }
//            else if (convert_to.equals("cm")) {
//                c_factor = INCH_TO_METER * 100;
//            }
//            else if (convert_to.equals("m")) {
//                c_factor = INCH_TO_METER;
//            }
//            else if (convert_to.equals("km")) {
//                c_factor = INCH_TO_METER / 1000;
//            }
//        }
//        else if (convert_from.equals("ft")) {
//            if (convert_to.equals("mm")) {
//                c_factor = FOOT_TO_METER * 1000;
//            }
//            else if (convert_to.equals("cm")) {
//                c_factor = FOOT_TO_METER * 100;
//            }
//            else if (convert_to.equals("m")) {
//                c_factor = FOOT_TO_METER;
//            }
//            else if (convert_to.equals("km")) {
//                c_factor = FOOT_TO_METER / 1000;
//            }
//        }
//        else if (convert_from.equals("ml")) {
//            if (convert_to.equals("mm")) {
//                c_factor = MILE_TO_METER * 1000;
//            }
//            else if (convert_to.equals("cm")) {
//                c_factor = MILE_TO_METER * 100;
//            }
//            else if (convert_to.equals("m")) {
//                c_factor = MILE_TO_METER;
//            }
//            else if (convert_to.equals("km")) {
//                c_factor = MILE_TO_METER / 1000;
//            }
//        }
//
//        if (c_factor == 0.0) {
//            System.out.println("Conversion is unavailable.");
//        }
//        else {
//            double converted = value * c_factor;
//            System.out.printf("%.4f %s = %.4f %s", value, convert_from, converted, convert_to);
//        }
//    }
//
//}


public class Main {
    public static void main(String[] argc) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] time = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        int min = 0;
        for (int i = 0; i < time.length; i++) {
            for (int j = i + 1; j < time.length; j++) {
                int tmp1 = 0;
                String tmp2 = null;
                if (time[i] > time[j]) {
                    tmp1 = time[i];
                    time[i] = time[j];
                    time[j] = tmp1;

                    tmp2 = names[i];
                    names[i] = names[j];
                    names[j] = tmp2;
                }
            }
            System.out.print(time[i] + " ");
            System.out.println(names[i]);
        }
        System.out.println("First Fastest person is:" +names[0]+" time:"+time[0]);
        System.out.println("Second Fastest person is:"+names[1]+" time:"+time[1]);
    }
}
