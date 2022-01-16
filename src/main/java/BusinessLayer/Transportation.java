package BusinessLayer;

public class Transportation implements ITravelComponent{
    private boolean isAbroad; // if the travel is inside of Russia, there is no discount
    private boolean VisaNeeded =false;
    private float discount = 0;
    private float VisaPrice = 0;
    private float TransportPrice = 0;
    public Transportation(float TransportPrice, boolean isAbroad) {
        this.TransportPrice = TransportPrice;
        this.isAbroad = isAbroad;
    }

    public void setVisaNeeded(boolean visaNeeded) {
        VisaNeeded = visaNeeded;
        if(!this.isAbroad){
            this.VisaNeeded = false;
        }
    }
    public void setDiscount(float discountPercentage){
        if(!isAbroad) {
            this.discount = 0;
        } else {
            this.discount = discountPercentage;
        }
    }

    public void setVisaPrice(float visaPrice) {
        setVisaNeeded(true);
        if(this.VisaNeeded) {
            VisaPrice = visaPrice;
        } else {
            VisaPrice = 0;
        }
    }

    public boolean getVisaNeeded(){
        return this.VisaNeeded;
    }

    public float getVisaPrice() {
        return VisaPrice;
    }

    public float getDiscount() {
        return discount;
    }

    public float getTransportPrice() {
        return TransportPrice;
    }

    public float getPrice(){
        float TransportPlusVisaPrice = getTransportPrice() + getVisaPrice();
        return TransportPlusVisaPrice * (1 - getDiscount());
    }
}
