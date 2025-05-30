package ro.cts.program;

import ro.cts.clase.Pacient;
import ro.cts.clase.SpitalPrivat;
import ro.cts.clase.SpitalPublic;
import ro.cts.clase.TemplateInternare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Daniel", 4);
        TemplateInternare spital = new SpitalPublic("Floreasca");
        spital.internare(pacient);

        TemplateInternare spital1 = new SpitalPrivat();
        spital1.internare(pacient);
    }
}
