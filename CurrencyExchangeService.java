package com.homework_SSIbackend.week02.designPattern;

public class CurrencyExchangeService {
    public static void main(String[] args) {
        CurrencyExchangeFactory currencyExchangeFactory = new CurrencyExchangeFactory();
        CurrencyExchange currencyExchange = currencyExchangeFactory.getExchange("EUR");
        currencyExchange.exchange();

    }
}
