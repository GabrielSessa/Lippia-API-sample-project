package services;

import api.model.AllCharacterModel;
import api.model.AllEpisodesModel;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class AllEpisodesServices extends MethodsService {
    public static final ThreadLocal<Integer> COUNT = new ThreadLocal<Integer>();

    public static Response get(String jsonName) {
        return get(jsonName, AllEpisodesModel.class);
    }
}
