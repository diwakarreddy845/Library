import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-books-list',
  templateUrl: './books-list.component.html',
  styleUrls: ['./books-list.component.css']
})
export class BooksListComponent implements OnInit {

  bookList = [{ name: "The New Begining", author: "Diwakar", description: "this is new book" }];

  constructor() { }

  ngOnInit() {
  }

  addBook(bookData: { name: string, author: string, description: string }) {
    this.bookList.push({
      name: bookData.name,
      author: bookData.author,
      description: bookData.description
    });
  }

  removeBook(bookData: { name: string, author: string, description: string }) {
    this.bookList.pop();
  }




}
