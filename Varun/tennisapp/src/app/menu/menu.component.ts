import { Component, OnInit } from '@angular/core';
import {TennisService} from '../services/tennis.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  private tennisData:any;
  constructor(private tennisService:TennisService) { }

  ngOnInit() {
    this.tennisData=this.tennisService.getTennisData();
  }

}
