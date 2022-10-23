package ru.metology.sqr;

public class SQRService {

    public int sqrCount (int minValue, int maxValue){

        int mySqrCounts = 0; // переменная, где будем считать количество попавших в условие значений

        if (minValue > maxValue) { return -1;}

        for (int i = 10 ; i < 100 ; i++){
            if (((i*i) > minValue) & ((i*i) < maxValue)) { mySqrCounts++;}
        }
        return mySqrCounts;
    }

}
