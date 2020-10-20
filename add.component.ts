import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddFoodItemsComponent implements OnInit {
  private itemCode:FormControl;
  private name:FormControl;
  private qty:FormControl;
  private unitPrice:FormControl;
  private dateOfManufacturing:FormControl;
  private dateOfExpiry:FormControl;
  private vegetarian:FormControl;
  private type:string[]=['YES','NO'];
  private foodItemGroup:FormGroup;
  selectedType: any;
  private vegType:string;
  constructor(private formBuilder:FormBuilder) {
    this.itemCode=new FormControl('',[Validators.required
    ,Validators.pattern("[0-9]{1,5}")]);
    this.name=new FormControl('',[Validators.required
      ,Validators.pattern("[a-zA-Z]{5,50}")]);
    this.qty=new FormControl('',[Validators.required
      ,Validators.pattern("[0-9]{1,5}")]);
    this.unitPrice=new FormControl('',[Validators.required
      ,Validators.pattern("[0-9]{1,5}")]);
    this.dateOfManufacturing=new FormControl('',[Validators.required]);
     this.dateOfExpiry= new FormControl('',[Validators.required]);
     this.vegetarian=new FormControl('',[Validators.required]);
     this.foodItemGroup=this.formBuilder.group({
       itemCode:this.itemCode,
       name:this.name,
       qty:this.qty,
       unitPrice:this.unitPrice,
       dateOfManufacturing:this.dateOfManufacturing,
       dateOfExpiry:this.dateOfExpiry

     })
  }

  ngOnInit() {
  }

  addFoodItem() {
    let obj={
      itemCode:this.foodItemGroup.value.itemCode,
      name:this.foodItemGroup.value.name,
      qty:this.foodItemGroup.value.qty,
      unitPrice:this.foodItemGroup.value.unitPrice,
      dateOfManufacturing:this.foodItemGroup.value.dateOfManufacturing,
      dateOfExpiry:this.foodItemGroup.value.dateOfExpiry,
      vegetarian:this.vegType
    }
     console.log(obj);
  }

  typeChanged() {
    console.log(this.selectedType)
    this.vegType=this.selectedType;
  }
}
