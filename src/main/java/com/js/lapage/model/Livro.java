package com.js.lapage.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Livro implements Serializable {

    private Integer id;
    private String booksName;
    private Integer numberOfPages;
    private Integer numberOfPagesRead;
    private String synopsis;
    private Boolean currentBook;
    private Boolean read;

}
