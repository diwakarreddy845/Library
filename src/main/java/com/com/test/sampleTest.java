package com.com.test;

import com.diwakar.spring.Library.Book;
import com.diwakar.spring.Library.BookStore;
import com.diwakar.spring.Library.Bookshop;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sampleTest {

    public static void main(String[] args) {

        List<Book> myList10 = new ArrayList<>();
        myList10.add(new Book(1, "aaa", "aaa"));
        myList10.add(new Book(2, "bbb", "bbb"));
        myList10.add(new Book(3, "ccc", "ccc"));
        myList10.add(new Book(4, "ddd", "ddd"));

        Bookshop bookshop1 = new Bookshop();
        bookshop1.setListofBooks(myList10);

        BookStore bookStore1 = new BookStore();
        bookStore1.setBookshops(bookshop1);
        List<BookStore> bookstoreList = new ArrayList<>();
        bookstoreList.add(bookStore1);

        List<Book> myList20 = new ArrayList<>();
        myList20.add(new Book(1, "aaa", "aaa"));
        myList20.add(new Book(2, "bbb", "bbb"));
        myList20.add(new Book(3, "ggg", "ggg"));
        myList20.add(new Book(4, "hhh", "hhh"));

        Bookshop bookshop2 = new Bookshop();
        bookshop2.setListofBooks(myList20);
        BookStore bookStore2 = new BookStore();
        bookStore2.setBookshops(bookshop2);

        bookstoreList.add(bookStore2);

        //bookstoreList.add(bookStore3);

        System.out.println(checkIfDataSourceHasSameLDS(bookstoreList));
       /* //listOfList.add(myList30);

        for (int i = 1; i <= listOfList.size() - 1; i++) {
            List<Book> distinctele = Stream.concat(listOfList.get(i - 1).stream(), listOfList.get(i - 1).stream())
                                           .distinct().collect(Collectors.toList());
            if (listOfList.get(i - 1).size() + listOfList.get(i).size() != distinctele.size()) {

            }
        }*/
    }

    public static boolean checkIfDataSourceHasSameLDS(List<BookStore> dataSources){
        List<BookStore> ldsCarList = dataSources;
        List<Book> commons = new ArrayList<>();
        if(ldsCarList != null && ldsCarList.size() > 1) {
            for (int i = 1; i <= ldsCarList.size() - 1; i++) {
                if(ldsCarList.get(i - 1).getBookshops() != null) {
                    List<Book> baseList = ldsCarList.get(i - 1).getBookshops().getListofBooks();

                    ldsCarList.get(i).getBookshops().getListofBooks()
                              .stream()
                              .forEach(ildsCharacteristic -> commons.addAll(baseList
                                                                                 .stream()
                                                                                 .filter(p -> p.getName().equals(ildsCharacteristic.getName()))
                                                                                 .collect(Collectors.toList())));

                }
            }
        }



        return commons.size() > 0 ? true : false;
    }

 /*   public static boolean checkIfDataSourceHasSameLDS(List<BookStore> dataSources){
        List<Book> listOne;
        List<Book> listTwo;
        if(dataSources != null && dataSources.size() > 1) {

            dataSources.stream().forEach(d -> d.getBookshops().getListofBooks().stream().);

            for (BookStore bookStore : dataSources) {
                if(dataSources.get(i - 1).getBookshops() != null) {
                    listOne = dataSources.get(i-1).getBookshops().getListofBooks();
                    listTwo = dataSources.get(i).getBookshops().getListofBooks();
                    List<Book> distinctList = Stream.concat(listOne.stream(), listTwo.stream()).distinct()
                                                                  .collect(Collectors.toList());
                    if (listOne.size() + listTwo.size() != distinctList.size()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

      List<Book> myList30 = new ArrayList<>();
        myList30.add(new Book(1, "www", "www"));
        myList30.add(new Book(2, "qqq", "qqq"));
        myList30.add(new Book(3, "xxx", "xxx"));
        myList30.add(new Book(4, "zzz", "zzz"));

        Bookshop bookshop3 = new Bookshop();
        bookshop3.setListofBooks(myList30);


        BookStore bookStore3 = new BookStore();
        bookStore3.setBookshops(bookshop3);
    */
}


/*
if (a.size() != b.size()) {
    return false;
    }
    for (int i = 0; i < a.size(); i++) {
    if (a.get(i).size() != b.get(i).size()) {
    return false;
    }
    for (int k = 0; k < a.get(i).size(); k++) {
    if(!a.get(i).get(k).equals(b.get(i).get(k))) {
    return false;
    }
    }
    }
    return true;
    }*/
