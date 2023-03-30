package com.homework_SSIbackend.week02.designPattern;

public class AppleDesignerFactory {
    private static AppleDesignerFactory appleDesignerFactory;
    private AppleDesignerFactory(){

    }
    public static AppleDesignerFactory getInstance(){
        if(appleDesignerFactory == null){
            appleDesignerFactory = new AppleDesignerFactory();
        }
        return appleDesignerFactory;
    }

    public void mobilePhone(){
        System.out.println("This is method of mobilePhone");
    }
}
