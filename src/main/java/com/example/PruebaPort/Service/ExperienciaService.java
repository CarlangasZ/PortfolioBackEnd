/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PruebaPort.Service;

import com.example.PruebaPort.Model.Experiencias;
import com.example.PruebaPort.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    private ExperienciaRepository experienciaRepository;
    
    
    @Override
    public void crearExperiencia(Experiencias exp){
    
         experienciaRepository.save(exp);
        
    }

     @Override
    public Experiencias obtenerExperienciaPorId(Long id) {
        return experienciaRepository.findById(id).orElseThrow(() -> new ResponseStatusException
        (HttpStatus.NOT_FOUND, "No se encontro la Experiencia"));
    }
    
    @Override
    public List<Experiencias> obtenerTodasLasExperiencias(){
        return experienciaRepository.findAll();
    }
    
    @Override
    public void actualizarExperiencia(Long id, Experiencias exp) {
        Experiencias experienciaActualizada = experienciaRepository.findById(id).orElseThrow(() -> new ResponseStatusException
        (HttpStatus.NOT_FOUND, "No se encontro la Experiencia"));
        experienciaActualizada.setDescripcion(exp.getDescripcion());
        experienciaActualizada.setFechaInicio(exp.getFechaInicio());
        experienciaActualizada.setFechaFin(exp.getFechaFin());
        experienciaActualizada.setTitulo(exp.getTitulo());
        experienciaRepository.save(experienciaActualizada);
    }
    
    @Override
    public void eliminarExperienciaPorId(Long id){
        experienciaRepository.deleteById(id);
    }
    
}
