package com.js.lapage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String booksName;
    private Integer numberOfPages;
    private Integer numberOfPagesRead;
    private String synopsis;
    private Boolean currentBook;
    private Boolean read;
    private Integer idUsuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBooksName() {
        return booksName;
    }

    public void setBooksName(String booksName) {
        this.booksName = booksName;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Integer getNumberOfPagesRead() {
        return numberOfPagesRead;
    }

    public void setNumberOfPagesRead(Integer numberOfPagesRead) {
        this.numberOfPagesRead = numberOfPagesRead;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Boolean getCurrentBook() {
        return currentBook;
    }

    public void setCurrentBook(Boolean currentBook) {
        this.currentBook = currentBook;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
}
