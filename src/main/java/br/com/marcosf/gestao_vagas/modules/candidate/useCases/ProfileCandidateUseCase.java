package br.com.marcosf.gestao_vagas.modules.candidate.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marcosf.gestao_vagas.exceptions.UserNotFoundException;
import br.com.marcosf.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.marcosf.gestao_vagas.modules.candidate.dto.ProfileCandidateResposeDTO;

@Service
public class ProfileCandidateUseCase {
    
    @Autowired
    private CandidateRepository candidateRepository;

    public ProfileCandidateResposeDTO execute(UUID idCandidate){
        var candidate = this.candidateRepository.findById(idCandidate)
            .orElseThrow(() -> {
                throw new UserNotFoundException();
            });
    
        var candidateDTO = ProfileCandidateResposeDTO.builder()
        .description(candidate.getDescripition())
        .username(candidate.getUsername())
        .email(candidate.getEmail())
        .name(candidate.getName())
        .id(candidate.getId())
        .build();

        return candidateDTO;
    }
 
}
