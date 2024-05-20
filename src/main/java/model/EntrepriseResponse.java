package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
public class EntrepriseResponse {

    @JsonProperty("results")
    List<EntrepriseResponse.Entreprise> results;

    @JsonProperty("total_results")
    private int totalResults;

    @JsonProperty("page")
    private int page;

    @JsonProperty("per_page")
    private int perPage;

    @JsonProperty("total_pages")
    private int totalPages;

    @Getter
    @Setter
    @ToString
    public static class Entreprise {

        @JsonProperty("nom_raison_sociale")
        private String nom;

        @JsonProperty("dirigeants")
        private List<Dirigeant> dirigeants;

        @JsonProperty("siren")
        private String siren;


        @Getter
        @Setter
        @ToString
        public static class Dirigeant {

            @JsonProperty("nom")
            private String nom;

            @JsonProperty("prenoms")
            private String prenom;

            @JsonProperty("nationalite")
            private String nationalite;
        }
    }
}
