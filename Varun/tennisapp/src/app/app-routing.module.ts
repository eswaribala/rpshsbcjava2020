import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AddplayerComponent} from "./addplayer/addplayer.component";
import {ViewplayerComponent} from "./viewplayer/viewplayer.component";
import {SearchplayerComponent} from "./searchplayer/searchplayer.component";


const routes: Routes = [
  { path:'AddPlayer',
  component:AddplayerComponent},
  { path:'ViewPlayer',
    component:ViewplayerComponent},
  { path:'SearchPlayer',
    component:SearchplayerComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
