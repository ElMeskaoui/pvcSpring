package com.example.pvcspring.entitys;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TypePoliceJudics {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;

//    Pvs
    @OneToMany(targetEntity = Pvs.class, mappedBy = "typePoliceJudicsPvs")
    private Collection<Pvs> pvs;

//  PvsReponses
    @OneToMany(targetEntity = PvsReponses.class, mappedBy = "typePoliceJudicsPvsReponses")
    private Collection<PvsReponses> pvsReponses;
}
