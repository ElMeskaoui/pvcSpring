package com.example.pvcspring.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersHasPvs {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//  Users
    @ManyToOne(targetEntity = Users.class)
    private Users usersUsersHasPvs;

//  Traiteds
    @ManyToOne(targetEntity = Traiteds.class)
    private Traiteds traitedsUsersHasPvs;

//   Pvs
    @ManyToOne(targetEntity = Pvs.class)
    private Pvs pvsUsersHasPvs;

}
