import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  isEnabled= true;
  constructor() { 
    setTimeout(() => {
      this.isEnabled = false;
    }, 3000);
  }

  ngOnInit() {
  }

}
