package com.example.pvcspring.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserHasPlaints {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    Plaints
    @ManyToOne(targetEntity = Plaints.class)
    private Plaints plaintsUserHasPlaints;

//  Users
    @ManyToOne(targetEntity = Users.class)
    private Users usersUserHasPlaints;

//  Traiteds
    @ManyToOne(targetEntity = Traiteds.class)
    private Traiteds traitedsUserHasPlaints;


}
