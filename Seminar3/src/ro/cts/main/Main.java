package ro.cts.main;

import ro.cts.autoritateMasini.AutoritateReglementareMasiniEager;

public class Main {
        public static void main(String[] args) {
            AutoritateReglementareMasiniEager autoritate
                    = AutoritateReglementareMasiniEager.getInstance();
            System.out.println(autoritate);

            AutoritateReglementareMasiniEager autoritate2
                    = AutoritateReglementareMasiniEager.getInstance();
            autoritate2.setWebSite("www.siteNou_autoritate2.clase");
            System.out.println(autoritate2);

            System.out.println(autoritate);

            autoritate2.reglementeazaModelMasina("Dacia Logan");
            System.out.println(autoritate2);
        }

}