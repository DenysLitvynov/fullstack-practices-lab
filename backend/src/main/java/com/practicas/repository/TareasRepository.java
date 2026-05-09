package com.practicas.repository;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import com.arjuna.ats.internal.jdbc.drivers.modifiers.list;
import com.practicas.model.Tarea;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

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