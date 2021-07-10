import { Injectable } from '@angular/core';
import {footerMenuData} from '../models/models.footermenudata';

@Injectable({
  providedIn: 'root' //singleton object
})
export class FooterService {

  constructor() { }

  getFooterData():any
  {
    return footerMenuData;
  }

}
