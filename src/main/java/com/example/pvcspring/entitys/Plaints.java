package com.example.pvcspring.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plaints {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int contreInconnu;
    private String referencePlaints;
    private LocalDate datePlaints;
    private LocalDate dateEnregPlaints;
    private LocalDate dateFaits;
    private String emplaceFaits;
    private String sujetPlaints;

    //    PvsReponses
    @OneToMany(targetEntity = PvsReponses.class, mappedBy = "plaintsPvsReponses")
    private Collection<PvsReponses> pvsReponses;

    //    TypePlaints
    @ManyToOne(targetEntity = TypePlaints.class)
    private TypePlaints typePlaintsPlaints;

    //    SourcePlaints
    @ManyToOne(targetEntity = SourcePlaints.class)
    private SourcePlaints sourcePlaintsPlaints;

    //    UserHasPlaints
    @OneToMany(targetEntity = UserHasPlaints.class, mappedBy = "plaintsUserHasPlaints")
    private Collection<UserHasPlaints> userHasPlaints;

    //    PlaintHasDataParties
    @OneToMany(targetEntity = PlaintHasDataParties.class, mappedBy = "plaintsPlaintHasDataParties")
    private Collection<PlaintHasDataParties> plaintHasDataParties;
}

