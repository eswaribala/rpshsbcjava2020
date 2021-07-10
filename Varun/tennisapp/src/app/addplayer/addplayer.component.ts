import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-addplayer',
  templateUrl: './addplayer.component.html',
  styleUrls: ['./addplayer.component.css']
})
export class AddplayerComponent implements OnInit {

  private tennisId: FormControl;
  private tournamentId: FormControl;
  private location: FormControl;
  private date: FormControl;
  private matchNo:FormControl;
  private winnerName: FormControl;
  private playerGroup: FormGroup ;

  constructor( private formBuilder:FormBuilder) {

    this.tennisId= new FormControl('',[Validators.required,Validators.min(1)]);
    this.tournamentId = new FormControl('',[Validators.required,Validators.pattern("[A-Za-z0-9]+")]);
    this.location = new FormControl('',[Validators.required,Validators.pattern("[A-za-z]{5,50}")]);
    this.date = new FormControl('',[Validators.required]);
    this.matchNo= new FormControl('',[Validators.required,Validators.min(1)]);
    this.winnerName = new FormControl('',[Validators.required,Validators.pattern("[A-za-z]{3,50}")]);

    this.playerGroup = formBuilder.group({tennisId:this.tennisId,
      tournamentId:this.tournamentId,
      location:this.location,
      date:this.date,
      matchNo:this.matchNo,
      winnerName:this.winnerName
    })
  }

  ngOnInit() {
  }

}
