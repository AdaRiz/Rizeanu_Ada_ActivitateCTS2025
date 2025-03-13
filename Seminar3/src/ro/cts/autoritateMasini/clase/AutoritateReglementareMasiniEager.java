package ro.cts.autoritateMasini.clase;

public class AutoritateReglementareMasiniEager {
    private String nume;
    private String webSite;
    private int nrReglementari;
    private static AutoritateReglementareMasiniEager instance
            = new AutoritateReglementareMasiniEager
            ("AutoritateAuto", "www.autoritate.com", 9);

    private AutoritateReglementareMasiniEager(String nume, String webSite,
                                              int nrReglementari) {
        this.nume = nume;
        this.webSite = webSite;
        this.nrReglementari = nrReglementari;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public void reglementeazaModelMasina(String numeModel){
        nrReglementari++;
    }

    public static AutoritateReglementareMasiniEager getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "AutoritateReglementareMasiniEager{" +
                "nume ='" + nume + '\'' +
                " | webSite ='" + webSite + '\'' +
                " | nrReglementari =" + nrReglementari +
                '}';
    }
}