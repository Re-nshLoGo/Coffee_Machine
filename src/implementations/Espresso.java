package implementations;

import constants.Cappu_Requirements;
import constants.Espresso_Requirements;
import enums.IngredientType;
import interfaces.ICoffee;

import java.util.Scanner;

public class Espresso implements ICoffee {
    static int Espresso_count = 0;
    @Override
    public void byCoffee() {
        int waterneeded = IngredientProvider.IngredientsMap.get(IngredientType.water) - Espresso_Requirements.WATER;
        int milkneeded  = IngredientProvider.IngredientsMap.get(IngredientType.milk) - Espresso_Requirements.MILK;
        int beansneeded = IngredientProvider.IngredientsMap.get(IngredientType.coffeeBeans) - Espresso_Requirements.BEANS;
        if(waterneeded >= 0 && milkneeded >= 0 && beansneeded >= 0){
//           System.out.println("done");
            IngredientProvider.IngredientsMap.put(IngredientType.water, IngredientProvider.IngredientsMap.get(IngredientType.water) - Espresso_Requirements.WATER);
            IngredientProvider.IngredientsMap.put(IngredientType.milk,IngredientProvider.IngredientsMap.get(IngredientType.milk) - Espresso_Requirements.MILK);
            IngredientProvider.IngredientsMap.put(IngredientType.coffeeBeans,IngredientProvider.IngredientsMap.get(IngredientType.coffeeBeans) - Espresso_Requirements.BEANS);
            int price = Espresso_Requirements.PRICE;
            System.out.println("Enter price : $"+price);
            Scanner sc = new Scanner(System.in);
            int userEnteredp = sc.nextInt();
            if(price <= userEnteredp){
                System.out.println("Coffee served");
                if(price < userEnteredp){
                    int change = userEnteredp - price;
                    System.out.println("Collect your change :"+change);
                }
                MoneyImpl money = new MoneyImpl();
                money.moneyCollector(price);
                ++Espresso_count;
            }else{
                System.out.println("!!please insert enough money");
            }
        }else{
            System.out.println("Insufficient Ingredients");
            System.out.println("Please Go to other option for fill the Ingredients ");
        }
    }

}

