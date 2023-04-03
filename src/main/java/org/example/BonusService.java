package org.example;

public class BonusService {
    public long calculate (long amount, boolean registered) {
        int percent = registered ? 3:1;
        long limit = 500;
        long bonus = amount * percent / 100;
        if (bonus > 500) {
            bonus = limit;
        }
        return bonus;
    }
}
