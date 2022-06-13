package com.example.pvcspring.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlaintHasDataParties {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//  Plaints
    @ManyToOne(targetEntity = Plaints.class)
    private Plaints plaintsPlaintHasDataParties;

//  DataParties
    @ManyToOne(targetEntity = DataParties.class)
    private DataParties dataPartiesPlaintHasDataParties;
}
