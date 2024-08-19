package one.digitalinnovation.lab.gof.service;


import one.digitalinnovation.lab.gof.model.Endereco;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "viacep", url = "http://viacep.com.br/")
public interface ViaCepService {

    @GetMapping ("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
