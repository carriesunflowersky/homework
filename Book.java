package com.homework_SSIbackend.week01;

import java.util.Date;

public class Book {
    //1)Given a database table “Book” with columns (id, isbn, name, author, publish date),
    // define a java class that matches this table and then use a static block to initialize this
    // table with some records
    int i = 1;
    static {
        String id = "0102104343755";
        String isbn = "978-0-8234-4345-1";
        String name = "I don't care";
        String author = "Julie Fogliano";
        Date publishdate =new Date(2022-01-10);
        System.out.println("This book is: "+id+" "+isbn+" "+name+" "+author+" "+publishdate);
    }

}

class E{
    public static void main(String[] args) {
        Book b = new Book();
        System.out.println(b.i);

    }
}
