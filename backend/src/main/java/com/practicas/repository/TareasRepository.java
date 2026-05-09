package com.practicas.repository;

import java.util.List;

import com.practicas.model.Tarea;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TareasRepository {

    public void persistir(Tarea tarea) {
        // Lógica de BD
    }

    public List<Tarea> listarTodas() {
        return null;
    }

    public Tarea buscarPorId(String id) {
        return null;
    }

    public void eliminar(String id) {
        // Lógica de BD
    }
}