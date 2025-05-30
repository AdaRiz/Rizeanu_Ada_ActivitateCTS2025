package ro.cts.clase;

public class SpitalPrivat extends TemplateInternare {

    @Override
    int analizareDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void verificareDisponibilitate() {
        System.out.println("Avem paturi suficiente");
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Emitere fisa pentru " + pacient.getNume() + ". Fisa internare emisa");
    }
}
