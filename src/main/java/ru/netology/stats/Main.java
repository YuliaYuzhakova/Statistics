package ru.netology.stats;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual1 = service.sum(sales);
        int actual2 = service.averageSumMonth(sales);
        int actual3 = service.maxSales(sales);
        int actual4 = service.minSales(sales);
        int actual5 = service.countSalesBelowAverage(sales);
        int actual6 = service.countSalesAboveAverage(sales);

        System.out.println("Сумма всех продаж " + actual1
                + " Средняя сумма продаж в месяц " + actual2
                + " Месяц пик продаж " + actual3
                + " Месяц минимум продаж " + actual4
                + " Кол-во месяцев прожади ниже среднего " + actual5
                + " Кол-во месяцев прожади выше среднего " + actual6);
    }
}
