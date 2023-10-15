package com.js.lapage.service;

import com.js.lapage.model.Usuario;
import com.js.lapage.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;
    public void cadastro(Usuario usuario) {
        if (usuarioRepository.findByEmail(usuario.getEmail()) == null) {
            if (usuarioRepository.findByUsername(usuario.getUsername()) == null){
                usuarioRepository.save(usuario);
            }
        }
    }



}
