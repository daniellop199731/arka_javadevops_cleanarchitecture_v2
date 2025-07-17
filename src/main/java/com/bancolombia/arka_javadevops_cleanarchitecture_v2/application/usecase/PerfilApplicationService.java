package com.bancolombia.arka_javadevops_cleanarchitecture_v2.application.usecase;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bancolombia.arka_javadevops_cleanarchitecture_v2.domain.model.Perfil;
import com.bancolombia.arka_javadevops_cleanarchitecture_v2.domain.port.in.PerfilUseCase;
import com.bancolombia.arka_javadevops_cleanarchitecture_v2.domain.port.out.PerfilRepositoryPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PerfilApplicationService implements PerfilUseCase {

    private final PerfilRepositoryPort perfilRepository;

    @Override
    public List<Perfil> getAllPerfiles() {
        // TODO Auto-generated method stub
        return perfilRepository.findAll();
    }

    @Override
    public Perfil getPerfilById(int idPerfil) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPerfilById'");
    }

    @Override
    public Perfil createPerfil(Perfil perfil) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPerfil'");
    }

    @Override
    public Perfil updatePerfil(int idPerfil, Perfil perfil) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePerfil'");
    }

    @Override
    public void deletePerfil(int idPerfil) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePerfil'");
    }

}
