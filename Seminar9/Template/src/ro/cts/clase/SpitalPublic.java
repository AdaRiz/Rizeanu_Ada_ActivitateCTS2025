package ro.cts.clase;

public class SpitalPublic extends TemplateInternare{
    private String denumire;

    public SpitalPublic(String denumire) {
        this.denumire = denumire;
    }

    @Override
    int analizareDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void verificareDisponibilitate() {
        System.out.println("Nu avem paturi suficiente in spitalul " + this.denumire);
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost transferat la alt spital.");
    }
}
