import {Items, PanelMenu, SubItems} from './models.panelmenu';


export let menuData:PanelMenu[]=[new PanelMenu('Products','','',
  [new Items('FoodItems','','',
    [new SubItems('Add','',''),
      new SubItems('View','','')
    ]),
    new Items('Electronics','','',
      [new SubItems('Add','',''),
        new SubItems('View','','')
      ]),
    new Items('Apparel','','',
      [new SubItems('Add','',''),
        new SubItems('View','','')
      ])

  ]),
  new PanelMenu('Aboutus','','',[]),
  new PanelMenu('Contactus','','',[]),
  new PanelMenu('Expert Thinking','','',[])
];
