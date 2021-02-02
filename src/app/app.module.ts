import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin.component';
import { HomeComponent } from './home/home.component';
import { FormsModule } from '@angular/forms';
import { SecretaryComponent } from './secretary/secretary.component';
import { FlatOwnerComponent } from './flat-owner/flat-owner.component';
import { HelpComponent } from './help/help.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { LoginComponent } from './login/login.component';
import { LoginSuccessComponent } from './login-success/login-success.component';
import { ListSocietyComponent } from './list-society/list-society.component';
import { AddSocietyComponent } from './add-society/add-society.component';
import { RegistrationComponent } from './registration/registration.component';
import { ListComponent } from './list/list.component';
import { SecretaryLoginComponent } from './secretary-login/secretary-login.component';
import { SecLoginSuccessComponent } from './sec-login-success/sec-login-success.component';
import { AddEventComponent } from './add-event/add-event.component';
import { ListEventComponent } from './list-event/list-event.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    HomeComponent,
    SecretaryComponent,
    FlatOwnerComponent,
    HelpComponent,
    AboutUsComponent,
    LoginComponent,
    LoginSuccessComponent,
    ListSocietyComponent,
    AddSocietyComponent,
    RegistrationComponent,
    ListComponent,
    SecretaryLoginComponent,
    SecLoginSuccessComponent,
    AddEventComponent,
    ListEventComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
