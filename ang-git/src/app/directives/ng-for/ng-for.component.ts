import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
 Products=[
   {
     img : 'https://cdn.pixabay.com/photo/2019/09/15/07/38/elephant-4477530__340.jpg',
     name : 'elephant',
     price : 278950
   },
   {
    img : 'https://cdn.pixabay.com/photo/2019/07/13/14/20/wolf-4334874__340.jpg',
    name : 'wolf',
    price : 11250
  },
  {
    img : 'https://cdn.pixabay.com/photo/2018/07/12/11/13/fresh-3533085__340.jpg',
    name : 'lemon',
    price : 10
  },
 ]
  constructor() { }

  ngOnInit() {
  }

}
