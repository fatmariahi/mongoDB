package com.example.mongoDB.repository;

import com.example.mongoDB.document.Commande;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommandeRepository extends MongoRepository<Commande,Integer> {
}
