package ro.cts.main;

import ro.cts.builder.StickerBuilder;
import ro.cts.clase.IMasina;
import ro.cts.clase.Masina;
import ro.cts.clase.Sticker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IMasina masina = new Masina("Logan", 2020);
        IMasina masina1 = new Masina("Golf", 2006);
        IMasina masina2 = new Masina("Yaris", 2020);
        IMasina masina3 = new Masina("TT", 2014);
        List<IMasina> listaMasini = new ArrayList<>();
        listaMasini.add(masina);
        listaMasini.add(masina1);
        listaMasini.add(masina2);
        listaMasini.add(masina3);
        for(IMasina m : listaMasini){
            Sticker sticker = new StickerBuilder()
                    .setMasina(m)
                    .setTipFolie("carbon")
                    .build();
            System.out.println(sticker);
        }
    }
}
