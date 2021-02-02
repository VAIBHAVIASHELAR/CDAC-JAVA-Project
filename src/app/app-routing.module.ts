import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutUsComponent } from './about-us/about-us.component';
import { AddEventComponent } from './add-event/add-event.component';
import { AddSocietyComponent } from './add-society/add-society.component';
import { AdminComponent } from './admin/admin.component';
import { FlatOwnerComponent } from './flat-owner/flat-owner.component';
import { HelpComponent } from './help/help.component';
import { HomeComponent } from './home/home.component';
import { ListSocietyComponent } from './list-society/list-society.component';
import { LoginSuccessComponent } from './login-success/login-success.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { SecLoginSuccessComponent } from './sec-login-success/sec-login-success.component';
import { SecretaryComponent } from './secretary/secretary.component';

const routes: Routes = [
  {path:'home',component:HomeComponent},
  {path:'admin',component:AdminComponent},
  {path:'secretary',component:SecretaryComponent},
  {path:'flat-owner',component:FlatOwnerComponent},
  {path:'help',component:HelpComponent},
  {path:'about-us',component:AboutUsComponent},
  
  {path:'',redirectTo:'home',pathMatch:'full'},

  {path:'loginsuccess',component:LoginSuccessComponent},
  {path:'secretaryloginsuccess',component:SecLoginSuccessComponent},
  {path:'listsociety',component:ListSocietyComponent},
  {path:'create-society',component:AddSocietyComponent},
  {path:'registration',component:RegistrationComponent},
  {path:'login',component:LoginComponent},
  {path:'addevent',component:AddEventComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
