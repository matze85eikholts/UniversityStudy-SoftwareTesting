package BusinessLayer;

public class Excursion implements ITravelComponent{
    private int quantity =0;
    private float price = 0;
    public Excursion(int quantity, float priceOfExcursion){
        this.quantity = quantity;
        this.price = priceOfExcursion;
    }
    public float getPrice() {
        return quantity * price;
    }
}
