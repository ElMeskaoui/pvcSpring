package com.example.pvcspring.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pvs {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int numEnvoi;
    private LocalDate datepvs;
    private LocalTime heureRelisation;
    private int contreInnconue;

    //    TypeSourcePvs
    @ManyToOne(targetEntity = TypeSourcePvs.class)
    private TypeSourcePvs typeSourcePvsPvs;

    //    SourcePvs
    @ManyToOne(targetEntity = SourcePvs.class)
    private SourcePvs sourcePvsPvs;

    //    TypePoliceJudics
    @ManyToOne(targetEntity = TypePoliceJudics.class)
    private TypePoliceJudics typePoliceJudicsPvs;

    //    PvsHasDataParties
    @OneToMany(targetEntity = PvsHasDataParties.class, mappedBy = "pvsPvsHasDataParties")
    private Collection<PvsHasDataParties> pvsHasDataParties;

    //    UsersHasPvs
    @OneToMany(targetEntity = UsersHasPvs.class, mappedBy = "pvsUsersHasPvs")
    private Collection<UsersHasPvs> usersHasPvs;

    //    PvsReponses
    @OneToMany(targetEntity = PvsReponses.class, mappedBy = "pvsPvsReponses")
    private Collection<PvsReponses> pvsReponses;

}
