export class TennisMenu{
  private _label: string;
  private _icon: string;
  private _routerLink:string;

  constructor(label: string, icon: string,routerLink:string) {
    this._label = label;
    this._icon = icon;
    this._routerLink= routerLink;
  }

  get routerLink(): string {
    return this._routerLink;
  }

  set routerLink(value: string) {
    this._routerLink = value;
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
}
