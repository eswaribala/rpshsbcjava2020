export class PanelMenu{

  private _label:string;
  private _icon:string;
  private _routerLink:string;
  private _items:Items[];


  constructor(label: string, icon: string, routerLink: string, items: Items[]) {
    this._label = label;
    this._icon = icon;
    this._routerLink = routerLink;
    this._items = items;
  }

  get label(): string {
    return this._label;
  }

  set label(value: string) {
    this._label = value;
  }

  get icon(): string {
    return this._icon;
  }

  set icon(value: string) {
    this._icon = value;
  }

  get routerLink(): string {
    return this._routerLink;
  }

  set routerLink(value: string) {
    this._routerLink = value;
  }

  get items(): Items[] {
    return this._items;
  }

  set items(value: Items[]) {
    this._items = value;
  }
}

export class Items
{
   private _label:string;
   private _icon:string;
   private _routerLink:string;
   private _subItems:SubItems[];


  constructor(label: string, icon: string, routerLink: string, subItems: SubItems[]) {
    this._label = label;
    this._icon = icon;
    this._routerLink = routerLink;
    this._subItems = subItems;
  }

  get label(): string {
    return this._label;
  }

  set label(value: string) {
    this._label = value;
  }

  get icon(): string {
    return this._icon;
  }

  set icon(value: string) {
    this._icon = value;
  }

  get routerLink(): string {
    return this._routerLink;
  }

  set routerLink(value: string) {
    this._routerLink = value;
  }

  get subItems(): SubItems[] {
    return this._subItems;
  }

  set subItems(value: SubItems[]) {
    this._subItems = value;
  }
}

export class SubItems{
  private _label:string;
  private _icon:string;
  private _routerLink:string;


  constructor(label: string, icon: string, routerLink: string) {
    this._label = label;
    this._icon = icon;
    this._routerLink = routerLink;
  }

  get label(): string {
    return this._label;
  }

  set label(value: string) {
    this._label = value;
  }

  get icon(): string {
    return this._icon;
  }

  set icon(value: string) {
    this._icon = value;
  }

  get routerLink(): string {
    return this._routerLink;
  }

  set routerLink(value: string) {
    this._routerLink = value;
  }
}
