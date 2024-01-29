/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Terrain.Repository;

import com.example.Terrain.modele.Parcelle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author IRINTSOA
 */
public interface ParcelleRepository extends JpaRepository<Parcelle, Integer>{
    
}
