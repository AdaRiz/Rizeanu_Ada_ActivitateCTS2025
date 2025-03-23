package ro.cts.readere;

import ro.cts.clase.Aplicant;
import ro.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends AplicantReader {

    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (input.hasNext()) {
            Student student = new Student();
            super.readAplicant(input, student);
            int an_studii = input.nextInt();
            student.setAn_studii(an_studii);
            String facultate = (input.next()).toString();
            student.setFacultate(facultate);
            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}
