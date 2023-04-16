package implementations;

import enums.IngredientType;
import interfaces.IIngredients;

import java.util.HashMap;

public class IngredientProvider implements IIngredients {

    static HashMap<IngredientType,Integer> IngredientsMap = new HashMap<>();
    private IngredientProvider(){
        IngredientsMap.put(IngredientType.milk,0);
        IngredientsMap.put(IngredientType.water,0);
        IngredientsMap.put(IngredientType.coffeeBeans,0);
    }
    private static IngredientProvider obj = null;
    public static IngredientProvider getInstance(){
        if(obj == null){
            obj = new IngredientProvider();
        }
        return obj;
    }
    static int moneyCollect = 0;
    @Override
    public void fillIngredients() {
        IngredientsMap.put(IngredientType.milk,(IngredientsMap.get(IngredientType.milk)+500));
        IngredientsMap.put(IngredientType.water,(IngredientsMap.get(IngredientType.water)+700));
        IngredientsMap.put(IngredientType.coffeeBeans,(IngredientsMap.get(IngredientType.coffeeBeans)+100));
    }
    @Override
    public void showIngredients(){
        System.out.println("Milk: "+IngredientsMap.get(IngredientType.milk));
        System.out.println("Water: "+IngredientsMap.get(IngredientType.water));
        System.out.println("Beans: "+IngredientsMap.get(IngredientType.coffeeBeans));
    }

}
