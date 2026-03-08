package com.aulaback.aula;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class Lista1 {
    
    @GetMapping("/soma/{num1}/{num2}")
    public String soma (@PathVariable Double num1, @PathVariable Double num2) {
        return Double.toString(num1 + num2);
    }
    @GetMapping("subtrair")
    public String subtrair (@RequestParam Double num1, @RequestParam Double num2){
        return Double.toString(num1 - num2);
    }

    @GetMapping("multi")
    public String multiplicação (@RequestParam Double num1, @RequestParam Double num2) {
        return Double.toString(num1 * num2);
    }
    
    @GetMapping("divi")
    public String divisão (@RequestParam Double num1, @RequestParam Double num2) {
        return Double.toString(num1 / num2);
    }

    @GetMapping("quadrado")
    public String quadrado(@RequestParam Double num1) {
        return Double.toString(num1 * num1);
    }
    
    @GetMapping("temp")
    public String celsius (@RequestParam Double num1) {
        return Double.toString((num1 * 9 /5) + 32);
    }
    
    @GetMapping("imc")
    public String imc (@RequestParam Double peso, @RequestParam Double altura) {
        return Double.toString( peso / (altura * altura));
    }
    
    @GetMapping("numeros")
    public String numeros(@RequestParam Double num1) {
        return ((num1 - 1) + " e " + (num1 + 1));
        
    }
    
    @GetMapping("desconto")
    public String desconto (@RequestParam Double valor, @RequestParam Double percentual) {
        return ("Com o desconto de "+percentual+"% o valor final é "+  (valor - (valor * percentual/100)));
    }

    @GetMapping("/tabu/{num1}")
    public List<String> tabuada (@PathVariable int num1) {
        List<String> resultados = new ArrayList<>();
        for (int i= 1; i <=10; i++){
            resultados.add(num1 + " x " + i + " = " + (num1 * i));
        }
        return resultados;
    }
    
}
