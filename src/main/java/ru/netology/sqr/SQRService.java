package ru.netology.sqr;

public class SQRService {
    public long countSqrtInRange(long range1, long range2) {
        long counter = 0;
        for (int i = 10; i >= 10 && i <= 99; i++){
            if (i * i >= range1 && i * i <= range2){
                counter++;
            }
        }
        return counter;
    }
}
