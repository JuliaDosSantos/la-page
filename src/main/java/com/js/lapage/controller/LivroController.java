package com.js.lapage.controller;

import com.js.lapage.model.Livro;
import com.js.lapage.model.SucessResponse;
import com.js.lapage.model.dtos.LivroUsuarioDTO;
import com.js.lapage.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    LivroService livroService;

    @PostMapping
    public SucessResponse cadastro(@RequestBody Livro livro) {
        livroService.salvarLivro(livro);
        return SucessResponse.create("Livro cadastrado");
    }

    @PutMapping("/alterar")
    public SucessResponse alterarLivro(@RequestBody Livro livro){
        livroService.salvarLivro(livro);
        return SucessResponse.create("Livro alterado");
    }

    @DeleteMapping("/deletar")
    public SucessResponse deletarLivro(@RequestBody LivroUsuarioDTO livroUsuarioDTO){
        livroService.deletarLivro(livroUsuarioDTO);
        return SucessResponse.create("Livro deletado");
    }

}
