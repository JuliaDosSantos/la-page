package com.js.lapage.service;

import com.js.lapage.exceptions.ValidationException;
import com.js.lapage.model.Livro;
import com.js.lapage.model.Usuario;
import com.js.lapage.model.dtos.LivroUsuarioDTO;
import com.js.lapage.repository.LivroRepository;
import com.js.lapage.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;
    
    @Autowired
    LivroRepository livroRepository;
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

    @Transactional
    public void cadastroLivroUsuario(LivroUsuarioDTO livroUsuarioDTO){
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(livroUsuarioDTO.getIdUsuario());
        Optional<Livro> livroOptional = livroRepository.findById(livroUsuarioDTO.getIdLivro());
        
        if (!usuarioOptional.isPresent()){
            throw new ValidationException("Usuário não encontrado");
        }

        if (!livroOptional.isPresent()){
            throw new ValidationException("Livro não encontrado");
        }

        Usuario usuario = usuarioOptional.get();
        Livro livro = livroOptional.get();

        usuario.getLivros().add(livro);
        usuarioRepository.save(usuario);
    }
    @Transactional
    public void deletarLivroUsuario(LivroUsuarioDTO livroUsuarioDTO){
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(livroUsuarioDTO.getIdUsuario());
        Optional<Livro> livroOptional = livroRepository.findById(livroUsuarioDTO.getIdLivro());

        if (!usuarioOptional.isPresent()){
            throw new ValidationException("Usuário não encontrado");
        }

        if (!livroOptional.isPresent()){
            throw new ValidationException("Livro não encontrado");
        }

        Usuario usuario = usuarioOptional.get();
        Livro livro = livroOptional.get();

        usuario.getLivros().remove(livro);
        usuarioRepository.save(usuario);
    }
}
