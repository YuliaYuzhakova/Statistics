package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class StatsServiceTest {

    //Тест к методу 1 - Определение суммы всех продаж
    @Test
    public void sumOfAllSales() {

        StatsService statistics = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = statistics.sum(sales);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(actual, expected);
    }

    //Тест к методу 2 - Определение средней суммы продаж в месяц
    @Test
    public void averageSumMonth() {

        StatsService statistics = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = statistics.averageSumMonth(sales);
        int expected = 15;

        Assertions.assertEquals(actual, expected);
    }

    //Тест к методу 3 - Определение номера месяца, в котором был пик продаж
    @Test
    public void monthSalesMax() {

        StatsService statistics = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = statistics.maxSales(sales);
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    //Тест к методу 4 - Определение номера месяца, в котором был минимум продаж
    @Test
    public void monthSalesMin() {
        StatsService statistics = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = statistics.minSales(sales);
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    //Тест к методу 5 -  Определение количества месяцев, в которых продажи были ниже среднего
    @Test
    public void countMonthSalesBelowAverage() {
        StatsService statistics = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = statistics.countSalesBelowAverage(sales);
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }

    //Тест к методу 6 -  Определение количества месяцев, в которых продажи были выше среднего
    @Test
    public void countMonthSalesAboveAverage() {
        StatsService statistics = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = statistics.countSalesAboveAverage(sales);
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }
}