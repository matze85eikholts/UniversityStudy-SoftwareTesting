package BusinessLayer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ITripTest {

    @Test
    void testGetWholePrice() {
        ITrip tripInterface = new ITrip() {
            @Override
            public float getWholePrice() {
                return ITrip.super.getWholePrice();
            }
        };
        assertEquals(0, tripInterface.getWholePrice());
    }
}