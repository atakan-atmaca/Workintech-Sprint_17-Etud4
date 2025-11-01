package com.workintech.sqlintro.repository;

import com.workintech.sqlintro.entity.Islem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface IslemRepository extends JpaRepository<Islem, Long> {

    // Tüm işlemleri listele
    String QUESTION_1 = "SELECT * FROM islem";
    @Query(value = QUESTION_1, nativeQuery = true)
    List<Islem> findAllTransactions();

    // Belirli bir öğrencinin aldığı kitapları listele
    String QUESTION_2 = "SELECT * FROM islem WHERE ogrno = :ogrno";
    @Query(value = QUESTION_2, nativeQuery = true)
    List<Islem> findTransactionsByStudent(Long ogrno);

    // Belirli bir kitabı kimlerin aldığını listele
    String QUESTION_3 = "SELECT * FROM islem WHERE kitapno = :kitapno";
    @Query(value = QUESTION_3, nativeQuery = true)
    List<Islem> findTransactionsByBook(Long kitapno);

    // Teslim edilmemiş kitapları listele (vtarih NULL olanlar)
    String QUESTION_4 = "SELECT * FROM islem WHERE vtarih IS NULL";
    @Query(value = QUESTION_4, nativeQuery = true)
    List<Islem> findUnreturnedBooks();

    // En çok kitap alan öğrenciyi bul
    String QUESTION_5 = "SELECT ogrno FROM islem GROUP BY ogrno ORDER BY COUNT(*) DESC LIMIT 1";
    @Query(value = QUESTION_5, nativeQuery = true)
    Long findTopBorrower();
}
