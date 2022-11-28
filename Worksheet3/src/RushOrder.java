public class RushOrder extends Order {

    protected int deliveryDay;
    protected int deliveryCharge;

    RushOrder() {

        deliveryCharge = 0;
        deliveryDay = 0;
    }

    RushOrder(int deliveryDay) {
        super();

        this.deliveryDay = deliveryDay;
        this.deliveryCharge=0;

    }


    void setDeliveryCharge() {
        if (deliveryDay == 1) {
            deliveryCharge = 25;
        } else if (deliveryDay == 2) {
            deliveryCharge = 15;
        } else if (deliveryDay == 3) {
            deliveryCharge = 10;
        } else {
            deliveryCharge = 0;
        }
    }

    int getTotal() {
        setDeliveryCharge();
        if (super.getTotal() == 0) {
            return super.getTotal();
        }
        return super.getTotal() + deliveryCharge;

    }
}
