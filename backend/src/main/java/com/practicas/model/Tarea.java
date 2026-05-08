package com.practicas.model;

import java.security.Timestamp;

public class Tarea {
    
    // Atributos de la tarea
    public String id;
    public String titulo;
    public String descripcion;
    public Timestamp fechaCreacion;
    public boolean completada;

    // Constructor
    public Tarea(String id, String titulo, String descripcion, Timestamp fechaCreacion, boolean completada) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.completada = completada;
    }

    // Getters y setters
    public String getId() {
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
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", completada=" + completada +
                '}';
    }
}
