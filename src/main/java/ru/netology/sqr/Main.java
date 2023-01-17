package ru.netology.sqr;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.calculate(0, 9801));
    }
}