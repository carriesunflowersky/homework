package com.homework_SSIbackend.week01;

import java.util.ArrayList;

public class TrueFriends {
    //1)(Set)Find true friends: Given two arraylists containing friend names,
    // find the true friends that appear in both list.
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList();
        al1.add("Aby");
        al1.add("Bobby");
        al1.add("Cathy");
        al1.add("Daniel");

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Mike");
        al2.add("Nathan");
        al2.add("Tommy");
        al2.add("Cathy");

        for(int i=0;i<al1.size();i++){
            for(int j=0;j<al2.size();j++){
                if(al1.get(i).equals(al2.get(j))){
                    System.out.println("My true friend is "+al1.get(i));
                }
            }
        }
    }


}
