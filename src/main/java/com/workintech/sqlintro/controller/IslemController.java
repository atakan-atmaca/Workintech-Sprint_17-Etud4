package com.workintech.sqlintro.controller;

import com.workintech.sqlintro.entity.Islem;
import com.workintech.sqlintro.repository.IslemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workintech/islem")
public class IslemController {

    private final IslemRepository islemRepository;

    public IslemController(IslemRepository islemRepository) {
        this.islemRepository = islemRepository;
    }

    @GetMapping("/all")
    public List<Islem> getAllTransactions() {
        return islemRepository.findAllTransactions();
    }

    @GetMapping("/ogrenci/{ogrno}")
    public List<Islem> getTransactionsByStudent(@PathVariable Long ogrno) {
        return islemRepository.findTransactionsByStudent(ogrno);
    }

    @GetMapping("/kitap/{kitapno}")
    public List<Islem> getTransactionsByBook(@PathVariable Long kitapno) {
        return islemRepository.findTransactionsByBook(kitapno);
    }

    @GetMapping("/teslim-edilmemis")
    public List<Islem> getUnreturnedBooks() {
        return islemRepository.findUnreturnedBooks();
    }

    @GetMapping("/en-cok-odunc-alan")
    public Long getTopBorrower() {
        return islemRepository.findTopBorrower();
    }
}
