import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpModule} from '@angular/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UsersComponent } from './users/users.component';
import { EmpComponent } from './emp/emp.component';
import { EmpSearchComponent } from './emp-search/emp-search.component';

@NgModule({
  declarations: [
    AppComponent,
    UsersComponent,
    EmpComponent,
    EmpSearchComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
