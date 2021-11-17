package org.demo.demo_spring.web;

import org.demo.demo_spring.enitities.Compte;
import org.demo.demo_spring.repositories.CompteRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompteRestController {

    private CompteRepository compteRepository;
    public CompteRestController(CompteRepository compteRepository){
        this.compteRepository = compteRepository;
    }
    @GetMapping(path = "/comptes")
    public List<Compte> listCompte(){
        return compteRepository.findAll();
    }

    @GetMapping(path = "/comptes/{id}")
    public Compte getCompte(@PathVariable(name = "id") Long id){
        return compteRepository.findById(id).get();
    }

    @PostMapping(path = "/comptes")
    public Compte save(@RequestBody Compte compte){
        return compteRepository.save(compte);
    }

    @PutMapping(path = "/comptes/{code}")
    public Compte update(@RequestBody Compte compte,@PathVariable(name = "code") Long code){
        compte.setCode(code);
        return compteRepository.save(compte);
    }

    @DeleteMapping (path = "/comptes/{code}")
    public void delete(@PathVariable(name = "code") Long code){
        compteRepository.deleteById(code);
    }

}
