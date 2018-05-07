import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {
  bookList = [{ name: "The New Begining", author: "Diwakar", description: "this is new book" }];

  constructor() { }

  ngOnInit() {
  }

  // addBook(bookData: { name: string, author: string, description: string }) {
  //   this.bookList.push({
  //     name: bookData.name,
  //     author: bookData.author,
  //     description: bookData.description
  //   });
  // }

  // removeBook(bookData: { name: string, author: string, description: string }) {
  //   this.bookList.pop();
  // }

}
