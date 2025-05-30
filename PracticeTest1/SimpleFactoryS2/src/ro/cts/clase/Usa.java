package ro.cts.clase;

import ro.cts.clase.Sticker;


public class Usa implements IComponenta {
    private Sticker sticker;

    public Usa(Sticker sticker){
        this.sticker = sticker;
    }
    @Override
    public void aplicaFolie(String tipFolie){
        this.sticker.setTipFolie(tipFolie);
    }

    @Override
    public String detaliiColantare() {
        return "Usa colantata cu folie '" + sticker.getTipFolie() + "\' " +
                " pe o suprafata de: " + calculeazaColantare() + " cmp";
    }

    @Override
    public float calculeazaColantare() {

        return sticker.getLatime() * sticker.getLungime();
    }

}

