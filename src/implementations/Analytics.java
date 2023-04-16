package implementations;

import constants.Cappu_Requirements;
import constants.Espresso_Requirements;
import constants.Latte_Requirements;

public class Analytics {
    private final String pass = "@123#R";
    void showAnalytics(String pass){
        if(this.pass.equals(pass)){
            int capp_cup = Cappuccino.cappuccino_count;
            int Esp_cup = Espresso.Espresso_count;
            int Latt_cup = Latte.Latte_count;
            System.out.println("Total coffees sold: \n" +"Cappuccino cup: "+capp_cup+
                   "\nEspresso cup: "+Esp_cup+
                    "\nLatte cup: "+Latt_cup
                    );
            System.out.println("Total earnings: $" + MoneyImpl.amountEarned);
            System.out.println("Total ingredients consumed:");
            System.out.println("Water: " + ((capp_cup*Cappu_Requirements.WATER)+(Esp_cup* Espresso_Requirements.WATER)+(Latt_cup* Latte_Requirements.WATER)) + " ML");
            System.out.println("Milk: " + ((capp_cup*Cappu_Requirements.MILK)+(Esp_cup* Espresso_Requirements.MILK)+(Latt_cup* Latte_Requirements.MILK)) + " ML");
            System.out.println("Beans: " + ((capp_cup*Cappu_Requirements.BEANS)+(Esp_cup* Espresso_Requirements.BEANS)+(Latt_cup* Latte_Requirements.BEANS)) + " G");
        }else{
            System.out.println("PLease enter valid password");
        }
    }
}
