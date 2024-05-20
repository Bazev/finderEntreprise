package fr.bazin.service;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import model.EntrepriseResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/search")
@RegisterRestClient
public interface EntreprisesService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    EntrepriseResponse getEntreprisesByName(@QueryParam("nom_personne") String nomDirigeant);



}
