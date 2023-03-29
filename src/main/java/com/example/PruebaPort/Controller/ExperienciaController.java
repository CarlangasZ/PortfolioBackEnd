/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PruebaPort.Controller;

import com.example.PruebaPort.Model.Experiencias;
import com.example.PruebaPort.Service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experiencias")
@CrossOrigin(origins = "https://portfolio-carlosheredia.web.app")
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expService;
    
    @GetMapping
    public List<Experiencias> obtenerTodasLasExperiencias(){
        return expService.obtenerTodasLasExperiencias();
    }
    
    @GetMapping("/{id}")
    public Experiencias obtenerExperienciaPorId(@PathVariable Long id){
        return expService.obtenerExperienciaPorId(id);
    }
    
    //crear columna permanente
    
    @PostMapping("/crearExp")
    public void crearExperiencia(@RequestBody Experiencias exp){
        expService.crearExperiencia(exp);
    }
    
    
    @PutMapping("/{id}")
    public void actualizarExperiencia(@PathVariable Long id, @RequestBody Experiencias exp) {
        expService.actualizarExperiencia(id, exp);
    }

    @DeleteMapping("/{id}")
    public void eliminarExperienciaPorId(@PathVariable Long id){
        expService.eliminarExperienciaPorId(id);
    }

    
}
