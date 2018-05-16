import { Component, OnInit, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  @Output() selectNavItem = new EventEmitter<string>();



  constructor() { }

  ngOnInit() {
  }

  onNavigationSelect(selectI: string) {
    this.selectNavItem.emit(selectI);
  }

}
