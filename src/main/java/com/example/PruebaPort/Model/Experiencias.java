/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PruebaPort.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Date;
import lombok.Data;

@Data
@Entity
public class Experiencias {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;
    
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
    }
    
    public void setFechaInicio(Date fechaInicio) {
    this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
    this.fechaFin = fechaFin;
    }   

}
