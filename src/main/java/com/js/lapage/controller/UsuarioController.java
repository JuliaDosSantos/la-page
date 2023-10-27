package com.js.lapage.controller;


import com.js.lapage.model.SucessResponse;
import com.js.lapage.model.Usuario;
import com.js.lapage.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
