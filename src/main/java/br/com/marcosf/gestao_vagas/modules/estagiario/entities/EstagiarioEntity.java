package br.com.marcosf.gestao_vagas.modules.estagiario.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity(name="estagiario")
public class EstagiarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message="Este campo não pode ficar vazio")
    private String name;
    private String description;

    @CreationTimestamp
    private LocalDateTime createat;
}
