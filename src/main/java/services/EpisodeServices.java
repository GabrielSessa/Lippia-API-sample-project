package services;

import api.model.EpisodeModel;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;

public class EpisodeServices extends MethodsService {
    public static final ThreadLocal<Integer> ID = new ThreadLocal<>();

    public static Response get(String jsonName, Map<String, String> parameter) {
        return get(jsonName, EpisodeModel.class, parameter);
    }

    public static Response getwithparams(String jsonName){
        return get(jsonName, EpisodeModel.class,setParams());
    }

    private static Map<String, String> setParams(){
        Map<String, String > params = new HashMap<>();
        params.put("episode", EpisodeServices.ID.get().toString());
        return params;
    }
}
