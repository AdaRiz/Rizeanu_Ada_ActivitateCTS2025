package ro.cts.main;

import ro.cts.clase.ComponentaFactory;
import ro.cts.clase.IComponenta;
import ro.cts.clase.TipComponente;


public class Main {
    public static void main(String[] args) {
        IComponenta usa = ComponentaFactory.creareComponenta(TipComponente.USA);
        System.out.println(usa.detaliiColantare());

        IComponenta bara = ComponentaFactory.creareComponenta(TipComponente.BARA);
        System.out.println(bara.detaliiColantare());

        IComponenta capota = ComponentaFactory.creareComponenta(TipComponente.CAPOTA);
        System.out.println(capota.detaliiColantare());
    }
}
