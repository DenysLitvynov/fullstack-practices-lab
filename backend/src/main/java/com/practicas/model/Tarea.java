package com.practicas.model;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Clase preparada para trabajar con Hibernate ORM Panache

@Entity
public class Tarea {
    
    // Atributos de la tarea
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String titulo;
    public String descripcion;
    public Timestamp fechaCreacion;
    public boolean completada;

    // Constructores
    public Tarea() {
        // Constructor vacío para Hibernate
    }

    public Tarea(long id, String titulo, String descripcion, Timestamp fechaCreacion, boolean completada) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.completada = completada;
    }

    // Getters y setters
    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    // toString para facilitar la impresión de la tarea
    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", completada=" + completada +
                '}';
    }
}
