package br.com.marcosf.gestao_vagas.modules.estagiario.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcosf.gestao_vagas.modules.estagiario.entities.EstagiarioEntity;
import br.com.marcosf.gestao_vagas.modules.estagiario.useCases.CreateEstagiarioUseCase;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/estagiario")
public class EstagiarioController {
    
    @Autowired
    private CreateEstagiarioUseCase createEstagiarioUseCase;

    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody EstagiarioEntity estagiarioEntity) {
       try{
            var result =  this.createEstagiarioUseCase.save(estagiarioEntity);
            return ResponseEntity.ok().body(result);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
