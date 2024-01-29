/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Terrain.Controller;


import com.example.Terrain.Repository.UtilisateurRepository;
import com.example.Terrain.modele.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author IRINTSOA
 */
@RestController
@RequestMapping("/Utilisateur")
public class UtilisateurController {
    @Autowired
    UtilisateurRepository utilisateurRepository;
    
    @GetMapping("/insert")
    public Utilisateur insert(@RequestBody Utilisateur u){
    u = utilisateurRepository.save(u);
        return u;
   
    }
    
    @GetMapping("/delete")
    public void delete(@RequestParam Integer u){
    utilisateurRepository.deleteById(u);
    
    }
    
    
      @GetMapping("/update")
    public void update(@RequestBody Utilisateur u){
//    utilisateurRepository.update(u.getEmail(), u.getMdp(), u.getIdUtilisateur());
    
    }
    
    @PostMapping("/login")
    public Utilisateur login(@RequestBody Utilisateur u){  
        u = utilisateurRepository.login(u.getEmail(), u.getMdp());
    return u;
    
    }
    
}

