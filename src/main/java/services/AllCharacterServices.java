package services;

import api.model.AllCharacterModel;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
import java.util.Map;

public class AllCharacterServices extends MethodsService {
    public static Response get(String jsonName) {
        return get(jsonName, AllCharacterModel.class);
    }
}
