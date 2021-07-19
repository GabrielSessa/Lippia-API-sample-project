package ar.Validator;

import api.model.EpisodeModel;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;
import services.EpisodeServices;

public class EpisodeValidator {
    public static void validateEpisodio(){
        int epirandom = EpisodeServices.ID.get();
        EpisodeModel response = (EpisodeModel) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(epirandom, (int) response.getId());
    }
}
