import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';

import { RouterModule, Routes } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { AuthorsComponent } from './authors/authors.component';
import { BooksComponent } from './books/books.component';
import { BooksListComponent } from './books/books-list/books-list.component';
import { BookDetailsComponent } from './books/book-details/book-details.component';
import { BookComponent } from './books/books-list/book/book.component';
import { AuthorsListComponent } from './authors/authors-list/authors-list.component';
import { AuthorComponent } from './authors/authors-list/author/author.component';
import { AuthorDetailsComponent } from './authors/author-details/author-details.component';
import { ShoppingListComponent } from './shopping-list/shopping-list.component';
import { ShoppingEditComponent } from './shopping-list/shopping-edit/shopping-edit.component';
import { HighlightDirective } from './directives/highlight.directive';



const appRoutes: Routes = [];

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    AuthorsComponent,
    BooksComponent,
    BooksListComponent,
    BookDetailsComponent,
    BookComponent,
    AuthorsListComponent,
    AuthorComponent,
    AuthorDetailsComponent,
    ShoppingListComponent,
    ShoppingEditComponent,
    HighlightDirective,
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
