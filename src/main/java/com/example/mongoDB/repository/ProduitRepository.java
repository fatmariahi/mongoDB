package com.example.mongoDB.repository;

import com.example.mongoDB.document.Produit;
import com.example.mongoDB.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProduitRepository extends MongoRepository<Produit, Integer> {

}
