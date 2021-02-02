import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { SocietyDetails } from './society-details';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class SocietydetailsService {
  private baseURL="http://localhost:8080/society";

  constructor(private httpClient:HttpClient) { }

  getSocietyList():Observable<SocietyDetails[]>{
    return this.httpClient.get<SocietyDetails[]>(`${this.baseURL}`);
  }

  createSociety(society:SocietyDetails):Observable<Object>
  {
    return this.httpClient.post(`${this.baseURL}`,society);
  }
  
}
