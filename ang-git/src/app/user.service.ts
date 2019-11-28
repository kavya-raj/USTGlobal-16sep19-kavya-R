import { Injectable } from '@angular/core';


import { HttpClientModule, HttpClient } from '@angular/common/http';
// tslint:disable-next-line: import-spacing
import {map} from  'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  firebaseURL = 'https://kavya-raj.firebaseio.com/';


  constructor(public http : HttpClient) { }
  postUser(data) {
    console.log('service', data);
    return this.http.post(`${this.firebaseURL}/users.json`,data);
  }
  getUsers(){
    return this.http.get(`${this.firebaseURL}/users.json`).pipe(
      map(data=>{
        let newArray = [];
        for(let key in data){
          newArray.push({...data[key],id : key})
        }
        return newArray
      })
    );

  }
    deleteUser(id){
return this.http.delete(`${this.firebaseURL}/users/${id}.json`)
    }
  }



