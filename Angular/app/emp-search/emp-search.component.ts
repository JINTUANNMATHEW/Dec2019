import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Emp } from '../emp';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-emp-search',
  templateUrl: './emp-search.component.html',
  styleUrls: ['./emp-search.component.css']
})
export class EmpSearchComponent implements OnInit {

  emp : Observable<Emp>;
  empno : number;
  constructor(private empService : EmpService) {
    this.emp=empService.searchEmploy(this.empno);
   }

  ngOnInit() {
  }

}
