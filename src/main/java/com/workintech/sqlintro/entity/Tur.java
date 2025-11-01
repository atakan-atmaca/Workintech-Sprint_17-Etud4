package com.workintech.sqlintro.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tur")
public class Tur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long turno;

    private String turad;
}
