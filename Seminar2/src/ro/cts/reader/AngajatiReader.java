package ro.cts.reader;

import ro.cts.clase.Angajat;
import ro.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantReader {
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input2.hasNext()) {
            Angajat angajat = new Angajat();
            super.readAplicant(input2, angajat);
            int salariu = input2.nextInt();
            angajat.setSalariu(salariu);
            String ocupatie = input2.next();
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        input2.close();
        return angajati;
    }
}
