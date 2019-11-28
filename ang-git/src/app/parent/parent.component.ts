import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar ;
  
  cars = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629__340.png',
      name : 'Luxury'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2019/07/07/14/03/fiat-4322521__340.jpg',
      name : 'Auto'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/05/28/23/12/auto-788747__340.jpg',
      name : 'Cadillac'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg',
      name : 'Sports Car'
    }
  ]
  

  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    console.log(car);
    this.selectedCar = car ;
  }

}
