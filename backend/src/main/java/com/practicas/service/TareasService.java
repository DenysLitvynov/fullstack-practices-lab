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
        try {
            tarea.fechaCreacion = new java.sql.Timestamp(System.currentTimeMillis());
            tareasRepository.persistir(tarea);
        } catch (Exception e) {
            // Manejo de errores
            e.printStackTrace();
        }
    }

    public List<Tarea> listarTareas() {
        // Lógica para obtener todas las tareas de la base de datos
        try {
            return tareasRepository.listarTodas();
        } catch (Exception e) {
            // Manejo de errores
            e.printStackTrace();
            return null;
        }
    }

    public Tarea obtenerTareaPorId(long id) {
        // Lógica para obtener una tarea por su ID de la base de datos
        try {
            return tareasRepository.buscarPorId(id);
        } catch (Exception e) {
            // Manejo de errores
            e.printStackTrace();
            return null;
        }
    }

    @Transactional
    public void marcarTareaComoCompletada(long id) {
        // Lógica para marcar una tarea como completada en la base de datos
        try {
            Tarea tarea = tareasRepository.buscarPorId(id);
            if (tarea != null) {
                tarea.completada = true;
                tareasRepository.persistir(tarea);
            }
        } catch (Exception e) {
            // Manejo de errores
            e.printStackTrace();
        }
    }

    @Transactional
    public void eliminarTarea(long id) {
        // Lógica para eliminar una tarea de la base de datos
        try {
            tareasRepository.eliminar(id);
        } catch (Exception e) {
            // Manejo de errores
            e.printStackTrace();
        }
    }

}
