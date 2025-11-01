package com.workintech.sqlintro.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "islem")
public class Islem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long islemno;

    @Column(name = "ogrno")
    private Long ogrno;

    @Column(name = "kitapno")
    private Long kitapno;

    private String atarih;
    private String vtarih;
}
