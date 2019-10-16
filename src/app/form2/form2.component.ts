import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { CustomValidation } from './custom.validaton';


@Component({
  selector: 'app-form2',
  templateUrl: './form2.component.html',
  styleUrls: ['./form2.component.css']
})
export class Form2Component implements OnInit {

  get movie() {
    return this.form.get('movie');
   }
   
   get title() {
     return this.form.get('title');
   }
   get image() {
    return this.form.get('image');
  }
  get des() {
    return this.form.get('des');
  }
   
   form = new FormGroup ({
     movie : new FormControl('',[Validators.required , CustomValidation.unique]),
     title  : new FormControl('', [Validators.required]),
     image : new FormControl('', [Validators.required]),
     des  : new FormControl('', [Validators.required])
   });
     constructor() { }
   
     ngOnInit() {
     }
     loginData(form) {
       console.log(form);
     }
   
   }
   