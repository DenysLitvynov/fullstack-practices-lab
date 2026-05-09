package com.practicas.resource;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.DELETE;

import com.practicas.service.TareasService;

@Path("/tareas")
public class TareasResource {

    private TareasService tareasService;
    public TareasResource(TareasService tareasService) {
        this.tareasService = tareasService;
    }

    // Rutas API REST

    @GET
    public String listarTareas() {
        // Lógica para listar todas las tareas
        return "Listar tareas"; 
    }

    @POST
    public String crearTarea() {
        // Lógica para crear una nueva tarea
        return "Crear tarea";  
    }

    @GET
    @Path("/{id}")
    public String obtenerTareaPorId() {
        // Lógica para obtener una tarea por su ID
        return "Obtener tarea por ID";
    }

    @PUT
    @Path("/{id}/completar")
    public String marcarTareaComoCompletada() {
        // Lógica para marcar una tarea como completada
        return "Marcar tarea como completada";
    }

    @DELETE
    @Path("/{id}")
    public String eliminarTarea() {
        // Lógica para eliminar una tarea
        return "Eliminar tarea";
    }

}
