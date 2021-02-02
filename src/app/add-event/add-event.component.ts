import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Event} from '../event';
import { EventService } from '../event.service';
@Component({
  selector: 'app-add-event',
  templateUrl: './add-event.component.html',
  styleUrls: ['./add-event.component.css']
})
export class AddEventComponent implements OnInit {
  events :Event=new Event();
  constructor(private eventService:EventService,private router:Router) { }

  ngOnInit(): void {
  }
 /* saveSociety()
  {
    this.eventService.createEvent(this.events).subscribe(data =>{
      console.log(data);
      this.goToEventList();
    },
    error=>console.log(error)
    );
  }
  goToEventList()
  {
    this.router.navigate(['/listEvent']);
  }
  onSubmit()
  {
    console.log(this.events);
    this.saveSociety();
  }
  */
}
