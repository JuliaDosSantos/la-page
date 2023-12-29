package com.js.lapage.service;

import com.js.lapage.model.Livro;
import com.js.lapage.model.dtos.LivroUsuarioDTO;
import com.js.lapage.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    LivroRepository livroRepository;

    @Autowired
    UsuarioService usuarioService;

    public void salvarLivro(Livro livro){
        livroRepository.save(livro);
    }

    public void deletarLivro(LivroUsuarioDTO livroUsuarioDTO){
        Optional<Livro> livroOptional = livroRepository.findById(livroUsuarioDTO.getIdLivro());
        usuarioService.deletarLivroUsuario(livroUsuarioDTO);
        livroRepository.deleteById(livroUsuarioDTO.getIdLivro());
    }
}
