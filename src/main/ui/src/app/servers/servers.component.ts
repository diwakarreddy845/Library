import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-servers',
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.css']
})
export class ServersComponent implements OnInit {

  constructor() { }


  servers =["srver1", "servr2"]

  ngOnInit() {
  }
  serverName="";
  servercreated=false;
  

  clearservername(){
      this.servercreated=true;
      this.servers.push(this.serverName);
  }

  getError(){
    return this.serverName.length < 1 ? "yellow": "black";
  }
 
}
