import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Library';
  name = "10";


  getName() {
    return this.name;
  }

  navSelectedItem = "";

  navItemSelected(selectI: string) {
    this.navSelectedItem = selectI;
  }
}
