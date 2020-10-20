import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AddFoodItemsComponent} from './fooditems/add/add.component';
import {ViewFoodItemsComponent} from './fooditems/view/view.component';
import {AddElectronicsComponent} from './electronics/add/add.component';
import {ViewElectronicsComponent} from './electronics/view/view.component';
import {AddApparelsComponent} from './apparels/add/add.component';
import {ViewApparelsComponent} from './apparels/view/view.component';


const routes: Routes = [{
  path:'Products',
  children:[{
    path:'FoodItems',
    children:[{
      path:'Add',
      component:AddFoodItemsComponent
    },
      {
        path:'View',
        component:ViewFoodItemsComponent
      }

    ]
  },
    {
      path:'Electronics',
      children:[{
        path:'Add',
        component:AddElectronicsComponent
      },
        {
          path:'View',
          component:ViewElectronicsComponent
        }

      ]
    },
    {
      path:'Apparels',
      children:[{
        path:'Add',
        component:AddApparelsComponent
      },
        {
          path:'View',
          component:ViewApparelsComponent
        }

      ]
    }


  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
