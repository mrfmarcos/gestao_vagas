package br.com.marcosf.gestao_vagas.modules.candidate.dto;

import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProfileCandidateResposeDTO {
    
    @Schema(example = "Desenvolvedor Java")
    private String description;

    @Schema(example = "marcos")
    private String username;

    @Schema(example = "java@dominio.com.br")
    private String email;

    private UUID id;

    @Schema(example = "Marcos Freitas")
    private String name;
}
