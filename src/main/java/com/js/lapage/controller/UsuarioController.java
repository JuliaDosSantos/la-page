package com.js.lapage.controller;


import com.js.lapage.model.SucessResponse;
import com.js.lapage.model.Usuario;
import com.js.lapage.model.dtos.LivroUsuarioDTO;
import com.js.lapage.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public SucessResponse cadastro(@RequestBody Usuario usuario) {
        usuarioService.cadastro(usuario);
        return SucessResponse.create("Usuário Cadastrado");
    }

    @PostMapping("/adicionarlivro")
    public SucessResponse cadastroLivroUsuario(@RequestBody LivroUsuarioDTO livroUsuarioDTO) {
        usuarioService.cadastroLivroUsuario(livroUsuarioDTO);
        return SucessResponse.create("Livro adicionado ao usuário");
    }

    @DeleteMapping("/deletar/{id}")
    public SucessResponse deletarLivroUsuario(@RequestBody LivroUsuarioDTO livroUsuarioDTO){
        usuarioService.deletarLivroUsuario(livroUsuarioDTO);
        return SucessResponse.create("Livro removido do usuário");
    }
}
