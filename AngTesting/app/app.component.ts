import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'AngTestPractice';
  company = "Hexaware";
  msg="Prasanna taking Angular Training";
  arr1={a:12,b:13};
  arr2={a:12,b:13};
  a1 = {
    name: "Garima"
  };
  Stud = ["Shrisom", "Eldo", "Himanshu"];
  v1=12.5;
  v2=11.4;

  isAuthenticated(): boolean {
    return !!localStorage.getItem('token');
  }

  getName() {
    return 'Hexaware';
  }
}
