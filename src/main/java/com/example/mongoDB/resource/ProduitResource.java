package com.example.mongoDB.resource;

import com.example.mongoDB.document.Produit;
import com.example.mongoDB.repository.ProduitRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produit")
public class ProduitResource {
    private ProduitRepository produitRepository;

    public ProduitResource(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @GetMapping("/all")
    public List<Produit> getAll(){
        return produitRepository.findAll();
    }
}
