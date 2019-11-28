import { Component, OnInit, DoCheck, AfterViewChecked, AfterViewInit, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit,DoCheck ,AfterViewChecked,AfterViewInit,OnDestroy{
  Users;
  SelectedUser;
  today = new Date();

  constructor(public service : UserService) {
    console.log("constructor is executed")
  this.getData();
 }

  ngOnInit() {
    console.log("ngOnIt is executed");
  }
  ngDoCheck(){
    console.log("ngDoCheck is executed");
  }

  ngAfterViewInit(){
    console.log("ngAfterViewInit is executed ");
  }
  ngAfterViewChecked(){
    console.log("ngAfterViewChecked");
  }
  ngOnDestroy(){
    console.log("ngOnDestroy is executed");
  }

  loginData(form) {
    console.log(form.value);
    this.service.postUser(form.value).subscribe(data => {
      console.log(data);
    },err=>{
      console.log(err);
     },()=>{
       console.log('data poster succesfully')

     } );
    
  }
  getData(){
    this.service.getUsers().subscribe(data => {
      console.log(data);
      this.getData();
      this.Users = data;
    }, err =>{
      console.log(err);
    }, () =>{
      console.log('data got succesfully')

    })
  }
  deleteData(user){
    console.log(user);
    this.service.deleteUser(user.id).subscribe(data=>{
      
      console.log(data);
    },err =>{
      console.log('data deleted succesfully')
    })
  }
  }



