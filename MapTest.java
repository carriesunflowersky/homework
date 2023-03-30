package com.homework_SSIbackend.week01;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    //2)(Map)Given a string, output duplicate characters and their counts
    public void countDuplicateCharacters(String str){
        Map<Character,Integer> map = new HashMap<>();
        char[] charArray = str.toCharArray();
        for(char c: charArray){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
    }
    public static void main(String[] args) {
        MapTest mt = new MapTest();
        String s = "monosodiumlglutamate";
        mt.countDuplicateCharacters(s);

    }
}
