/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.practicaP.controller;

import com.practica.practicaP.domain.Estado;
import com.practica.practicaP.service.EstadoService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j

public class estadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/")
    public String inicio(Model model) {
        var estados = estadoService.getEstados();
        model.addAttribute("estados", estados);
        return "index";
    }

    @GetMapping("/estado/nuevo")
    public String estadoNuevo(Estado estado) {
        return "modificaEstado";

    }

    @PostMapping("/estado/guardar")
    public String clienteGuardar(Estado estado) {
        estadoService.save(estado);
        return "redirect:/";
    }

    @GetMapping("/estado/eliminar/{idEstado}")
    public String clienteEliminar(Estado estado) {
        estadoService.delete(estado);
        return "redirect:/";
    }

    @GetMapping("/estado/modificar/{idEstado}")
    public String clienteModificar(Estado estado, Model model) {
        estado = estadoService.getEstado(estado);
        model.addAttribute("estado", estado);
        return "modificaEstado";
    }

}
