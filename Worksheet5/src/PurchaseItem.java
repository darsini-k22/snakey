public class PurchaseItem {
    private String name;
    private double unitPrice;
    PurchaseItem(String name,double unitPrice){
        this.name=name;
        this.unitPrice=unitPrice;
    }

    PurchaseItem(){
        this("no name",0.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return name + " @ " + unitPrice ;
    }
}

class WeightItem extends PurchaseItem{
    private double weight;
    WeightItem(String name,double unitPrice,double weight){
        super(name,unitPrice);
        this.weight=weight;
    }

    double getPrice(){
        return super.getUnitPrice()*weight;
    }

    @Override
    public String toString() {
        return super.toString()+" "+weight+" Kg"+" "+getPrice()+" SR";
    }
}

class CountedItem extends PurchaseItem{
    private int quantity;
    CountedItem(String name,double unitPrice,int quantity){
        super(name,unitPrice);
        this.quantity=quantity;
    }

    double getPrice(){
        return super.getUnitPrice()*quantity;
    }

    @Override
    public String toString() {
        return super.toString()+" "+quantity+" units"+" "+getPrice()+" SR";
    }
}

