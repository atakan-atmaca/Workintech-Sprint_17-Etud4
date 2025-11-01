package com.workintech.sqlintro.repository;

import com.workintech.sqlintro.entity.Tur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TurRepository extends JpaRepository<Tur, Long> {

    // Tüm kitap türlerini listele
    String QUESTION_1 = "SELECT * FROM tur";
    @Query(value = QUESTION_1, nativeQuery = true)
    List<Tur> findAllTypes();

    // Belirli ada sahip türleri getir
    String QUESTION_2 = "SELECT * FROM tur WHERE turad = :turad";
    @Query(value = QUESTION_2, nativeQuery = true)
    List<Tur> findByTypeName(String turad);

    // Türleri ada göre sıralama
    String QUESTION_3 = "SELECT * FROM tur ORDER BY turad ASC";
    @Query(value = QUESTION_3, nativeQuery = true)
    List<Tur> findTypesSorted();
}
