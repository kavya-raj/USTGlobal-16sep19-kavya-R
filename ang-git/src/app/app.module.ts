import { BrowserModule } from '@angular/platform-browser';
import { NgModule, RootRenderer } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
import { AppComponent } from './app.component';
import { HeaderComponent } from './Header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './About/about.component';
import { RouterModule } from '@angular/router';
import { HelpComponent } from './Help/HelpComponent';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-binding/two-way-binding/two-way-binding.component';
import { DirectivesComponent } from './directives/directives.component';
import { NgIfComponent } from './directives/ng-if/ng-if.component';
import { NgIf } from '@angular/common';
import { NgForComponent } from './directives/ng-for/ng-for.component';
import { NgswitchComponent } from './directives/ngswitch/ngswitch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { Form1Component } from './form1/form1.component';
import { Form2Component } from './form2/form2.component';
import { Form3Component } from './form3/form3.component';
import { Form4Component } from './form4/form4.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    FooterComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    DirectivesComponent,
    NgIfComponent,
    NgForComponent,
    NgswitchComponent,
    CustomDirective,
    RegisterComponent,
    Form1Component,
    Form2Component,
    Form3Component,
    Form4Component,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollarPipe
    ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : '', component : HomeComponent},
      {path : 'about', component : AboutComponent},
      {path : 'help', component : HelpComponent},
      {path : 'property-binding', component : PropertyBindingComponent},
      {path : 'event-binding', component : EventBindingComponent},
      {path : 'two-way-binding' , component : TwoWayBindingComponent},
      {path :  'ngIf', component : NgIfComponent},
      {path : 'ngFor', component : NgForComponent},
      {path : 'ngSwitch', component : NgswitchComponent},
      {path : 'register', component : RegisterComponent},
      {path : 'form1' , component : Form1Component},
      {path : 'form2' , component : Form2Component},
      { path : 'form3', component : Form3Component},
      { path : 'form4', component : Form4Component},
      {path : 'reactive-form', component : ReactiveFormComponent},
      { path : 'parent' , component  : ParentComponent},
      {path : 'child', component : ChildComponent},
      { path : 'comment-details', component : CommentDetailsComponent},
      { path : 'comment',component : CommentComponent}
    ])

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { 

private newMethod(): string {
  return 'comment-details';
}
}
