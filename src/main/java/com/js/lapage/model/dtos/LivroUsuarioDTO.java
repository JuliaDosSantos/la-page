package com.js.lapage.model.dtos;

import lombok.Data;

@Data
public class LivroUsuarioDTO {

    private Integer idLivro;

    private Integer idUsuario;

    public Integer getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Integer idLivro) {
        this.idLivro = idLivro;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
}
