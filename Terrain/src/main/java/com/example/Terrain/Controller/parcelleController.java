/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Terrain.Controller;

import com.example.Terrain.Repository.ParcelleRepository;
import com.example.Terrain.modele.Parcelle;
import java.util.List;
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
@RequestMapping("/Parcelle")
public class parcelleController {
    @Autowired
    ParcelleRepository parcelleRepo;
   
     @GetMapping("/insert")
    public Parcelle insert(@RequestBody Parcelle p){
        p = parcelleRepo.save(p);
        return p;
    }
    
      @GetMapping("/delete")
    public void delete(@RequestParam Integer t){
    parcelleRepo.deleteById(t);
    
    }
     @GetMapping("/all")
    public List<Parcelle> all() {
    return parcelleRepo.findAll();
    }

}
