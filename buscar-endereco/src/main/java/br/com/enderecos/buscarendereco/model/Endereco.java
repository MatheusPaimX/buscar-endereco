package br.com.enderecos.buscarendereco.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Endereco{
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
}