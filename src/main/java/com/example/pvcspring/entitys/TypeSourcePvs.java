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
public class TypeSourcePvs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;

//    Pvs
    @OneToMany(targetEntity = Pvs.class, mappedBy = "typeSourcePvsPvs")
    private Collection<Pvs> pvs;

//    PvsReponses
    @OneToMany(targetEntity = PvsReponses.class, mappedBy = "typeSourcePvsPvsReponses")
    private Collection<PvsReponses> pvsReponses;

}
