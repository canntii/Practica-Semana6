/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.practicaP.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class Estado {
    private static final long serialVersionUID = 1L; 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;
    private String nombre_estado;
    private String capital_estado;
    private String poblacion_estado;
    private boolean costa_estado; 
    
    public Estado(){
    }

    public Estado(String nombre_estado, String capital_estado, String poblacion_estado, boolean costa_estado) {
        
        
        this.nombre_estado = nombre_estado;
        this.capital_estado = capital_estado;
        this.poblacion_estado = poblacion_estado;
        this.costa_estado = costa_estado;
    }
 
    
}
