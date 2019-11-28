import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobiles-parent',
  templateUrl: './mobiles-parent.component.html',
  styleUrls: ['./mobiles-parent.component.css']
})
export class MobilesParentComponent implements OnInit {

  selectedMobile ;
  
  mobiles = [
    {
      imgUrl : 'https://media-public.canva.com/MABplLreB8Y/1/thumbnail_large.jpg',
      name : 'Iphone'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/04/26/16/06/mobile-2262928__340.jpg',
      name : 'Samsung'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2018/08/02/00/02/oneplus-3578574__340.jpg',
      name : 'One plus'
    },
    {
      imgUrl : 'https://image.shutterstock.com/image-vector/smartphone-mobile-phone-isolated-realistic-260nw-703670326.jpg',
      name : 'Oppo'
    }
  ]
  

  constructor() { }

  ngOnInit() {
  }
  sendMobile(mobile) {
    console.log(mobile);
    this.selectedMobile = mobile ;
  }
  

}