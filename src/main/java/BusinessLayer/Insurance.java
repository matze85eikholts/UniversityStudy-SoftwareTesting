package BusinessLayer;

public class Insurance implements ITravelComponent{
    private boolean isExtremal;
    private float InsurancePrice;
    public Insurance(boolean Extremal){
        this.isExtremal = Extremal;
    }

    public void setInsurancePrice(float insurancePrice) {
        if(isExtremal) {
            InsurancePrice = insurancePrice;
        } else {
            InsurancePrice = 0;
        }
    }

    @Override
    public float getPrice() {
        return this.InsurancePrice;
    }
}
