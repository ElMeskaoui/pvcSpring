package com.example.pvcspring.entitys;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PvsHasDataParties {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//  DataParties
    @ManyToOne(targetEntity = DataParties.class)
    private DataParties dataPartiesPvsHasDataParties;

//    Pvs
    @ManyToOne(targetEntity = Pvs.class)
    private Pvs pvsPvsHasDataParties;
}

