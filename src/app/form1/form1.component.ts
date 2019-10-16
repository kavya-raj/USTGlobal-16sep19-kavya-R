import { Component,OnInit} from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-form1',
  templateUrl: './form1.component.html',
  styleUrls: ['./form1.component.css']
})
export class Form1Component implements OnInit {
  movies : any []=[];
  constructor(public http :HttpClient) {
  }
  
  ngOnInit() {
    
  }
  searchMovies(movie){
    this.http.get<any>(`http://www.omdbapi.com/?apikey=efbe489e&=${movie}`).subscribe(data=>{
      this.movies=data.Search;
    })
  }
  
 
}


  