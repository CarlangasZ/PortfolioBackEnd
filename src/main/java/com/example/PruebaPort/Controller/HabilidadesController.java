/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PruebaPort.Controller;

import com.example.PruebaPort.Model.Habilidades;
import com.example.PruebaPort.Service.IHabilidadesService;
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
@RequestMapping("/habilidades")
@CrossOrigin(origins = "https://portfolio-carlosheredia.web.app")
public class HabilidadesController {
 
     @Autowired
    private IHabilidadesService habService;
    
    @GetMapping
    public List<Habilidades> obtenerTodasLasHabilidades(){
        return habService.obtenerTodasLasHabilidades();
    }
    
    @GetMapping("/{id}")
    public Habilidades obtenerHabilidadPorId(@PathVariable Long id){
        return habService.obtenerHabilidadPorId(id);
    }
    
    //crear columna permanente
    
    @PostMapping("/crearHab")
    public void crearHabilidad(@RequestBody Habilidades hab){
        habService.crearHabilidad(hab);
    }
    
    
    @PutMapping("/{id}")
    public void actualizarHabilidad(@PathVariable Long id, @RequestBody Habilidades hab) {
        habService.actualizarHabilidad(id, hab);
    }

    @DeleteMapping("/{id}")
    public void eliminarHabilidadPorId(@PathVariable Long id){
        habService.eliminarHabilidadPorId(id);
    }
    
}
