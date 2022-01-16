package BusinessLayer;

public interface ITrip {
    default float getPrice() {
        return 0;
    }
}
