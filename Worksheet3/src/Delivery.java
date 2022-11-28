import java.util.Scanner;

public class Delivery {
    public static void main(String[] argc) {
        Order[] orders = new Order[4];
        orders[0] = new Order();
        orders[1] = new RushOrder(1);
        orders[2] = new RushOrder(2);
        orders[3] = new RushOrder(3);

        Scanner sc = new Scanner(System.in);

        String option;


        int price = 300;
        int deliveryDay = 4;
        String UPC;
        int quantity;


        do {
            System.out.println("Order/done:");
            option = sc.nextLine();
            switch (option) {
                case "order":
                    System.out.println("Enter the UPC:");
                    UPC = sc.nextLine();
                    System.out.println("Enter the quantity:");
                    quantity = sc.nextInt();
                    OrderItem orderItem = new OrderItem(UPC, quantity, price);
                    //1 to 7

                    if (deliveryDay >= 4) {
                        orders[0].addOrderItem(orderItem);
                    } else if (deliveryDay == 3) {
                        orders[3].addOrderItem(orderItem);

                    } else if (deliveryDay == 2) {
                        orders[2].addOrderItem(orderItem);
                    } else if (deliveryDay == 1) {
                        orders[1].addOrderItem(orderItem);
                    }


                    for (int i = 0; i < orders.length; i++) {
//                        orders[i].printOrderItems();
                        orders[i].getTotal();
                    }

                    break;

                case "done":
                    break;


            }


        } while (option != "done");


    }
}
