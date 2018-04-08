package com.diwakar.spring.Library.controller;

import com.diwakar.spring.Library.doamin.Book;
import com.diwakar.spring.Library.service.BooksService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private BooksService booksService;



    @RequestMapping("/hello")
    public String getWelcomeMessage(){
        return "Diwakar";
    }


    @RequestMapping("/books")
    public List getListBooks(){
        return booksService.getAllBooks();
    }

    @RequestMapping("book/{id}")
    public Book getBookById(@PathVariable int id){
        return booksService.getBookById(id);
    }

   /* @RequestMapping("/book/{name}")
    public Book getBookByName(@PathVariable String name){
        return booksService.getBookByName(name);
    }*/

    @RequestMapping(method = RequestMethod.POST, value = "/book")
    public void getBookByName(@RequestBody Book name){
         booksService.addBook(name);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/book/{id}")
    public void UpdateBookById(@PathVariable int id,  @RequestBody Book book){
        booksService.updateBookById(id, book);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "/book/{id}")
    public void deleteBookById(@PathVariable int id){
        booksService.deleteBookById(id);
    }
}
