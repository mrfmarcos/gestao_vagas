package br.com.marcosf.gestao_vagas.modules.estagiario.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marcosf.gestao_vagas.modules.estagiario.entities.EstagiarioEntity;
import br.com.marcosf.gestao_vagas.modules.estagiario.repositories.EstagiarioRepository;

@Service
public class CreateEstagiarioUseCase {
    
@Autowired
private EstagiarioRepository estagiarioRepository;

    public EstagiarioEntity save(EstagiarioEntity estagiarioEntity){

        return this.estagiarioRepository.save(estagiarioEntity);
    }

}
