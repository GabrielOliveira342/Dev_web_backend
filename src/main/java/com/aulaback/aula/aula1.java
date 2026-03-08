package com.aulaback.aula;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aula1")
public class aula1 {
    
    @GetMapping
    public String hello() {
        return "Ola VScode e Sring Boot";
    }

    @GetMapping("/nome/{nome}")
    public String getNome(@PathVariable String nome) {
        return "Ola " +nome+"!";
    }
}
