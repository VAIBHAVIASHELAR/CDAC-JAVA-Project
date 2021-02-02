import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EventService } from '../event.service';

@Component({
  selector: 'app-list-event',
  templateUrl: './list-event.component.html',
  styleUrls: ['./list-event.component.css']
})
export class ListEventComponent implements OnInit {

  events:Event[];
  constructor(private eventService:EventService,private router:Router) { }

  ngOnInit(): void {
    
  }
 /* private getEvent()
  {
    this.eventService.getEventList().subscribe(
      data=>{
       // this.router.navigate(['/loginsuccess/societylist']);
        this.events=data;
        
      }
    );
  }*/
}
