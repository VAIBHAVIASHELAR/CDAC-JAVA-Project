import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class EventService {
  private baseURL="http://localhost:8080/events";

  constructor(private httpClient:HttpClient) { }

  /*
  
  getEventList():Observable<Event[]>{
    return this.httpClient.get<Event[]>(`${this.baseURL}`);
  }
  createEvent(events:Event):Observable<Object>
  {
    return this.httpClient.post(`${this.baseURL}`,events);
  }
  */
}
