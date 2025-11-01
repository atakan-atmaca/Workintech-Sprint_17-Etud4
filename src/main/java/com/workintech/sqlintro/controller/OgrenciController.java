package com.workintech.sqlintro.controller;

import com.workintech.sqlintro.entity.Ogrenci;
import com.workintech.sqlintro.repository.OgrenciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workintech/ogrenci")
public class OgrenciController {

    @Autowired
    private OgrenciRepository ogrenciRepository;

    @GetMapping("/all")
    public List<Ogrenci> getAllStudents() {
        return ogrenciRepository.findAll();
    }

    @GetMapping("/girls")
    public List<Ogrenci> getGirls() {
        return ogrenciRepository.findGirls();
    }

    @GetMapping("/classes")
    public List<String> getAllClasses() {
        return ogrenciRepository.findAllClasses();
    }

    @GetMapping("/10A/girls")
    public List<Ogrenci> get10AGirls() {
        return ogrenciRepository.find10AGirls();
    }

    @GetMapping("/girls/ogrno")
    public List<Ogrenci> getGirlsWithOgrno() {
        return ogrenciRepository.findGirlsWithOgrno();
    }

    @GetMapping("/sorted")
    public List<Ogrenci> getStudentsAlphabetically() {
        return ogrenciRepository.findStudentsAlphabetically();
    }

    @GetMapping("/10A/ogrno")
    public List<Ogrenci> get10AStudentsByOgrNo() {
        return ogrenciRepository.find10AStudentsByOgrNo();
    }

    @GetMapping("/youngest")
    public Ogrenci getYoungestStudent() {
        return ogrenciRepository.findYoungestStudent();
    }

    @GetMapping("/elder")
    public Ogrenci getElderStudent() {
        return ogrenciRepository.findElderStudent();
    }

    @GetMapping("/second-letter-e")
    public List<Ogrenci> getSecondLetterE() {
        return ogrenciRepository.findStudentsSecondLetterOfN();
    }
}
