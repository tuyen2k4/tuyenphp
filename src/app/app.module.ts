import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import {ClassroomComponent} from "./classrom/classroom.component";
import {StudentComponent} from "./Student/student.component";
import {logincomponent} from "./baitap/login.component";

@NgModule({
  declarations: [
    AppComponent, ClassroomComponent,StudentComponent,logincomponent,logincomponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
