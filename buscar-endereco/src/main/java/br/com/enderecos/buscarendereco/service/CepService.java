package br.com.enderecos.buscarendereco.service;

import org.springframework.stereotype.Service;

import br.com.enderecos.buscarendereco.httpClient.EnderecoFeign;
import br.com.enderecos.buscarendereco.model.Cep;
import br.com.enderecos.buscarendereco.model.Endereco;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CepService {
    
    private final EnderecoFeign enderecoFeign;

    public Endereco pegar(Cep cep){
        return enderecoFeign.buscarEndereco(cep.getCep());
    }
}
