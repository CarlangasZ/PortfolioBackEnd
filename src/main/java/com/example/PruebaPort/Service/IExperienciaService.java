/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.PruebaPort.Service;

import com.example.PruebaPort.Model.Experiencias;
import java.util.List;

public interface IExperienciaService {
   
    public List<Experiencias> obtenerTodasLasExperiencias();
    public Experiencias obtenerExperienciaPorId(Long id);
    public void eliminarExperienciaPorId(Long id);
    public void actualizarExperiencia(Long id, Experiencias exp);
    public void crearExperiencia(Experiencias exp);

    
}
