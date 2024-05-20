package fr.bazin.controller;

import fr.bazin.service.EntreprisesService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import model.EntrepriseResponse;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@Path("/entreprises")
public class EntrepriseResource {

    @Inject
    @RestClient
    EntreprisesService entreprisesService;


    @GET
    @Path("/search/{nomDirigeant}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<EntrepriseResponse.Entreprise> getEntreprisesByName(@PathParam("nomDirigeant") String nomDirigeant) {
        EntrepriseResponse response = entreprisesService.getEntreprisesByName(nomDirigeant);
        return response.getResults();
    }

}
