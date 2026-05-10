package com.practicas.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import jakarta.inject.Inject;
import com.practicas.model.Tarea;

import io.quarkus.test.junit.QuarkusTest;

// Tests para los métodos de TareasService

@QuarkusTest
public class TareasServiceTest {

    @Inject
    TareasService tareasService;

    public void testCrearYBuscarPorIdTarea() {
        // Lógica para probar la creación de una tarea
        Tarea tarea = new Tarea();
        tarea.titulo = "Tarea de prueba";
        tarea.descripcion = "Descripción de la tarea de prueba";
        tarea.fechaCreacion = new java.sql.Timestamp(System.currentTimeMillis());

        tareasService.crearTarea(tarea);

        Tarea tareaBuscada = tareasService.obtenerTareaPorId(tarea.id);
        assertNotNull(tareaBuscada);
        assertEquals("Tarea de prueba", tareaBuscada.getTitulo());

    }

    public void testListarTareas() {
        // Lógica para probar la obtención de todas las tareas
        for (int i = 0; i < 5; i++) {
            Tarea tarea = new Tarea();
            tarea.titulo = "Tarea " + i;
            tarea.descripcion = "Descripción de la tarea " + i;
            tarea.fechaCreacion = new java.sql.Timestamp(System.currentTimeMillis());
            tareasService.crearTarea(tarea);
        }
        assertEquals(5, tareasService.listarTareas().size());
    }

    public void testMarcarTareaComoCompletada() {
        // Lógica para probar marcar una tarea como completada
        Tarea tarea = new Tarea();
        tarea.titulo = "Tarea a completar";
        tarea.descripcion = "Descripción de la tarea a completar";
        tarea.fechaCreacion = new java.sql.Timestamp(System.currentTimeMillis());
        tareasService.crearTarea(tarea);
        tareasService.marcarTareaComoCompletada(tarea.id);
        Tarea tareaActualizada = tareasService.obtenerTareaPorId(tarea.id);
        assertNotNull(tareaActualizada);
        assertEquals(true, tareaActualizada.completada);
    }

    public void testEliminarTarea() {
        // Lógica para probar la eliminación de una tarea
        Tarea tarea = new Tarea();
        tarea.titulo = "Tarea a eliminar";
        tarea.descripcion = "Descripción de la tarea a eliminar";
        tarea.fechaCreacion = new java.sql.Timestamp(System.currentTimeMillis());
        tareasService.crearTarea(tarea);
        tareasService.eliminarTarea(tarea.id);
        Tarea tareaEliminada = tareasService.obtenerTareaPorId(tarea.id);
        assertEquals(null, tareaEliminada);
    }

}
