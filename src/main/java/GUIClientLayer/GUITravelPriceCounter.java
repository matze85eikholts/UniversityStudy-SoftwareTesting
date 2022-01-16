package GUIClientLayer;

import BusinessLayer.*;

public class GUITravelPriceCounter {
    public static void main(String[] args){
        System.out.println("Hello World!");

        Transportation  transport = new Transportation(10000, false);
        transport.setVisaNeeded(false);
        transport.setDiscount(0);
        transport.setVisaPrice(0);
        Habitation habit = new Habitation(7, 2500);
        Excursion excursion = new Excursion(5, 200);
        Insurance insure = new Insurance(true);
        insure.setInsurancePrice(21300);
        Travel travelTrip = new Travel(excursion,habit,insure,transport);
        float TravelPrice = travelTrip.getWholePrice();
        System.out.println("Сумма всей поездки = "+TravelPrice);
    }
}
