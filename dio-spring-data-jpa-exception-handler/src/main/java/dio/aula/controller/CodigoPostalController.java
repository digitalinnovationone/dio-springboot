package dio.aula.controller;

import dio.aula.handler.BusinessException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cep")
public class CodigoPostalController {
    @GetMapping("/{ibge}")
    public String getCidade(@PathVariable String ibge){
        if(ibge.equals("3550308"))
            return "São Paulo";
        else
            throw new BusinessException("Não localizamos nenhuma cidade com o código informado.");
    }

}
