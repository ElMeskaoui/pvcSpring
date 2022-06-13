package com.example.pvcspring.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Nationalites {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;

//  DataParties
    @OneToMany(targetEntity = DataParties.class, mappedBy = "nationalitesDataParties")
    private Collection<DataParties> dataParties;
}
