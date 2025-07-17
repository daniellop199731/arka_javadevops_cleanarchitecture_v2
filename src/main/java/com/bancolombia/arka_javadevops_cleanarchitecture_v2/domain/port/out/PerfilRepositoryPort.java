package com.bancolombia.arka_javadevops_cleanarchitecture_v2.domain.port.out;

import java.util.List;
import java.util.Optional;

import com.bancolombia.arka_javadevops_cleanarchitecture_v2.domain.model.Perfil;

public interface PerfilRepositoryPort {

    List<Perfil> findAll();
    Optional<Perfil> findById(int idPerfil);
    Perfil save(Perfil perfil);
    void deleteById(int idPerfil);
    boolean existsById(int idPerfil);
}
