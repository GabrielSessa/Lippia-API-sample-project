package ar.steps;

import api.model.AllCharacterModel;
import api.model.AllEpisodesModel;
import ar.Validator.EpisodeValidator;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.AllEpisodesServices;
import services.CharacterServices;
import services.EpisodeServices;

import java.util.Random;

public class EpisodeSteps extends PageSteps {

    @And("obtengo la cuenta total de episodios")
    public void obtengoElNumeroTotalDeEpisodios(){
        AllEpisodesModel info = (AllEpisodesModel) APIManager.getLastResponse().getResponse();
        int count = info.info.getCount();
        AllEpisodesServices.COUNT.set(count);
    }

    @And("obtengo un episodio aleatorio de la lista")
    public void obtengoUnEpisodioAleatorioDeLaLista(){

        Random ale = new Random();
        int epiAle=ale.nextInt((AllEpisodesServices.COUNT.get())-1+1)+1;

        EpisodeServices.ID.set(epiAle);
    }

    @Given("Un ID Episode")
    public void unIDEpisode(){
    }

    @Then("la respuesta es correcta para el episodio aleatorio")
    public void laRespuestaEsCorrectaParaElEpisodioAleatorio() {
        EpisodeValidator.validateEpisodio();
    }
}