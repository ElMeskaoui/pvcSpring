package com.example.pvcspring.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String email;
    private String password;

//  Roles
    @ManyToOne(targetEntity = Roles.class)
    private Roles rolesUsers;

//  UsersHasPvs
    @OneToMany(targetEntity = UsersHasPvs.class, mappedBy = "usersUsersHasPvs")
    private Collection<UsersHasPvs> usersHasPvs;

//  UserHasPlaints
    @OneToMany(targetEntity = UserHasPlaints.class, mappedBy = "usersUserHasPlaints")
    private Collection<UserHasPlaints> userHasPlaints;


}
