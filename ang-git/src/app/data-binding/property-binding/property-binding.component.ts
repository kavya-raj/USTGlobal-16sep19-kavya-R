import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})

export class PropertyBindingComponent implements OnInit {
  name : string = 'kavya';
  imgUrl : string ='https://cdn.pixabay.com/photo/2019/06/02/17/27/summer-4246927__340.jpg';
  address : string = 'vidhyanagar hassan';
  colorName : string = 'blue';
  isActive : boolean = false;
  colspanValue : number = 2;
  


  constructor() { 
    setInterval(() => {
      this.colorName = 'red';
      this.isActive = !this.isActive ;
    },2000)
  }

  ngOnInit() {
  }

}

