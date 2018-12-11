import { Component, OnInit } from '@angular/core';
import { UserService } from '../../shared-service/user.service';
import { User } from '../../user';

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit {

  private users: User[];

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.userService.getUsers().subscribe((users)=>{
      console.log(users);
      this.users=users;
    }, (error)=>{
      console.log(error);
    });
  }

  deleteUser(user) {
    this.userService.deleteUser(user.id).subscribe((data)=>{
      this.users.splice(this.users.indexOf(user), 1);
    }, (error)=>{
      console.log(error);
    });
  }

}
