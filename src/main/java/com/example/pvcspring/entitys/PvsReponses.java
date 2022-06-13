package com.example.pvcspring.entitys;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PvsReponses {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int numEnvoi;
    private LocalDate datePvs;
    private LocalTime heureRealisation;
    private int contreInnconue;

//  TypeSourcePvs
    @ManyToOne(targetEntity = TypeSourcePvs.class)
    private TypeSourcePvs typeSourcePvsPvsReponses;

//    pvs
    @ManyToOne(targetEntity = Pvs.class)
    private Pvs pvsPvsReponses;

//    TypePoliceJudics
    @ManyToOne(targetEntity = TypePoliceJudics.class)
    private TypePoliceJudics typePoliceJudicsPvsReponses;

//    Plaints
    @ManyToOne(targetEntity = Plaints.class)
    private Plaints plaintsPvsReponses;
}
