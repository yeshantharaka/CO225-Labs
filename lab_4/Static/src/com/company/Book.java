package com.company;

/**
 * Created by Fawzan on 7/5/16.
 */
public class Book {


    private String name;
    private  int copies = 0;


    public Book(String name) {

        this.name = name;

        copies += 1;

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCopies() {
        return copies;
    }


}
