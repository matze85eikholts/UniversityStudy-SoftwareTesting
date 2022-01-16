package BusinessLayer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsuranceTest {
    Insurance insure1 = new Insurance(false);
    Insurance insure2 = new Insurance(true);
    @Test
    void testSetGetInsurancePrice() {
        insure1.setInsurancePrice(100);
        assertEquals(0,insure1.getPrice());
        insure2.setInsurancePrice(100);
        assertEquals(100,insure2.getPrice());
    }

}