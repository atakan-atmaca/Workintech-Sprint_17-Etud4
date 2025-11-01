package com.workintech.sqlintro.controller;

import com.workintech.sqlintro.entity.Yazar;
import com.workintech.sqlintro.repository.YazarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workintech/yazar")
public class YazarController {

    private final YazarRepository yazarRepository;

    public YazarController(YazarRepository yazarRepository) {
        this.yazarRepository = yazarRepository;
    }

    @GetMapping("/all")
    public List<Yazar> getAllAuthors() {
        return yazarRepository.findAllAuthors();
    }

    @GetMapping("/ad-a-ile-baslayan")
    public List<Yazar> getAuthorsStartingWithA() {
        return yazarRepository.findAuthorsStartingWithA();
    }

    @GetMapping("/soyad-sirala")
    public List<Yazar> getAuthorsSortedBySurname() {
        return yazarRepository.findAuthorsSortedBySurname();
    }

    @GetMapping("/soyad/{yazarsoyad}")
    public List<Yazar> getBySurname(@PathVariable String yazarsoyad) {
        return yazarRepository.findBySurname(yazarsoyad);
    }
}
