import { Route } from '@angular/compiler/src/core';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Society } from '../society';
import { SocietyService } from '../society.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user=new Society();
  msg='';
  constructor(private service:SocietyService,private router:Router) { }

  ngOnInit(): void {
  }

  loginUser()
  {
    this.service.loginUserFromRemote(this.user).subscribe(
      data=>{
        console.log("response received..");
        this.router.navigate(['/loginsuccess'])
    },
      error=>{
        console.log("exception occur");
        this.msg="Bad credentials ,plzzz enter valid email and password";
    }
    );
  }
  gotoRegistration()
  {
    console.log("in register link");
    this.router.navigate(['/registration'])

  }
}
