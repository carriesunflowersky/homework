package com.homework_SSIbackend.week01;

import java.util.HashMap;
import java.util.Map;

public class SimulateTables {
    //3)Use a map to simulate database table, key should be the primary key
    // (assume only one column), value is the record, your simulation should include CRUD
    // operation methods

    //CRUD: create, read, update, delete
    Map<Integer,String> map = new HashMap<>();

    public void create(int i,String str){
        if(map.containsKey(i)){
            System.out.println("same key is existed");
        }else{
            map.put(i,str);
            System.out.println("create successfully");
        }
    }

    public void read(int i){
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            if(entry.getKey().equals(i)){
                System.out.println(entry.getValue());
            }

        }
    }

    public void update(int i, String str){
        if(map.containsKey(i)){
            map.put(i,str);
        }else{
            System.out.println("Please check the key if correct.");
        }

    }

    public void delete(int i){
        if(map.containsKey(i)){
            map.remove(i);
            System.out.println(i+" is no longer existed");
        }
    }
    public static void main(String[] args) {
        SimulateTables st = new SimulateTables();
        st.create(1,"first");
        st.create(2,"second");
        st.read(2);
        st.update(2,"oneplusone");
        st.read(2);
        st.delete(2);
        st.read(2);


    }

}
