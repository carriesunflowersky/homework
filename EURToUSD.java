package com.homework_SSIbackend.week02.designPattern;

public class EURToUSD implements CurrencyExchange{

    @Override
    public void exchange() {
        System.out.println("EUR to USD is 1:1.06044");
    }
}
