package com.bancolombia.arka_javadevops_cleanarchitecture_v2.infrastructure.adapter.out.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "perfiles")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PerfilEntity {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int idPerfil;

    @NotBlank(message = "El nombre del perfil no puede estar vacío")
    @NotNull(message = "El nombre del perfil no puede ser nulo")
    @Max(value = 30, message = "El nombre del perfil no puede exceder los 30 caracteres")
    private String nombrePerfil;

}
