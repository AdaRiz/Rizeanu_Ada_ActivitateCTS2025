package ro.cts.builder;

import ro.cts.clase.IMasina;
import ro.cts.clase.Sticker;

public class StickerBuilder extends Builder{
    private final Sticker sticker;

    public StickerBuilder() {
        sticker = new Sticker(null, 0, 0, "Nespecificat");
    }

    @Override
    public Sticker build() {
        return sticker;
    }

    public StickerBuilder setMasina(IMasina masina){
        sticker.setMasina(masina);
        if(masina != null){
            if(masina.getModel().equals("Golf") && masina.getAnFabricatie()<=2010){
            sticker.setLatime(10);
            sticker.setLungime(18);
            } else{
                sticker.setLatime(12);
                sticker.setLungime(22);
            }
        }
        return this;
    }

    public StickerBuilder setTipFolie(String tipFolie){
        sticker.setTipFolie(tipFolie);
        return this;
    }
}
