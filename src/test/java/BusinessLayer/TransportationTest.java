package BusinessLayer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportationTest {
    Transportation transport1 = new Transportation(1,true);
    Transportation transport2 = new Transportation(1, false);

    @Test
    void testGetVisaPrice() {
        transport1.setVisaNeeded(true);
        transport1.setVisaPrice(1);
        assertEquals(1, transport1.getVisaPrice());
        transport1.setVisaNeeded(false);
        transport1.setVisaPrice(1);
        assertEquals(0, transport1.getVisaPrice());
    }

    @Test
    void getDiscount() {
    }

    @Test
    void getTransportPrice() {
    }

    @Test
    void getPrice() {
    }
}