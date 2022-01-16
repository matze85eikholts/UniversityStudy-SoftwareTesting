package BusinessLayer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TravelTest {

    @Test
    void testGetWholePrice() {
        Transportation  transport1 = new Transportation(1, false);
        transport1.setVisaNeeded(false);
        transport1.setDiscount(0);
        transport1.setVisaPrice(0);
        Habitation habit1 = new Habitation(1, 1);
        Excursion excursion1 = new Excursion(1, 1);
        Insurance insure1 = new Insurance(true);
        insure1.setInsurancePrice(1);
        Travel travelTrip = new Travel(excursion1,habit1,insure1,transport1);
        float TravelPrice = travelTrip.getWholePrice();
        assertEquals(4, TravelPrice);
    }
}