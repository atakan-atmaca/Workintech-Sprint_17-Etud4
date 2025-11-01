package com.workintech.sqlintro.repository;

import com.workintech.sqlintro.entity.Kitap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface KitapRepository extends JpaRepository<Kitap, Long> {

    // Tüm kitapları listele
    String QUESTION_1 = "SELECT * FROM kitap";
    @Query(value = QUESTION_1, nativeQuery = true)
    List<Kitap> findAllBooks();

    // Belirli bir türe göre kitapları listele
    String QUESTION_2 = "SELECT * FROM kitap WHERE tur = :tur";
    @Query(value = QUESTION_2, nativeQuery = true)
    List<Kitap> findByTur(String tur);

    // Belirli bir yazarın kitaplarını listele
    String QUESTION_3 = "SELECT * FROM kitap WHERE yazar = :yazar";
    @Query(value = QUESTION_3, nativeQuery = true)
    List<Kitap> findByYazar(String yazar);

    // En kalın kitabı getir
    String QUESTION_4 = "SELECT * FROM kitap ORDER BY sayfa_sayisi DESC LIMIT 1";
    @Query(value = QUESTION_4, nativeQuery = true)
    Kitap findLongestBook();

    // En eski basım kitabı getir
    String QUESTION_5 = "SELECT * FROM kitap ORDER BY basim_yili ASC LIMIT 1";
    @Query(value = QUESTION_5, nativeQuery = true)
    Kitap findOldestBook();
}
