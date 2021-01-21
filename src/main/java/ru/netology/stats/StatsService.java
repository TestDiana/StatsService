package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] purchases) {

        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int calculateAverageSum(int[] purchases) {

        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        int averagesum = sum/ purchases.length;
        return averagesum;
    }

    public int calculateMaxMonth(int[] purchases) {

        int max = purchases[0];
        for (int purchase : purchases) {
            if (max < purchase) {
                max = purchase;
            }
        }
        int month = 0;
        int maxMonth = 0;
        for (int purchase : purchases) {
            maxMonth++;
            if (purchase == max) {
                month = maxMonth;

            }
        }

        return month;
    }

    public int calculateMinMonth(int[] purchases) {

        int min = purchases[0];
        for (int purchase : purchases) {
            if (min > purchase) {
                min = purchase;
            }
        }
        int month = 0;
        int minMonth = 0;
        for (int purchase : purchases) {
            minMonth++;
            if (purchase == min) {
                month = minMonth;

            }
        }
        return month;
    }


    public int MonthCountMoreThanAverage(int[] purchases) {

        int avg = calculateAverageSum(purchases);
        int monthCount = 0;
        for (int purchase : purchases) {
            if (purchase > avg) {
                monthCount++;
            }
        }
        return monthCount;


    }

    public int MonthCountLessThanAverage(int[] purchases) {

        int avg = calculateAverageSum(purchases);
        int monthCount = 0;
        for (int purchase : purchases) {
            if (purchase < avg) {
                monthCount++;
            }
        }
        return monthCount;


    }
}

