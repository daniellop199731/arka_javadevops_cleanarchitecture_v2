package com.bancolombia.arka_javadevops_cleanarchitecture_v2.infrastructure.adapter.out.persistence;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.bancolombia.arka_javadevops_cleanarchitecture_v2.domain.model.Perfil;
import com.bancolombia.arka_javadevops_cleanarchitecture_v2.domain.port.out.PerfilRepositoryPort;
import com.bancolombia.arka_javadevops_cleanarchitecture_v2.infrastructure.adapter.out.persistence.entity.PerfilEntity;
import com.bancolombia.arka_javadevops_cleanarchitecture_v2.infrastructure.adapter.out.persistence.mapper.PerfilMapper;
import com.bancolombia.arka_javadevops_cleanarchitecture_v2.infrastructure.adapter.out.persistence.repository.PerfilJpaRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PerfilPersistenceAdapter implements PerfilRepositoryPort {

    private final PerfilJpaRepository repository;
    private final PerfilMapper mapper;


    @Override
    public List<Perfil> findAll() {
        List<PerfilEntity> perfilEntities = (List<PerfilEntity>) repository.findAll();
        return perfilEntities.stream()
            .map(mapper::toDomain)
            .collect(Collectors.toList());
    }

    @Override
    public Optional<Perfil> findById(int idPerfil) {
        return repository.findById(idPerfil).map(mapper::toDomain);
    }

    @Override
    public Perfil save(Perfil perfil) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void deleteById(int idPerfil) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public boolean existsById(int idPerfil) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }
    
}
