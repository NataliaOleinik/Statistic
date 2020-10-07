package ru.netilogy.stats;

public class StatsService {
    public long sumCalculate (long [] purchase) {
        long sum = 0;
        for (long purchase : purchase) {
            sum += purchase;
        }
        return sum;
    }
}
