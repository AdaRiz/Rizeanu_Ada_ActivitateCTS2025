package ro.cts.registry;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Autoritate {
    private String nume;
    private String webSite;

    private static Autoritate instance = null;

    private Map<String, Reglementare> reglementareMap = new HashMap<>();

    private Autoritate(String nume, String webSite) {
        this.nume = nume;
        this.webSite = webSite;
    }

    @Override
    public String toString() {
        return "Autoritate{" +
                " nume = '" + nume + '\'' +
                " | webSite ='" + webSite + '\'' +
                '}';
    }

    public Reglementare reglementeazaModel(String modelNou){
        if(reglementareMap.containsKey(modelNou)) {
            return reglementareMap.get(modelNou);
        }else {
            reglementareMap.put(modelNou, new Reglementare
                    (modelNou, reglementareMap.size() + 1, new Date().toString()));
            return reglementareMap.get(modelNou);
        }
    }

    public static Autoritate getInstance(String nume, String webSite){
        if(instance == null){
            instance = new Autoritate(nume, webSite);
        }
        return instance;
    }

}
