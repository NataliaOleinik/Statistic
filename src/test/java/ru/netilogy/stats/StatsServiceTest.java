package ru.netilogy.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void sumCalculate() {
        StatsService service = new StatsService();
        long [] purchase = {8, 15, 13, 15,17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumCalculate(purchase);
        assertEquals(expected, actual);
    }

    @Test
    void averageCalculate() {
        StatsService service = new StatsService();
        long [] purchase = {8, 15, 13, 15,17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageCalculate(purchase);
        assertEquals(expected, actual);
    }

    @Test
    void maximumPurchase() {
        StatsService service = new StatsService();
        long [] purchase = {8, 15, 13, 15,17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maximumPurchase(purchase);
        assertEquals(expected, actual);
    }

    @Test
    void minimumPurchase() {
        StatsService service = new StatsService();
        long [] purchase = {8, 15, 13, 15,17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minimumPurchase(purchase);
        assertEquals(expected, actual);
    }

    @Test
    void monthAmountUnderAverage() {
        StatsService service = new StatsService();
        long [] purchase = {8, 15, 13, 15,17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthAmountUnderAverage(purchase);
        assertEquals(expected, actual);
    }

    @Test
    void monthAmountOverAverage() {
        StatsService service = new StatsService();
        long [] purchase = {8, 15, 13, 15,17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthAmountUnderAverage(purchase);
        assertEquals(expected, actual);
    }
}