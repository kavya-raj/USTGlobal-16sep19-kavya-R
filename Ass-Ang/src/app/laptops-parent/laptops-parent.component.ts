import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-laptops-parent',
  templateUrl: './laptops-parent.component.html',
  styleUrls: ['./laptops-parent.component.css']
})
export class LaptopsParentComponent implements OnInit {

  selectedLaptop ;
  
  laptops = [
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
  sendLaptop(laptop) {
    console.log(laptop);
    this.selectedLaptop = laptop ;
  }
  

}
