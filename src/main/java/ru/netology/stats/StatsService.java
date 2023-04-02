package ru.netology.stats;

public class StatsService {

    // Метод расчета суммы продаж за указанный период
    public int calculateSumSales(int[] Sales) {
        int amounts = 0;                                // Обнуляем счетчик сумм продаж
        for (int month = 0; month < Sales.length; month++) {
            amounts += Sales[month];                    // Увеличиваем сумму продаж на продажи за каждый месяц
        }
        return amounts;
    }

    // Метод расчета средней суммы продаж в месяц
    public double calculateAwerageSumSalesInMonth(int[] Sales) {
        // Считаем сумму продаж за указанный период
        int amounts = 0;                                // Обнуляем счетчик сумм продаж
        for (int month = 0; month < Sales.length; month++) {
            amounts += Sales[month];                    // Увеличиваем сумму продаж на продажи за каждый месяц
        }
        // Считаем среднюю суммму продаж за месяц
        double awerage = (amounts / Sales.length);

        return awerage;
    }

    // Метод расчета месяца - пика продаж
    public int calculateMonthMaxSales(int[] Sales) {
        int indexMaxValue = 0;                          // Обнуляем индекс месяца с пиком продаж
        for (int month = 0; month < Sales.length; month++) {
            if (Sales[indexMaxValue] <= Sales[month]) {
                indexMaxValue = month;
            }
        }
        return indexMaxValue += 1;                      // В обществе номера месяцев года принято считать с "1"
    }                                                   // В нашем массиве индексы, фактически номера месяцев считаются с "0"

    // Метод расчета месяца - минимум продаж
    public int calculateMonthMinSales(int[] Sales) {
        int indexMinValue = 0;                          // Обнуляем индекс месяца с минимумом продаж
        for (int month = 0; month < Sales.length; month++) {
            if (Sales[indexMinValue] >= Sales[month]) {
                indexMinValue = month;
            }
        }
        return indexMinValue += 1;                      // В обществе номера месяцев года принято считать с "1"
    }                                                   // В нашем массиве индексы, фактически номера месяцев считаются с "0"

    // Метод расчета количества месяцев, в которых продажи ниже среднего значания
    public int calculateAmountMonthWhereSalesLessAwerage(int[] Sales) {
        // Считаем среднее значение продаж
        int amounts = 0;                                // Обнуляем счетчик сумм продаж
        for (int month = 0; month < Sales.length; month++) {
            amounts += Sales[month];                    // Увеличиваем сумму продаж на продажи за каждый месяц
        }
        double awerage = (amounts / Sales.length);      // Расчет среднего значения продаж
        // Считаем количество месяцев с продажами ниже среднего
        int amountsMonthLessAwerage = 0;
        for (int month = 0; month < Sales.length; month++) {
            if (Sales[month] < awerage) {
                amountsMonthLessAwerage += 1;            // Увеличиваем счетчик месяцев, удовлетворяющих условию
            }
        }
        return amountsMonthLessAwerage;                  // Возвращаем количество месяцев, в кот. продажи ниже среднего
    }

    // Метод расчета количества месяцев, в которых продажи выше среднего значания
    public int calculateAmountMonthWhereSalesMoreAwerage(int[] Sales) {
        // Считаем среднее значение продаж
        int amounts = 0;                                // Обнуляем счетчик сумм продаж
        for (int month = 0; month < Sales.length; month++) {
            amounts += Sales[month];                    // Увеличиваем сумму продаж на продажи за каждый месяц
        }
        double awerage = (amounts / Sales.length);      // Расчет среднего значения продаж
        // Считаем количество месяцев с продажами выше среднего
        int amountsMonthMoreAwerage = 0;
        for (int month = 0; month < Sales.length; month++) {
            if (Sales[month] > awerage) {
                amountsMonthMoreAwerage += 1;            // Увеличиваем счетчик месяцев, удовлетворяющих условию
            }
        }
        return amountsMonthMoreAwerage;                  // Возвращаем количество месяцев, в кот. продажи ниже среднего
    }
}
