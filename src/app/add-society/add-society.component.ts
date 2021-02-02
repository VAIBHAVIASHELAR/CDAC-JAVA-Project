import { Component, OnInit } from '@angular/core';
import { SocietyDetails } from '../society-details';
import { SocietydetailsService } from '../societydetails.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-add-society',
  templateUrl: './add-society.component.html',
  styleUrls: ['./add-society.component.css']
})
export class AddSocietyComponent implements OnInit {

  societydetails:SocietyDetails=new SocietyDetails();
  constructor(private societydetailsService:SocietydetailsService,private router:Router) { }

  ngOnInit(): void {
  }
  saveSociety()
  {
    this.societydetailsService.createSociety(this.societydetails).subscribe(data =>{
      console.log(data);
      this.goToSocietyList();
    },
    error=>console.log(error)
    );
  }
  goToSocietyList()
  {
    this.router.navigate(['/listsociety']);
  }
  onSubmit()
  {
    console.log(this.societydetails);
    this.saveSociety();
  }
}
