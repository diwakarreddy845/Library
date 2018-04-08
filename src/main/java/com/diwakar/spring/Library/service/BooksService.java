package com.diwakar.spring.Library.service;

import com.diwakar.spring.Library.doamin.Book;
import com.diwakar.spring.Library.repo.BookRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {

    @Autowired
    public BookRepository bookRepository;


    private List<Book> booksList = new ArrayList<>(Arrays.asList(
                                        new Book(1, "The Truth", "Diwakar"),
                                        new Book(2, "The True Human Being", "Diwakar"),
                                        new Book(3, "Don't Lie to Yourself", "Diwakar")));

    public List<Book> getAllBooks() {
        List<Book> list = new ArrayList();
        bookRepository.findAll().forEach(list::add);
        return list;
    }

    public Book getBookById(long id){
        return bookRepository.findById(""+id).get();
    }

    /*public Book getBookByName(String name) {
        //return booksList.stream().filter(b -> b.getName().equals(name)).findFirst().get();
        return bookRepository.;
    }*/

    public void addBook(Book book) {
       // booksList.add(book);
        bookRepository.save(book);
    }

    public void updateBookById(int id, Book book){
        bookRepository.save(book);
        /*for(int i=0; i<booksList.size(); i++){
            if(booksList.get(i).getId() == id){
                booksList.set(i, book);
                return;
            }
        }*/
    }


    public void deleteBookById(int id){
        booksList.removeIf(b -> b.getId()==id);
    }
}