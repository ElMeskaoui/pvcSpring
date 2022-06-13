package com.example.pvcspring.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SourcePlaints {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;

//    Plaints
    @OneToMany(targetEntity = Plaints.class, mappedBy = "sourcePlaintsPlaints")
    private Collection<Plaints> plaints;
}
