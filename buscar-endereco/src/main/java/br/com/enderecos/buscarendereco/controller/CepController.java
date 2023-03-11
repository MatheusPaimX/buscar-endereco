package br.com.enderecos.buscarendereco.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.enderecos.buscarendereco.model.Cep;
import br.com.enderecos.buscarendereco.service.CepService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/endereco")
@RestController
public class CepController {
    
    private final CepService servico;

    @GetMapping("/consultar")
    public ResponseEntity verCep(@RequestBody Cep cep){
        return ResponseEntity.ok(servico.pegar(cep));
    }
}
