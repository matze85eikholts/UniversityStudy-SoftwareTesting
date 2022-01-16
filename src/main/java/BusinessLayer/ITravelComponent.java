package BusinessLayer;

public interface ITravelComponent {
    default float getPrice() {
        return 0;
    }
}
