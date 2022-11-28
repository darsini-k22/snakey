import java.util.ArrayList;
import java.util.List;

public class Order {

    private ArrayList<OrderItem> items;
    private int totalCost ;
    private int it=0;
//    private int totalItems;




    Order(int numberOfOrders) {
        this.items =new ArrayList<OrderItem>(numberOfOrders);

    }

    public Order() {
        this.items =new ArrayList<OrderItem>();

    }


    void addOrderItem(OrderItem item) {
//        items[it].setPrice(item.getPrice());
//        items[it].setUpc(item.getUpc());
//        items[it].setQuantity(item.getQuantity());
        items.add(item);
        it++;
//        totalItems++;

    }

    int getTotal() {

        for (int i = 0; i < items.size(); i++) {
            totalCost = totalCost + items.get(i).getPrice();
        }
        return totalCost;
    }

    void printOrderItems() {
        for (int i = 0; i < items.size(); i++) {
            items.get(i).toString();
        }
    }


}
