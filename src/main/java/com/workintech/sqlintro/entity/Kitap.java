package com.workintech.sqlintro.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "kitap")
public class Kitap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kitapno;

    private String ad;
    private String tur;
    private String yazar;
    private int sayfa_sayisi;
    private int basim_yili;
}
