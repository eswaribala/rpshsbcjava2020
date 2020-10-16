import { Injectable } from '@angular/core';
import {tennisMenuData} from '../models/models.tennismenudata';

@Injectable({
  providedIn: 'root'
})
export class TennisService {

  constructor() { }

  getTennisData():any
  {
    return tennisMenuData;
  }

}
