package implementations;

import interfaces.IMoney;

public class MoneyImpl implements IMoney {
     static int amountEarned = 0;
    @Override
    public void moneyCollector(int money) {
        amountEarned += money;
    }
    public static int getAmountEarned(){
        return amountEarned;
    }

}
