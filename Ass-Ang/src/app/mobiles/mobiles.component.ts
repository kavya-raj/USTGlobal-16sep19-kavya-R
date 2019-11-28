import { Component, OnInit , Input } from '@angular/core';

@Component({
  selector: 'app-mobiles',
  templateUrl: './mobiles.component.html',
  styleUrls: ['./mobiles.component.css']
})
export class MobilesComponent implements OnInit {
  @Input() mobile: {imgUrl : string , name : string};

  constructor() { }

  ngOnInit() {
  }

}
