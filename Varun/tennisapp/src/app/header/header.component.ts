import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  private title: string;
  private logo: string;
  constructor() {
    this.title = 'Tennis Championship 2019-2020';
    this.logo = '../assets/tennislogo.png';
  }

  ngOnInit() {
  }

}
