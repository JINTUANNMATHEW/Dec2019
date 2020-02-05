import { Injectable } from '@angular/core';
import {Http, Response} from '@angular/http';
import {Observable} from 'rxjs';
import {Emp} from './emp';
import 'rxjs/add/operator/map';

@Injectable({
  providedIn: 'root'
})
export class EmpService {

  constructor(private http : Http) { }
  
  searchEmploy(empno : number) : Observable<Emp> {
  return this.
  http.get("http://localhost:8080/RestEmpNew/webapi/Emp/"+empno).
    map((res : Response) => res.json());
  }
  showEmploy() : Observable<Emp[]> {
    return this.
    http.get("http://localhost:8080/RestEmpNew/webapi/Emp").
    map((res : Response) => res.json());
  }
}
