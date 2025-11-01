package com.workintech.sqlintro.controller;

import com.workintech.sqlintro.entity.Tur;
import com.workintech.sqlintro.repository.TurRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workintech/tur")
public class TurController {

    private final TurRepository turRepository;

    public TurController(TurRepository turRepository) {
        this.turRepository = turRepository;
    }

    @GetMapping("/all")
    public List<Tur> getAllTypes() {
        return turRepository.findAllTypes();
    }

    @GetMapping("/ad/{turad}")
    public List<Tur> getByTypeName(@PathVariable String turad) {
        return turRepository.findByTypeName(turad);
    }

    @GetMapping("/sirali")
    public List<Tur> getTypesSorted() {
        return turRepository.findTypesSorted();
    }
}
