package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int peakSales(int[] sales) {
        int peakMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[peakMonth]) {
                peakMonth = month;
            }
            month = month + 1;
        }
        return peakMonth + 1;
    }


    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverage(int[] sales) {
        int average = findAvg(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < average) {
                month++;
            }
        }
        return month;
    }

    public int aboveAverage(int[] sales) {
        int average = findAvg(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month;
    }
}
