package ru.netology.stats;

public class StatsService {

    //1. Определение суммы всех продаж
    public int sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //2. Определение средней суммы продаж в месяц
    public int averageSumMonth(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        int average = sum / sales.length;
        return average;
    }

    //3. Определение номера месяца, в котором был пик продаж
    public int maxSales(long[] sales) {
        int max = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max]) {
                max = i;
            }
        }
        return max + 1;
    }

    //4. Определение номера месяца, в котором был минимум продаж
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //5. Определение количества месяцев, в которых продажи были ниже среднего
    public int countSalesBelowAverage(long[] sales) {
        int sum = 0; //Считаем сумму всех продаж
        for (long sale : sales) {
            sum += sale;
        }
        int average = sum / sales.length; //Считаем среднеее значение

        int count = 0; //Считаем количество месяцев
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    //6. Определение количества месяцев, в которых продажи были выше среднего
    public int countSalesAboveAverage(long[] sales) {
        int sum = 0; //Считаем сумму всех продаж
        for (long sale : sales) {
            sum += sale;
        }
        int average = sum / sales.length; //Считаем среднеее значение

        int count = 0; //Считаем количество месяцев
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}

