package BusinessLayer;

public class Habitation implements ITravelComponent{
    private int numberOfDays;
    private float pricePerDay;
    public Habitation(int days, float priceForOneDay){
        this.numberOfDays = days;
        this.pricePerDay = priceForOneDay;
    }
    @Override
    public float getPrice() {
        return numberOfDays*pricePerDay;
    }
}
