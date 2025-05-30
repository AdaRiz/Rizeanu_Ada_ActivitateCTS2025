package ro.cts.clase;

import ro.cts.clase.Sticker;

public class Capota implements IComponenta{
    Sticker sticker;

    public Capota(Sticker sticker){
        this.sticker=sticker;
    }

    @Override
    public void aplicaFolie(String tipFolie){
        sticker.setTipFolie(tipFolie);
    }

    @Override
    public String detaliiColantare() {
        return "Capota colantata cu folie '" +
                sticker.getTipFolie() + "\' " +
                " pe o suprafata de: " +
                calculeazaColantare() +"cmp";
    }

    @Override
    public float calculeazaColantare() {
        return sticker.getLatime() * sticker.getLungime();
    }
}
