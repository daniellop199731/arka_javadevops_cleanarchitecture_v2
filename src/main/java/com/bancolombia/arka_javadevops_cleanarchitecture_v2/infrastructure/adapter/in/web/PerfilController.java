package com.bancolombia.arka_javadevops_cleanarchitecture_v2.infrastructure.adapter.in.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancolombia.arka_javadevops_cleanarchitecture_v2.domain.model.Perfil;
import com.bancolombia.arka_javadevops_cleanarchitecture_v2.domain.port.in.PerfilUseCase;
import com.bancolombia.arka_javadevops_cleanarchitecture_v2.infrastructure.adapter.in.web.dto.PerfilDto;
import com.bancolombia.arka_javadevops_cleanarchitecture_v2.infrastructure.adapter.in.web.mapper.PerfilWebMapper;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// Controlador REST para manejar las solicitudes relacionadas con el Perfil
// Utiliza el caso de uso PerfilUseCase para interactuar con la lógica de negocio
@RestController
@RequestMapping("/perfiles")
@RequiredArgsConstructor
public class PerfilController {

    private final PerfilUseCase perfilUseCase;
    private final PerfilWebMapper mapper;

    @GetMapping("")
    public ResponseEntity<List<PerfilDto>> getAllPerfiles() {
        List<Perfil> perfiles = perfilUseCase.getAllPerfiles();
        List<PerfilDto> perfilesDto = perfiles.stream()
            .map(mapper::toDto)
            .collect(Collectors.toList());

        return ResponseEntity.ok(perfilesDto);
    }

    @GetMapping("/{idPerfil}")
    public ResponseEntity<PerfilDto> getPerfilById(@PathVariable int idPerfil) {
        Perfil perfil = perfilUseCase.getPerfilById(idPerfil);
        PerfilDto perfilDto = mapper.toDto(perfil);
        return ResponseEntity.ok(perfilDto);
    }

    @PostMapping("/createPerfil")
    public ResponseEntity<PerfilDto> createPerfil(@Valid @RequestBody PerfilDto perfilDto) {
        Perfil perfil = mapper.toModel(perfilDto);
        Perfil perfilSaved = perfilUseCase.createPerfil(perfil);
        return ResponseEntity.ok(mapper.toDto(perfilSaved));
    }

    @DeleteMapping("/deletePerfil/{idPerfil}")
    public ResponseEntity<Void> deletePerfil(@PathVariable int idPerfil) {
        if(perfilUseCase.deletePerfil(idPerfil)){
            return ResponseEntity.ok().build();
        };
        return ResponseEntity.notFound().build();
    }
    
    
    
	
}
