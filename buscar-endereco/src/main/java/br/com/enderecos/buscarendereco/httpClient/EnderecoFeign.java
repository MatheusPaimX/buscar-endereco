package br.com.enderecos.buscarendereco.httpClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.com.enderecos.buscarendereco.model.Endereco;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface EnderecoFeign {
    
    @GetMapping("{cep}/json")
    Endereco buscarEndereco(@PathVariable("cep") String cep);
}
