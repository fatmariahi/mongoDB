package com.example.mongoDB.config;

import com.example.mongoDB.document.Users;
import com.example.mongoDB.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsersRepository usersRepository){
        return strings-> {
            usersRepository.save(new Users(1, "Fatma", "22255594"));
            usersRepository.save(new Users(2, "khawla", "22156755"));
        };
    }
}
