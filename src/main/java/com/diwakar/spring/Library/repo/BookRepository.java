package com.diwakar.spring.Library.repo;

import com.diwakar.spring.Library.doamin.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, String> {

}
