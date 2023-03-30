package com.homework_SSIbackend.week01;

import static com.homework_SSIbackend.week01.FinalTest.PI;

//Problems: define a final class and final method and final variable,
// modify the value of the variable in final method
public final class FinalTest {
    final static double PI = 3.141592654;
    final void study(){
        System.out.println("This is a final study method");
    }
}

/*
class A extends FinalTest{
    //error: class A cannot extends final class FinalTest;
}*/

class A{
    final void sleep(){
        System.out.println("This is a final sleep method");
    }
    public static void main(String[] args) {
        FinalTest ft = new FinalTest();
        ft.study();
        int i=10;
        System.out.println(i+PI);
        //PI=3;
        //try to modify the final instance PI and there is an error;
    }

}

class C extends A{
    /*void sleep(){
        //error:sleep() in class C cannot override sleep() in class A
    }*/
}
