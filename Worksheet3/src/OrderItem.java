public class OrderItem {
    protected String upc;
    protected  int quantity;
   protected int price;

    OrderItem(){
        this.upc="";
        this.price=0;
        this.quantity=0;
    }

    OrderItem(String upd,int price,int quantity){
        this.upc=upd;
        this.price=price;
        this.quantity=quantity;
    }



    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    int getCost(){
        return quantity*price;
    }

    @Override
    public String toString() {
        return upc+" "+quantity+" "+price;
    }
}