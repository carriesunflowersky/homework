package com.homework_SSIbackend.week02.designPattern;

public class GBPToUSD implements CurrencyExchange{

    @Override
    public void exchange() {
        System.out.println("GBP to USD is 1:1.20839");
    }
}
