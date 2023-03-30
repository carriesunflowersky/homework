package com.homework_SSIbackend.week02.designPattern;

public class CurrencyExchangeFactory {
    public CurrencyExchange getExchange(String currency){
        if(currency ==null||currency.isEmpty()){
            return null;
        }
        switch (currency){
            case "EUR":
                return new EURToUSD();
            case "GBP":
                return new GBPToUSD();
            case "JPY":
                return new JPYToUSD();
            default:
                throw new IllegalArgumentException("unknown currency "+currency);
        }
    }
}
