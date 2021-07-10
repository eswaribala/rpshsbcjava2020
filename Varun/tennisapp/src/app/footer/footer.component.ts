import { Component, OnInit } from '@angular/core';
import {FooterService} from '../services/footer.service';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {

  private footerData:any;
  //dependency injection
  constructor(private footerService:FooterService) { }

  ngOnInit() {
    this.footerData=this.footerService.getFooterData();
  }

}
