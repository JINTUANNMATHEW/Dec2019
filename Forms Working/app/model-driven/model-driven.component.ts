import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Leave } from '../leave';

@Component({
  selector: 'app-model-driven',
  templateUrl: './model-driven.component.html',
  styleUrls: ['./model-driven.component.css']
})
export class ModelDrivenComponent implements OnInit {

  constructor() { }
  model = new Leave();
  isValidFormSubmitted = false;
  applyLeave(form: NgForm)
    {
        this.isValidFormSubmitted=false;
        if(form.invalid){
       //     alert("Invalid");
         return; 
      }  
    }
  ngOnInit() {
  }

}
