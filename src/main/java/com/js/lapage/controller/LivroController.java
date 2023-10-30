package com.js.lapage.controller;

import com.js.lapage.model.Livro;
import com.js.lapage.model.SucessResponse;
import com.js.lapage.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    LivroService livroService;

    @PostMapping
    public SucessResponse cadastro(@RequestBody Livro livro) {
        livroService.cadastro(livro);
        return SucessResponse.create("Livro cadastrado");
    }

}
