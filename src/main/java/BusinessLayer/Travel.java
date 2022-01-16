package BusinessLayer;

public class Travel implements ITrip {
    private Excursion excursion;
    private Habitation habitation;
    private Insurance insurance;
    private Transportation transportation;
    public Travel(Excursion e, Habitation h, Insurance i, Transportation t){
        this.excursion = e;
        this.habitation = h;
        this.insurance = i;
        this.transportation = t;
    }

    public float getWholePrice() {
        return (excursion.getPrice() + habitation.getPrice() + insurance.getPrice() + transportation.getPrice());
    }
}

