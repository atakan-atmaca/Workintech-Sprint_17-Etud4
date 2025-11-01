package com.workintech.sqlintro.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "yazar")
public class Yazar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long yazarno;

    private String yazarad;
    private String yazarsoyad;
}
