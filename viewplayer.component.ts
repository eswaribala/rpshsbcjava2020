import {AfterViewInit, Component, OnInit, ViewChild} from '@angular/core';
import {PlayerService} from '../services/player.service';
import {MatPaginator, MatSort, MatTableDataSource} from '@angular/material';

@Component({
  selector: 'app-viewplayer',
  templateUrl: './viewplayer.component.html',
  styleUrls: ['./viewplayer.component.css']
})
export class ViewplayerComponent implements OnInit,AfterViewInit {
  @ViewChild(MatPaginator, {static: false}) paginator: MatPaginator;
  @ViewChild(MatSort, {static: false}) sort: MatSort;
  //private playerData:any;
  constructor(private playerService:PlayerService) {

  }
  displayedColumns: string[] = [ 'tennisId', 'tournamentId',
    'location','date','matchNo','winnerName'];
  tableSource = new MatTableDataSource();
  ngOnInit() {
    this.playerService.getAllPlayers().subscribe
    (response=>{
       //this.playerData=response;
       //console.log(this.playerData);
      this.tableSource.data = response;
    })

  }
  ngAfterViewInit() {
    this.tableSource.paginator = this.paginator;
    this.tableSource.sort = this.sort;

  }
}
