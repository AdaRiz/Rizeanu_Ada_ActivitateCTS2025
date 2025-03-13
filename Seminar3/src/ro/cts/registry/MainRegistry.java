package ro.cts.registry;

import ro.cts.registry.Autoritate;
import ro.cts.registry.Reglementare;

public class MainRegistry {
    public static void main(String[] args){
        Autoritate autoritate = Autoritate.getInstance("Autoritate", "www.auto.com");
        Reglementare reg1 = autoritate.reglementeazaModel("Dacia Logan");
        Reglementare reg2 = autoritate.reglementeazaModel("Tesla");
        System.out.println(reg1);
        System.out.println(reg2);

        Reglementare reg3 = autoritate.reglementeazaModel("Dacia Logan");
        System.out.println(reg3);
    }
}
