import { Component, OnInit } from '@angular/core';
import { Author} from '../author.model';

@Component({
  selector: 'app-authors-list',
  templateUrl: './authors-list.component.html',
  styleUrls: ['./authors-list.component.css']
})
export class AuthorsListComponent implements OnInit {

  authorsListModels : Author[];
  constructor() {

    this.authorsListModels = [
      new Author("diwakar", 
      "this desdc", 
      "https://collegecures.com/wp-content/uploads/2011/01/small-vs-large1.jpg")
    ];

   }

  ngOnInit() {
  }

}
