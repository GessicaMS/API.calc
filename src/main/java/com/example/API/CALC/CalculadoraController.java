package com.example.API.CALC;

import com.example.API.CALC.CalculadoraService;
import com.example.API.CALC.NumerosRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @Autowired
    private CalculadoraService cacluadoraService;

    @PostMapping("/soma")
    public int soma(@RequestBody NumerosRequest numeros) {
        return cacluadoraService.somar(numeros.getNumero1(), numeros.getNumero2());

    }

    @PostMapping("/subtrair")
    public int subtrair(@RequestBody NumerosRequest numeros) {
        return cacluadoraService.subtrair(numeros.getNumero1(), numeros.getNumero2());
    }

    @PostMapping("/multiplicar")
    public int multiplicar(@RequestBody NumerosRequest numeros) {
        return cacluadoraService.multiplicar(numeros.getNumero1(), numeros.getNumero2());
    }

    @PostMapping("/dividir")
    public double dividir(@RequestBody NumerosRequest numeros) {
        return cacluadoraService.dividir(numeros.getNumero1(), numeros.getNumero2());
    }
}
