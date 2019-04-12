package ru.itpark.service;

public class CashbackService {
    public int calculateChashback(int purchaseAmount) {
        int percent = 5;
        int result = percent *purchaseAmount/100;
        int maxCashback = 3000;
        if(result > maxCashback) return maxCashback;
        return result;
    }
}
