package com.example.pvcspring.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataParties {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String soi;
    private String morale;
    private String genre;
    private String nom;
    private String prenom;
    private String numCarte;
    private String nomDePere;
    private String filsDe;
    private String nomDeMere;
    private String filleDe;
    private String dataPartieCol;
    private String Profession;
    private String lieuDeTravail;
    private String numFinan;
    private LocalDate dateNaiss;
    private String dataPersonnecol;

//  PlaintHasDataParties
    @OneToMany(targetEntity = PlaintHasDataParties.class, mappedBy = "dataPartiesPlaintHasDataParties")
    private Collection<PlaintHasDataParties> plaintHasDataParties;

//  VilleDeNaisses
    @ManyToOne(targetEntity = VilleDeNaisses.class)
    private VilleDeNaisses villeDeNaissesDataParties;

//  Pays
    @ManyToOne(targetEntity = Pays.class)
    private Pays paysDataParties;

//  TypeCarteIdents
    @ManyToOne(targetEntity = TypeCarteIdents.class)
    private TypeCarteIdents typeCarteIdentsDataParties;

//  Provinces
    @ManyToOne(targetEntity = Provinces.class)
    private Provinces provincesDataParties;

//  PersonneMorales
    @ManyToOne(targetEntity = PersonneMorales.class)
    private PersonneMorales personneMoralesDataParties;

//  Nationalites
    @ManyToOne(targetEntity = Nationalites.class)
    private Nationalites nationalitesDataParties;

//  SituationFamils
    @ManyToOne(targetEntity = SituationFamils.class)
    private SituationFamils situationFamilsDataParties;

//  PvsHasDataParties
    @OneToMany(targetEntity = PvsHasDataParties.class, mappedBy = "dataPartiesPvsHasDataParties")
    private Collection<PvsHasDataParties> pvsHasDataParties;

}
