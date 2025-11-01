package com.workintech.sqlintro.repository;

import com.workintech.sqlintro.entity.Yazar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface YazarRepository extends JpaRepository<Yazar, Long> {

    // Tüm yazarları listele
    String QUESTION_1 = "SELECT * FROM yazar";
    @Query(value = QUESTION_1, nativeQuery = true)
    List<Yazar> findAllAuthors();

    // Adı A harfiyle başlayan yazarları listele
    String QUESTION_2 = "SELECT * FROM yazar WHERE yazarad LIKE 'A%'";
    @Query(value = QUESTION_2, nativeQuery = true)
    List<Yazar> findAuthorsStartingWithA();

    // Yazar soyadına göre sıralama (alfabetik)
    String QUESTION_3 = "SELECT * FROM yazar ORDER BY yazarsoyad ASC";
    @Query(value = QUESTION_3, nativeQuery = true)
    List<Yazar> findAuthorsSortedBySurname();

    // Belirli soyada sahip yazarları getir
    String QUESTION_4 = "SELECT * FROM yazar WHERE yazarsoyad = :yazarsoyad";
    @Query(value = QUESTION_4, nativeQuery = true)
    List<Yazar> findBySurname(String yazarsoyad);
}
