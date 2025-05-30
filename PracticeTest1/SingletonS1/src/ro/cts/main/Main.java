package ro.cts.main;

import ro.cts.clase.AMasina;
import ro.cts.clase.IService;
import ro.cts.clase.Masina;
import ro.cts.clase.Service;
import java.util.Date;


public class Main {
    public static void programeazaMasina(IService service, AMasina masina) {
        Date dataProgramare = service.programare(masina);
        if (dataProgramare != null) {
            System.out.println("Programarea a fost realizata la data: " + dataProgramare);
        }
    }
    public static void main(String[] args) {

        AMasina masina1 = new Masina("Dacia Logan", 12000, "gri");
        AMasina masina2 = new Masina("Toyota C-HR", 80000, "negru");

        IService service = Service.getServiceThreadSafe("ABCD Service", "Bucuresti Vest", 30, null);

        Date dataProgramare1 = service.programare(masina1);
        if (dataProgramare1 != null) {
            System.out.println("Programarea a fost realizata la: " + dataProgramare1);
        }

        programeazaMasina(service, masina1);
        ((Service) service).elibereazaMasina();
        programeazaMasina(service, masina2);
    }
}
