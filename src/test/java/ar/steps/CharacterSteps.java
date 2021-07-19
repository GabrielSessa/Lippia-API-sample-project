package ar.steps;

import api.config.EntityConfiguration;
import api.model.AllCharacterModel;
import api.model.CharacterModel;
import ar.Validator.CharacterValidator;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.CharacterServices;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class CharacterSteps extends PageSteps {

    @Then("la respuesta es  correcta")
    public void laRespuestaEsCorrecta() {
        CharacterValidator.validate();
    }

    @And("obtengo el primer personaje de la lista")
    public void obtengoElPrimerPersonajeDeLaLista(){
        AllCharacterModel response = (AllCharacterModel) APIManager.getLastResponse().getResponse();
        String id = response.results.get(0).getId().toString();
        CharacterServices.ID.set(id);
    }

    @Given("Un ID Character")
    public void unIDCharacter(){
    }

    @Then("la respuesta es correcta para el primer personaje")
    public void laRespuestaEsCorrectaParaElPrimerPersonaje() {
        CharacterValidator.validatePersonaje();
    }
}