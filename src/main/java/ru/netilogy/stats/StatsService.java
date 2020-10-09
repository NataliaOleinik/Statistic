package ru.netilogy.stats;

public class StatsService {
    public long sumCalculate (long [] purchase) {
        long sum = 0;
        for (long i: purchase){
            sum += i;
        }
        return sum;
    }

    public long averageCalculate (long [] purchase) {
        long average = sumCalculate(purchase) / purchase.length;
        return average;
    }

    public long maximumPurchase (long [] purchase) {
        long max = purchase[0];
        long indexOfMax = 0;
        for (int i = purchase.length - 1; i > 0; i--) {
            if (max < purchase[i]){
                max = purchase[i];
                indexOfMax = i +  1;
            }
        }
        return indexOfMax;
    }

    public long minimumPurchase (long [] purchase) {
        long min = purchase[0];
        long indexOfMin = 0;
        for (int i = purchase.length - 1; i > 0; i--) {
            if (min > purchase[i]) {
                min = purchase[i];
                indexOfMin = i + 1;
            }
        }
        return indexOfMin;
    }

    public long monthAmountUnderAverage (long [] purchase) {
        long lowMonth = averageCalculate(purchase);
        int lowMonthAmount = 0;
        for (int i = 0; i < purchase.length; i++){
            if (purchase[i] < lowMonth){
                lowMonthAmount++;
            }
        }
        return lowMonthAmount;
    }

    public long monthAmountOverAverage (long [] purchase) {
        long highMonth = averageCalculate(purchase);
        int highMonthAmount = 0;
        for (int i = 0; i < purchase.length; i++){
            if (purchase[i] > highMonth){
                highMonthAmount++;
            }
        }
        return highMonthAmount;
    }
}
