package ru.netology.sqr;

public class SQRService {
    public int calculate ( int bottomLine , int upperLine) {
        int sum = 0;
        for (int i = 10 ; i <= 99; i++){
            if ((i * i) >= bottomLine && (i * i) <= upperLine)
                sum++;
            else continue;
        }
        return sum;
    }
}
