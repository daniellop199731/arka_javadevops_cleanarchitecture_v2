package com.bancolombia.arka_javadevops_cleanarchitecture_v2.infrastructure.adapter.out.persistence.mapper;

import org.springframework.stereotype.Component;

import com.bancolombia.arka_javadevops_cleanarchitecture_v2.domain.model.Usuario;
import com.bancolombia.arka_javadevops_cleanarchitecture_v2.infrastructure.adapter.out.persistence.entity.UsuarioEntity;

@Component
public class UsuarioMapper {

    public Usuario toModel(UsuarioEntity usuarioEntity) {
        if (usuarioEntity == null) {
            return null;
        }
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(usuarioEntity.getIdUsuario());
        usuario.setIdentificacionUsuario(usuarioEntity.getIdentificacionUsuario());
        usuario.setCorreoElectronicoUsuario(usuarioEntity.getCorreoElectronicoUsuario());
        usuario.setNombresUsuario(usuarioEntity.getNombresUsuario());
        usuario.setApellidosUsuario(usuarioEntity.getApellidosUsuario());
        usuario.setDireccionDespachoUsuario(usuarioEntity.getDireccionDespachoUsuario());
        usuario.setContrasennaUsuario(usuarioEntity.getContrasennaUsuario());
        usuario.setNicknameUsuario(usuarioEntity.getNicknameUsuario());
        usuario.setPerfil(new PerfilMapper().toDomain(usuarioEntity.getPerfil()));
        return usuario;
    }

    public UsuarioEntity toEntity(Usuario usuario) {
        if (usuario == null) {
            return null;
        }
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setIdUsuario(usuario.getIdUsuario());
        usuarioEntity.setIdentificacionUsuario(usuario.getIdentificacionUsuario());
        usuarioEntity.setCorreoElectronicoUsuario(usuario.getCorreoElectronicoUsuario());
        usuarioEntity.setNombresUsuario(usuario.getNombresUsuario());
        usuarioEntity.setApellidosUsuario(usuario.getApellidosUsuario());
        usuarioEntity.setDireccionDespachoUsuario(usuario.getDireccionDespachoUsuario());
        usuarioEntity.setContrasennaUsuario(usuario.getContrasennaUsuario());
        usuarioEntity.setNicknameUsuario(usuario.getNicknameUsuario());
        usuarioEntity.setPerfil(new PerfilMapper().toEntity(usuario.getPerfil()));
        return usuarioEntity;
    }

}
