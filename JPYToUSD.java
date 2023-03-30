package com.homework_SSIbackend.week02.designPattern;

public class JPYToUSD implements CurrencyExchange{

    @Override
    public void exchange() {
        System.out.println("JPY to USD is 1:0.00752");
    }
}
