package com.js.lapage.service;

import com.js.lapage.exceptions.ValidationException;
import com.js.lapage.model.Usuario;
import com.js.lapage.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;
    public void cadastro(Usuario usuario) {
        validacoes(usuario);
        usuarioRepository.save(usuario);
    }

    public void validacoes(Usuario usuario){
        if (usuarioRepository.findByEmail(usuario.getEmail()) != null) {
            throw new ValidationException("Este e-mail já possuí conta cadastrada");
        }

        if (usuarioRepository.findByUsername(usuario.getUsername()) != null) {
            throw new ValidationException("Este username já possuí conta cadastrada");
        }
    }

}
