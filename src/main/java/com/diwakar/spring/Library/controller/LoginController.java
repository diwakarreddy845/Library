package com.diwakar.spring.Library.controller;

import com.diwakar.spring.Library.doamin.Book;
import com.diwakar.spring.Library.service.BooksService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
        return Arrays.asList(new Book(1,"The Truth", "Diwakar"),
                             new Book(2,"The True Human Being", "Diwakar"),
                             new Book(3,"Don't Lie to Yourself", "Diwakar"));
    }
}
