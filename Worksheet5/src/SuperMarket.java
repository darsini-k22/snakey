public class SuperMarket {
    public static void main(String[] argc) {
        WeightItem w1=new WeightItem("Banana",3.00,1.37);
        System.out.println(w1.getPrice());
        System.out.println(w1.toString());
        CountedItem c1=new CountedItem("Pens",4.5,10);
        System.out.println(c1.getPrice());
        System.out.println(c1.toString());


    }
}
