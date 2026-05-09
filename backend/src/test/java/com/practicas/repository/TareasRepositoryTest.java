package com.practicas.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;
import com.practicas.model.Tarea;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class TareasRepositoryTest {
    
    @Inject
    TareasRepository tareasRepository;

    @Test
    @Transactional
    public void testPersistirYBuscar() {
        // 1. Crear una tarea de prueba
        Tarea tarea = new Tarea();
        tarea.titulo = "Tarea de prueba";
        tarea.descripcion = "Descripción de la tarea de prueba";
        tarea.fechaCreacion = new java.sql.Timestamp(System.currentTimeMillis());

        // 2. Persistir la tarea en la base de datos
        tareasRepository.persistir(tarea);

        // 3. Buscar la tarea por su ID
        Tarea tareaEncontrada = tareasRepository.buscarPorId(tarea.id);
        // 4. Verificar que la tarea encontrada no sea nula y tenga los mismos datos
        assertNotNull(tareaEncontrada);
        assertEquals("Tarea de prueba", tareaEncontrada.getTitulo()); 
    }

}
