package implementations;

import constants.Cappu_Requirements;
import enums.IngredientType;
import interfaces.ICoffee;

import java.util.Scanner;

public class Cappuccino implements ICoffee {
    static int cappuccino_count = 0;
    @Override
    public void byCoffee() {
       IngredientProvider IngObject = IngredientProvider.getInstance();
       int waterneeded = IngredientProvider.IngredientsMap.get(IngredientType.water) - Cappu_Requirements.WATER;
       int milkneeded  = IngredientProvider.IngredientsMap.get(IngredientType.milk) - Cappu_Requirements.MILK;
       int beansneeded = IngredientProvider.IngredientsMap.get(IngredientType.coffeeBeans) - Cappu_Requirements.BEANS;
       if(waterneeded >= 0 && milkneeded >= 0 && beansneeded >= 0){
           IngredientProvider.IngredientsMap.put(IngredientType.water, IngredientProvider.IngredientsMap.get(IngredientType.water) - Cappu_Requirements.WATER);
           IngredientProvider.IngredientsMap.put(IngredientType.milk,IngredientProvider.IngredientsMap.get(IngredientType.milk) - Cappu_Requirements.MILK);
           IngredientProvider.IngredientsMap.put(IngredientType.coffeeBeans,IngredientProvider.IngredientsMap.get(IngredientType.coffeeBeans) - Cappu_Requirements.BEANS);
           int price = Cappu_Requirements.PRICE;
           System.out.println("Enter price : $"+price);
           Scanner sc = new Scanner(System.in);
           int userEnteredp = sc.nextInt();
               if(price < userEnteredp){
                   int change = userEnteredp - price;
                   int ischangepresent = MoneyImpl.getAmountEarned() - change;
                   if(ischangepresent >= 0) {
                       System.out.println("Collect your change :" + change);
                       System.out.println("Coffee served");
                       MoneyImpl money = new MoneyImpl();

                       money.moneyCollector(price);
                       ++Cappuccino.cappuccino_count;
                   }else{
                       System.out.println("Change not available try again with enough money");
                   }
               }else if(price == userEnteredp) {
                   System.out.println("Coffee served");
                   MoneyImpl money = new MoneyImpl();

                   money.moneyCollector(price);
                   ++Cappuccino.cappuccino_count;
               }else{
               System.out.println("!!please insert enough money and try again");
           }
       }else{
            System.out.println("Insufficient Ingredients");
            System.out.println("Please Go to other option for fill the Ingredients ");
       }
    }
}
