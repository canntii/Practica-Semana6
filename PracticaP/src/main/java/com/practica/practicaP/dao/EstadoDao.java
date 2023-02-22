/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica.practicaP.dao;

import com.practica.practicaP.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bcant
 */
public interface EstadoDao extends JpaRepository <Estado,Long> {
    
}
