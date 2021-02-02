import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Society } from './society';
@Injectable({
  providedIn: 'root'
})
export class SocietyService {

  constructor(private httpClient:HttpClient) { }

  public loginUserFromRemote(user :Society):Observable<any>{
    return this.httpClient.post<any>("http://localhost:8080/login",user);

  }
  public registerUserFromRemote(user :Society):Observable<any>{
    return this.httpClient.post<any>("http://localhost:8080/register",user);

  }
}
