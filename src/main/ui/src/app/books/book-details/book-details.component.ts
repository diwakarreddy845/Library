import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import { Author } from '../../authors/author.model';

@Component({
  selector: 'app-book-details',
  templateUrl: './book-details.component.html',
  styleUrls: ['./book-details.component.css']
})
export class BookDetailsComponent implements OnInit {

  @Output() bookAdded = new EventEmitter<{ name: string, author: string, description: string }>();
  @Output() bookRemoved = new EventEmitter<{  name: string, author: string, description: string }>();
  constructor() { }

  bookName = "";
  bookAuthor = "";
  bookDescription = "";

  ngOnInit() {
  }

  addServer(inputValue : string) {
    this.bookAdded.emit({
      name:inputValue,
      author:this.bookAuthor,
      description:this.bookDescription
    });
  }

  removeServer() {
    this.bookRemoved.emit({
      name:this.bookName,
      author:this.bookAuthor,
      description:this.bookDescription
    });
  }
}
