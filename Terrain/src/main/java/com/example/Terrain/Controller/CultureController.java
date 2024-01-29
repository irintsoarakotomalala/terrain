/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Terrain.Controller;

import com.example.Terrain.Repository.CultureRepository;
import com.example.Terrain.modele.Culture;
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
@RequestMapping("/culture")
public class CultureController {
    
    @Autowired
    CultureRepository cultureRepository;
    
    @PostMapping("/insert")
    public Culture insert(@RequestBody Culture cul){
        return cultureRepository.save(cul);
    }
    
    @GetMapping("/all")
    public List<Culture> all()
    {
        return cultureRepository.findAll();
    }
          @GetMapping("/deleteCulture")
    public void delete(@RequestParam Integer c){
    cultureRepository.deleteById(c);
    
    }
    
}
