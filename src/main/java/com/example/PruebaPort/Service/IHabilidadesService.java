/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PruebaPort.Service;

import com.example.PruebaPort.Model.Habilidades;
import java.util.List;

public interface IHabilidadesService {
    
    public List<Habilidades> obtenerTodasLasHabilidades();
    public Habilidades obtenerHabilidadPorId(Long id);
    public void eliminarHabilidadPorId(Long id);
    public void actualizarHabilidad(Long id, Habilidades hab);
    public void crearHabilidad(Habilidades hab);
    
}
