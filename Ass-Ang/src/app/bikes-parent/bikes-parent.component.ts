import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes-parent',
  templateUrl: './bikes-parent.component.html',
  styleUrls: ['./bikes-parent.component.css']
})
export class BikesParentComponent implements OnInit {
  selectedBike ;
  
  bikes = [
    {
      imgUrl : 'https://image.shutterstock.com/image-photo/motorcycle-on-sunset-260nw-564531946.jpg',
      name : 'Duke'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2019/09/23/08/01/traffic-4497805__340.jpg',
      name : 'Ducati'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2019/07/17/14/34/vespa-4344085__340.png',
      name : 'Vespa'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/08/27/09/06/bike-909690__340.jpg',
      name : 'Royal Enfield'
    }
  ]
  

  constructor() { }

  ngOnInit() {
  }
  sendBike(bike) {
    console.log(bike);
    this.selectedBike = bike ;
  }
  

}
