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
public class SituationFamils {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;

//  DataParties
    @OneToMany(targetEntity = DataParties.class, mappedBy = "situationFamilsDataParties")
    private Collection<DataParties> dataParties;
}
