package com.company;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        // write your code here


        ArrayList<Person> names = new ArrayList<>();


        Person kushan = new Person(1,0,2);
        Person alpha = new Person(1,0,2);
        Person beta = new Person(1,0,2);
        Person gama = new Person(1,0,2);
        Person perera = new Person(1,0,2);
        Person sanath = new Person(1,0,2);
        Person vaas = new Person(1,0,2);
        Person sanga = new Person(1,0,2);
        Person mahela = new Person(1,0,2);
        Person chandimal = new Person(1,0,2);
        Person aravinda = new Person(1,0,2);
        Person mathews = new Person(1,0,2);


        names.add(kushan);
        names.add(alpha);
        names.add(mahela);
        names.add(chandimal);

      for (Person p: names){
          System.out.println(p.getId());
      }


//
//        Book b1 = new Book("Three Muskateers");
//        Book b2 = new Book("Harry Potter and the Prisoner of Azkaban");
//        Book b3 = new Book("Harry Potter and the Elec Department");
//
//        System.out.println(b1.getCopies());
//        System.out.println(b2.getCopies());
//        System.out.println(b3.getCopies());
//
//

//        System.out.println(kushan.getId());
//        System.out.println(mathews.getId());

//        System.out.println(Person.count);
//        System.out.println(kushan.getCount());




    }
}
