package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatServiceTest {

    // Тестируем расчет суммы продаж
    @Test
    public void calculateSumSalesTest() {
        // Задаем тестовый массив данных
        int[] salesTest = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        // Созданем переменную класса StatsService
        StatsService service = new StatsService();

        // Задаем ожидаемый результат
        int expectedSumSales = 180;

        // Считаем сумму продаж за указанный период
        int actualSumSales = service.calculateSumSales(salesTest);

        // Сравниваем фактический результат и ожидаемый вариант
        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    // Тестируем расчет средней суммы продаж
    @Test
    public void calculateAwerageSumSalesInMonthTest() {
        // Задаем тестовый массив данных
        int[] salesTest = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        // Созданем переменную класса StatsService
        StatsService service = new StatsService();

        // Задаем ожидаемый результат
        double expectedAwerageSumSalesInMonth = 15.0;

        // Считаем среднюю сумму продаж за указанный период
        double actualAwerageSumSalesInMonth = service.calculateAwerageSumSalesInMonth(salesTest);

        // Сравниваем фактический результат и ожидаемый вариант
        Assertions.assertEquals(expectedAwerageSumSalesInMonth, actualAwerageSumSalesInMonth);
    }

    // Тестируем расчет месяца - пика продаж
    @Test
    public void calculateMonthMaxSalesTest() {
        // Задаем тестовый массив данных
        int[] salesTest = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        // Созданем переменную класса StatsService
        StatsService service = new StatsService();

        // Задаем ожидаемый результат
        int expectedMonthMaxSales = 8;

        // Считаем месяц максимальных продаж за указанный период
        int actualMonthMaxSales = service.calculateMonthMaxSales(salesTest);

        // Сравниваем фактический результат и ожидаемый вариант
        Assertions.assertEquals(expectedMonthMaxSales, actualMonthMaxSales);
    }

    // Тестируем расчет месяца минимальных продаж
    @Test
    public void calculateMonthMinSalesTest() {
        // Задаем тестовый массив данных
        int[] salesTest = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        // Созданем переменную класса StatsService
        StatsService service = new StatsService();

        // Задаем ожидаемый результат
        int expectedMonthMinSales = 9;

        // Считаем месяц максимальных продаж за указанный период
        int actualMonthMinSales = service.calculateMonthMinSales(salesTest);

        // Сравниваем фактический результат и ожидаемый вариант
        Assertions.assertEquals(expectedMonthMinSales, actualMonthMinSales);
    }

    // Тестируем расчет месяца, в которых продажи ниже среднего
    @Test
    public void calculateAmountMonthWhereSalesLessAwerageTest() {
        // Задаем тестовый массив данных
        int[] salesTest = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        // Созданем переменную класса StatsService
        StatsService service = new StatsService();

        // Задаем ожидаемый результат
        int expectedAmountMonthWhereSalesLessAwerage = 5;

        // Считаем месяц максимальных продаж за указанный период
        int actualAmountMonthWhereSalesLessAwerage = service.calculateAmountMonthWhereSalesLessAwerage(salesTest);

        // Сравниваем фактический результат и ожидаемый вариант
        Assertions.assertEquals(expectedAmountMonthWhereSalesLessAwerage, actualAmountMonthWhereSalesLessAwerage);
    }

    // Тестируем расчет месяца, в которых продажи выше среднего
    @Test
    public void calculateAmountMonthWhereSalesMoreAwerageTest() {
        // Задаем тестовый массив данных
        int[] salesTest = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        // Созданем переменную класса StatsService
        StatsService service = new StatsService();

        // Задаем ожидаемый результат
        int expectedAmountMonthWhereSalesMoreAwerage = 5;

        // Считаем месяц максимальных продаж за указанный период
        int actualAmountMonthWhereSalesMoreAwerage = service.calculateAmountMonthWhereSalesMoreAwerage(salesTest);

        // Сравниваем фактический результат и ожидаемый вариант
        Assertions.assertEquals(expectedAmountMonthWhereSalesMoreAwerage, actualAmountMonthWhereSalesMoreAwerage);
    }
}
