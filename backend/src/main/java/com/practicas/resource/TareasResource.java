package com.practicas.resource;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

import com.practicas.model.Tarea;
import com.practicas.service.TareasService;

@Path("/tareas")
@Produces(MediaType.APPLICATION_JSON) // Lo que la API devuelve (JSON)
@Consumes(MediaType.APPLICATION_JSON) // Lo que la API acepta (JSON)
public class TareasResource {

    private TareasService tareasService;

    @Inject
    public TareasResource(TareasService tareasService) {
        this.tareasService = tareasService;
    }

    // Rutas API REST
    @GET
    public List<Tarea> listarTareas() {
        // Lógica para listar todas las tareas
        return tareasService.listarTareas();
    }

    @POST
    public Response crearTarea(Tarea tarea) {
        tareasService.crearTarea(tarea);
        return Response.status(Response.Status.CREATED).entity(tarea).build();
    }

    @GET
    @Path("/{id}")
    public Tarea obtenerTareaPorId(@PathParam("id") long id) {
        // Lógica para obtener una tarea por su ID
        return tareasService.obtenerTareaPorId(id);
    }

    @PUT
    @Path("/{id}/completar")
    public Response marcarTareaComoCompletada(@PathParam("id") long id) {
        // Lógica para marcar una tarea como completada
        tareasService.marcarTareaComoCompletada(id);
        // Añadimos respuesta para indicar que la operación fue exitosa
        return Response.status(Response.Status.OK).build();
    }

    @DELETE
    @Path("/{id}")
    public Response eliminarTarea(@PathParam("id") long id) {
        // Lógica para eliminar una tarea
        tareasService.eliminarTarea(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

}