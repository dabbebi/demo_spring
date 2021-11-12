package org.demo.demo_spring;

import org.demo.demo_spring.enitities.Compte;
import org.demo.demo_spring.enums.TypeCompte;
import org.demo.demo_spring.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class DemoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository compteRepository){
        return args -> {
            compteRepository.save(new Compte(null, 1530, new Date(), TypeCompte.COURANT));
            compteRepository.save(new Compte(null, 2600, new Date(), TypeCompte.EPARGNE));
            compteRepository.save(new Compte(null, 4860, new Date(), TypeCompte.COURANT));
            compteRepository.save(new Compte(null, 1000, new Date(), TypeCompte.EPARGNE));
            compteRepository.save(new Compte(null, 8889, new Date(), TypeCompte.COURANT));
            compteRepository.save(new Compte(null, 960, new Date(), TypeCompte.EPARGNE));

        };
    }
}
