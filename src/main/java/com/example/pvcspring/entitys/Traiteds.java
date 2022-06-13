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
public class Traiteds {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;

//  UserHasPlaints
    @OneToMany(targetEntity = UserHasPlaints.class, mappedBy = "traitedsUserHasPlaints")
    private Collection<UserHasPlaints> userHasPlaints;

//  UsersHasPvs
    @OneToMany(targetEntity = UsersHasPvs.class, mappedBy = "traitedsUsersHasPvs")
    private Collection<UsersHasPvs> usersHasPvs;


}
