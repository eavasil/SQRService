package ru.netology.sqr;

public class SQRService {

    public int calculate(int downLimit, int upLimit) {
        int sum = 0;
        for (int number = 10; number <= 99; number++) {
            if (number * number >= downLimit && number * number <= upLimit) {
                sum = sum + 1;
            }
        }
        return sum;
    }
}



