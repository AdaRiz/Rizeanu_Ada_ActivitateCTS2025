package ro.cts.clase;

import ro.cts.clase.Sticker;

public class ComponentaFactory {
    public static IComponenta creareComponenta(TipComponente tipComponenta) {
       return switch (tipComponenta){
            case BARA -> new Bara(new Sticker(null, 10, 20, "mata"));
            case USA ->new Usa(new Sticker(null, 10, 15, "lucioasa"));
            case CAPOTA -> new Capota(new Sticker(null, 11, 23, "mata"));
       };
    }
}
