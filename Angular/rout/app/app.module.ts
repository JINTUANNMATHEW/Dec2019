import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import {RouterModule, Routes, OutletContext} from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { ThirdComponent } from './third/third.component';
import { CalcComponent } from './calc/calc.component';
import { EmployComponent } from './employ/employ.component';
import { EmployListComponent } from './employ-list/employ-list.component';
import { LoginComponent } from './login/login.component';
import { MenuComponent } from './menu/menu.component';

const appRoutes : Routes = [ 
  {path:'menu', component:MenuComponent,
  children :
  [
    {path:'first', component:FirstComponent, outlet:'data'},
    {path:'second', component:SecondComponent, outlet:'data'},
    {path:'calc', component:CalcComponent, outlet:'data'},
    {path:'employ', component:EmployComponent,outlet:'data'},
    {path:'employlist', component:EmployListComponent,
      outlet:'data'},
  ]
},
  {path:'menu', component:MenuComponent},
  {path:'', component:LoginComponent},
];

@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    SecondComponent,
    ThirdComponent,
    CalcComponent,
    EmployComponent,
    EmployListComponent,
    LoginComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule, 
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
