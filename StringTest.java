package com.homework_SSIbackend.week01;

public class StringTest {
    public static void main(String[] args) {
        //1) Given string “Algorithms”, return  “go” and “Algo” using substring
        String s = "Algorithms";
        String s1 = s.substring(2,4);
        System.out.println(s1);//go
        String s2 = s.substring(0,4);
        System.out.println(s2);//Algo

        //2)Given two strings, compare if these two two strings are equal
        // by comparing each character
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));

        //3)Given string “https://www.amazon.com/demo?test=abc”,
        // return [“https”,”www”,”amazon”,”com”,”demo”,”test”,”abc”]
        String str = "https://www.amazon.com/demo?test=abc";
        String[] stringArray = str.split("[://./?=]+");
        for(int i=0; i<stringArray.length;i++){
            System.out.println(stringArray[i]);
        }

        //4) Given a list of string array, combine them into one string sentence,
        // return the string sentence
        String[] stringArray02 = {"This","is","the","first","homework"};
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<stringArray02.length;i++){
            sb.append(stringArray02[i]+" ");
        }
        System.out.println(sb);



    }
}
