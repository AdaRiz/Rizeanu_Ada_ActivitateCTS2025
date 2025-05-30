package ro.cts.clase;

import jdk.jshell.spi.ExecutionControl;

public class
Sectie implements IStructura{

    private String numeSectie;

    public Sectie(String numeSectie) {
        this.numeSectie = numeSectie;
    }

    @Override
    public void adaugaStructura(IStructura structura) throws Exception {
            throw new Exception("Nu este implemnetata!");
    }

    @Override
    public void stergeStructura(IStructura structura) throws Exception {
        throw new Exception("Nu este implementata!");
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Sectia " + numeSectie);
    }

    @Override
    public IStructura getStructura(int cheie) throws Exception {
        throw new  Exception("Nu este implementata! ");
    }
}
