package br.com.marcosf.gestao_vagas.modules.estagiario.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marcosf.gestao_vagas.modules.estagiario.entities.EstagiarioEntity;

public interface EstagiarioRepository extends JpaRepository<EstagiarioEntity, UUID>{
    
}
