package com.bancolombia.arka_javadevops_cleanarchitecture_v2.infrastructure.adapter.in.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancolombia.arka_javadevops_cleanarchitecture_v2.domain.model.Perfil;
import com.bancolombia.arka_javadevops_cleanarchitecture_v2.domain.port.in.PerfilUseCase;
import com.bancolombia.arka_javadevops_cleanarchitecture_v2.infrastructure.adapter.in.web.dto.PerfilDto;
import com.bancolombia.arka_javadevops_cleanarchitecture_v2.infrastructure.adapter.in.web.mapper.PerfilWebMapper;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

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
    
	
}
