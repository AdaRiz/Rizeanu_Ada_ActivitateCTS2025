package ro.cts.clase;
import ro.cts.clase.Sticker;

public class Bara implements IComponenta {
    private Sticker sticker;

    public Bara(Sticker sticker) {
        this.sticker = new Sticker(null, 15, 45, "mata");
    }

    @Override
    public void aplicaFolie(String tipFolie){
        this.sticker.setTipFolie(tipFolie);
    }

    @Override
    public float calculeazaColantare() {

        return sticker.getLatime() * sticker.getLungime();
    }

    @Override
    public String detaliiColantare() {
        return "Bara colantata cu folie '" + sticker.getTipFolie() + "\'" +
                "pe o suprafata de: " + calculeazaColantare() +" cmp";
    }

}
