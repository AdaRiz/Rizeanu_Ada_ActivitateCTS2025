package ro.cts.clase;

public class Masina extends AMasina{
    private String model;
    private int km;
    private String culoare;

    public Masina(String model, int km, String culoare) {
        this.model = model;
        this.km = km;
        this.culoare = culoare;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String descriereMasina() {
        return  model + ", culoare: " + culoare + ", numar kilometrii: " + km + " km";
    }
}
