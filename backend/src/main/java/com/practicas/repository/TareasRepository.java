package com.practicas.repository;

import java.util.List;
import com.practicas.model.Tarea;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TareasRepository implements PanacheRepository<Tarea> {

    public void persistir(Tarea tarea) {
        // Lógica de BD
        persist(tarea);
    }

    public List<Tarea> listarTodas() {
        return listAll();
    }

    public Tarea buscarPorId(long id) {
        return findById(id);
    }

    public void eliminar(long id) {
        // Lógica de BD
        deleteById(id);
    }
}