package ru.netology.stats;

public class StatsService {

    // Метод расчета суммы продаж за указанный период
    public int calculateSumSales(int[] sales) {
        int amounts = 0;
        for (int month : sales) {
            amounts += month;
        }
        return amounts;
    }

    // Метод расчета средней суммы продаж в месяц
    public double calculateAwerageSumSalesInMonth(int[] sales) {
        double amounts = calculateSumSales(sales) / sales.length;
        return amounts;
    }

    // Метод расчета месяца - пика продаж
    public int calculateMonthMaxSales(int[] sales) {
        int indexMaxValue = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[indexMaxValue] <= sales[month]) {
                indexMaxValue = month;
            }
        }
        return indexMaxValue += 1;                      // В обществе номера месяцев года принято считать с "1"
    }                                                   // В нашем массиве индексы, фактически номера месяцев считаются с "0"

    // Метод расчета месяца - минимум продаж
    public int calculateMonthMinSales(int[] sales) {
        int indexMinValue = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[indexMinValue] >= sales[month]) {
                indexMinValue = month;
            }
        }
        return indexMinValue += 1;                      // В обществе номера месяцев года принято считать с "1"
    }                                                   // В нашем массиве индексы, фактически номера месяцев считаются с "0"

    // Метод расчета количества месяцев, в которых продажи ниже среднего значания
    public int calculateAmountMonthWhereSalesLessAwerage(int[] sales) {
        double awerage = calculateAwerageSumSalesInMonth(sales);
        int amountsMonthLessAwerage = 0;
        for (int month : sales) {
            if (month < awerage) {
                amountsMonthLessAwerage += 1;
            }
        }
        return amountsMonthLessAwerage;                  // Возвращаем количество месяцев, в кот. продажи ниже среднего
    }

    // Метод расчета количества месяцев, в которых продажи выше среднего значания
    public int calculateAmountMonthWhereSalesMoreAwerage(int[] sales) {
        double awerage = calculateAwerageSumSalesInMonth(sales);
        int amountsMonthMoreAwerage = 0;
        for (int month : sales) {
            if (month > awerage) {
                amountsMonthMoreAwerage += 1;
            }
        }
        return amountsMonthMoreAwerage;                  // Возвращаем количество месяцев, в кот. продажи ниже среднего
    }
}
