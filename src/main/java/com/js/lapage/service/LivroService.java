package com.js.lapage.service;

import com.js.lapage.model.Livro;
import com.js.lapage.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    LivroRepository livroRepository;

    public void cadastro(Livro livro){
        livroRepository.save(livro);
    }
}
