import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';

import { BikesComponent } from './bikes/bikes.component';
import { LaptopsComponent } from './laptops/laptops.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { RouterModule } from '@angular/router';
import { BikesParentComponent } from './bikes-parent/bikes-parent.component';
import { LaptopsParentComponent } from './laptops-parent/laptops-parent.component';
import { MobilesParentComponent } from './mobiles-parent/mobiles-parent.component';
import { MoviesComponent } from './movies/movies.component';
import { MoviesParentComponent } from './movies-parent/movies-parent.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    BikesComponent,
    LaptopsComponent,
    MobilesComponent,
    BikesParentComponent,
    LaptopsParentComponent,
    MobilesParentComponent,
    MoviesComponent,
    MoviesParentComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path : '' , component : HomeComponent},
      { path : 'parent',component : BikesParentComponent},
      {path : 'child',component : BikesComponent},
      { path : 'parent1',component : LaptopsParentComponent},
      {path : 'child1',component : LaptopsComponent},
      { path : 'parent2',component : MobilesParentComponent},
      {path : 'child2',component : MobilesComponent},
      { path : 'parent3',component : MoviesParentComponent},
      {path : 'child3',component : MoviesComponent}
      
      

      ])

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
