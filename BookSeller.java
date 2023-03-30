package com.homework_SSIbackend.week01;

import java.util.Date;

public class BookSeller {
    //2)Define a Java class “BookSeller” and then define a static inner class “Book”,
    // and use a static method “sellBooks” to initialize several books, and in the main
    // method display all the books by calling the “sellBooks” method

    static class Book{
        static void sellBooks(){
            String id = "0102104343755";
            String isbn = "978-0-8234-4345-1";
            String name = "I don't care";
            String author = "Julie Fogliano";
            Date publishdate =new Date(2022-01-10);
            System.out.println("This book is: "+id+" "+isbn+" "+name+" "+author+" "+publishdate);
        }
    }
}

class F{
    public static void main(String[] args) {
        BookSeller.Book.sellBooks();
    }
}
