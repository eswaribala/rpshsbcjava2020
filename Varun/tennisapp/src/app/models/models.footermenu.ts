export class FooterMenu {
  private _label: string;
  private _icon: string;


  constructor(label: string, icon: string) {
    this._label = label;
    this._icon = icon;
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
