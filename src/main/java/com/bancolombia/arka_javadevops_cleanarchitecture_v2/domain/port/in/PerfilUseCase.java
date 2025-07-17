package com.bancolombia.arka_javadevops_cleanarchitecture_v2.domain.port.in;

import java.util.List;

import com.bancolombia.arka_javadevops_cleanarchitecture_v2.domain.model.Perfil;

public interface PerfilUseCase {

    List<Perfil> getAllPerfiles();
    Perfil getPerfilById(int idPerfil);
    Perfil createPerfil(Perfil perfil);
    Perfil updatePerfil(int idPerfil, Perfil perfil);
    void deletePerfil(int idPerfil);
}
