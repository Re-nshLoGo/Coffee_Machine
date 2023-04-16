package implementations;

import java.util.Scanner;

public class MadeCoffee {

    public void CoffeeMachine(){
        System.out.println("Welcome to Coffee Machine Simulator!");
//        System.out.println("1. Cappuccino \n2. Espresso \n3. Latte \n4. Other \n5. Exit");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Cappuccino \n2. Espresso \n3. Latte \n4. Other \n5. Exit \n6. Analytics");
            System.out.println("Choose an option");
            int op = sc.nextInt();
            if (op == 1) {
                Cappuccino c = new Cappuccino();
                c.byCoffee();
            } else if (op == 2) {
                Espresso c = new Espresso();
                c.byCoffee();
            } else if (op == 3) {
                Latte c = new Latte();
                c.byCoffee();
            } else if (op == 4) {
                System.out.println("1. Fill \n2. Show \n3. exit");
                while(true){
                    int in = sc.nextInt();
                    if(in == 1){
                        IngredientProvider ing = IngredientProvider.getInstance();
                        ing.fillIngredients();
                        System.out.println("Ingredients filled now exit and choose your coffee type");
                    } else if (in == 2) {
                        IngredientProvider ing = IngredientProvider.getInstance();
                        ing.showIngredients();
                    }else if(in == 3){
                        System.out.println("Exited");
                        break;
                    }else{
                        System.out.println("Please enter 3 for exit");
                    }
                }

            } else if(op == 5){
                break;
            }else if(op == 6){
                System.out.println("This is only for admin .... \n Please enter password");
                String pass = sc.next();
                Analytics an = new Analytics();
                an.showAnalytics(pass);

            }else{
                System.out.println("Invalid option");
            }
        }
    }

}
