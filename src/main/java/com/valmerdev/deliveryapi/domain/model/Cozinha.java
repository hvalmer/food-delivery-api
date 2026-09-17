package com.valmerdev.deliveryapi.domain.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cozinha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

}
