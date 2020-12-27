package com.example.mongoDB.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Produit {
    @Id
    private Integer id;
    private String name;
    private Double prix;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Produit(Integer id, String name, Double prix) {
        this.id = id;
        this.name = name;
        this.prix = prix;
    }
}
