package ro.cts.autoritateMasini;

// Lazy initialization

public class AutoritateReglemntareMasiniLazy {
    private String nume;
    private String webSite;
    private int nrReglementari;
    private static AutoritateReglemntareMasiniLazy instance = null;


    private AutoritateReglemntareMasiniLazy(String nume, String webSite,
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

    public static AutoritateReglemntareMasiniLazy getInstance(String nume, String webSite) {
        if(instance == null){
            instance = new AutoritateReglemntareMasiniLazy("Auto_Lazy", "www.autoritate_Lazy.ro", 0);
        }
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