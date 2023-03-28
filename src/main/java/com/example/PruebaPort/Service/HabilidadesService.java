/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PruebaPort.Service;

import com.example.PruebaPort.Model.Habilidades;
import com.example.PruebaPort.Repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class HabilidadesService implements IHabilidadesService{
    
    @Autowired
    private HabilidadesRepository habilidadRepository;
    
    
    @Override
    public void crearHabilidad(Habilidades hab){
    
         habilidadRepository.save(hab);
        
    }

     @Override
    public Habilidades obtenerHabilidadPorId(Long id) {
        return habilidadRepository.findById(id).orElseThrow(() -> new ResponseStatusException
        (HttpStatus.NOT_FOUND, "No se encontro la Habilidad"));
    }
    
    @Override
    public List<Habilidades> obtenerTodasLasHabilidades(){
        return habilidadRepository.findAll();
    }
    
    
     
    //Sirve para actualizar una habilidad especificada por el ID
    @Override
    public void actualizarHabilidad(Long id, Habilidades hab) {
        Habilidades habilidadActualizada = habilidadRepository.findById(id).orElseThrow(() -> new ResponseStatusException
        (HttpStatus.NOT_FOUND, "No se encontro la Habilidad"));
        habilidadActualizada.setTitulo(hab.getTitulo());
        habilidadActualizada.setDescripcion(hab.getDescripcion());
        habilidadRepository.save(habilidadActualizada);
    }
    
    @Override
    public void eliminarHabilidadPorId(Long id){
        habilidadRepository.deleteById(id);
    }
    
}
