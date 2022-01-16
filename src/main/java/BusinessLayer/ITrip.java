package BusinessLayer;

public interface ITrip {
    default float getWholePrice() {
        return 0;
    }
}
