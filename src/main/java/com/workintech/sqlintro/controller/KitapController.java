package com.workintech.sqlintro.controller;

import com.workintech.sqlintro.entity.Kitap;
import com.workintech.sqlintro.repository.KitapRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workintech/kitap")
public class KitapController {

    private final KitapRepository kitapRepository;

    public KitapController(KitapRepository kitapRepository) {
        this.kitapRepository = kitapRepository;
    }

    @GetMapping("/all")
    public List<Kitap> getAllBooks() {
        return kitapRepository.findAllBooks();
    }

    @GetMapping("/tur/{tur}")
    public List<Kitap> getBooksByTur(@PathVariable String tur) {
        return kitapRepository.findByTur(tur);
    }

    @GetMapping("/yazar/{yazar}")
    public List<Kitap> getBooksByYazar(@PathVariable String yazar) {
        return kitapRepository.findByYazar(yazar);
    }

    @GetMapping("/en-kalin")
    public Kitap getLongestBook() {
        return kitapRepository.findLongestBook();
    }

    @GetMapping("/en-eski")
    public Kitap getOldestBook() {
        return kitapRepository.findOldestBook();
    }
}
