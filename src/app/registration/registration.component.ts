import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Society } from '../society';
import { SocietyService } from '../society.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  user=new Society();
  msg='';
  constructor(private society:SocietyService,private router:Router) { }

  ngOnInit(): void {
  }
  registerUser()
  {
    this.society.registerUserFromRemote(this.user).subscribe(
      data=>{
        console.log("resp recevied");
        this.router.navigate(['/loginsuccess'])
      },
      error=>{
        console.log("ecxeption occured");
        this.msg=error.error;
      }
    )
  }
}
