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
public class SourcePvs {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;

//    pvs
    @OneToMany(targetEntity = Pvs.class, mappedBy = "sourcePvsPvs")
    private Collection<Pvs> pvs;
}