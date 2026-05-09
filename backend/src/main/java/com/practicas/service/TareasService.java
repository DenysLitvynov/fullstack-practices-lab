package com.practicas.service;

import java.util.List;

import com.practicas.model.Tarea;
import com.practicas.repository.TareasRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class TareasService {
    
    private TareasRepository tareasRepository;

    @Inject
    public TareasService(TareasRepository tareasRepository) {
        this.tareasRepository = tareasRepository;
    }

    @Transactional
    public void crearTarea(Tarea tarea) {
        // Lógica para crear una tarea en la base de datos
    }

    public List<Tarea> listarTareas() {
        // Lógica para obtener todas las tareas de la base de datos
        return null;
    }

    public Tarea obtenerTareaPorId(String id) {
        // Lógica para obtener una tarea por su ID de la base de datos
        return null;
    }

    @Transactional
    public void marcarTareaComoCompletada(String id) {
        // Lógica para marcar una tarea como completada en la base de datos
    }

    @Transactional
    public void eliminarTarea(String id) {
        // Lógica para eliminar una tarea de la base de datos
    }

}
