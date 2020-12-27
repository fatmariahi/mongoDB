package com.example.mongoDB.resource;

import com.example.mongoDB.document.Commande;
import com.example.mongoDB.repository.CommandeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/commandes")
public class CommandeResource {
    private CommandeRepository commandeRepository;

    public CommandeResource(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @GetMapping("/all")
    public List<Commande> getAll(){
        return commandeRepository.findAll();
    }
}
