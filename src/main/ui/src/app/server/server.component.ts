import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-server',
  templateUrl: './server.component.html',
  styleUrls: ['./server.component.css']
})
export class ServerComponent implements OnInit {
  
  serverStatus=Math.random() > 0.5 ? "Online" : "Offline";
  serverColor="yellow";
  constructor() { 

  }

  ngOnInit() {
  }

  getColor(){
      return this.serverStatus ==="Online" ? "red" : "orange"
  }
}
