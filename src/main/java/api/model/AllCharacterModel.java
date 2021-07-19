package api.model;

import java.util.List;

public class AllCharacterModel {
    private Info info;
    public List<CharacterModel> results;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<CharacterModel> getResults() {
        return results;
    }

    public void setResults(List<CharacterModel> results) {
        this.results = results;
    }
}