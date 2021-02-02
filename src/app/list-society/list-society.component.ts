import { Component, OnInit } from '@angular/core';
import { SocietyDetails } from '../society-details';
import { SocietydetailsService } from '../societydetails.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-list-society',
  templateUrl: './list-society.component.html',
  styleUrls: ['./list-society.component.css']
})
export class ListSocietyComponent implements OnInit {

  society:SocietyDetails[];
  constructor(private societydetailsService:SocietydetailsService,private router:Router) { }

  ngOnInit(): void {
    this.getSociety();
  }

  private getSociety()
  {
    this.societydetailsService.getSocietyList().subscribe(
      data=>{
        this.router.navigate(['/loginsuccess/societylist']);
        this.society=data;
        
      }
    );
  }

}
