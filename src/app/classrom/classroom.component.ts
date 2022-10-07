import {Component}  from "@angular/core";

@Component({
  selector: 'classroom',
  templateUrl: './classroom.component.html'
})
export class ClassroomComponent{
  className = 'T2207A - Sem 1';
  siso = 27;

  themSinhVien(){
    this.siso++;
  }
  giamSinhVien(){
    this.siso--;
  }
}
