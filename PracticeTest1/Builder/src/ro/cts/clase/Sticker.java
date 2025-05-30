package ro.cts.clase;

public class Sticker {
    private IMasina masina;
    private float latime;
    private float lungime;
    private String tipFolie;

    public Sticker(IMasina masina, float latime, float lungime, String tipFolie) {
        this.masina = masina;
        this.latime = latime;
        this.lungime = lungime;
        this.tipFolie = tipFolie;
    }

    public IMasina getMasina() {
        return masina;
    }

    public void setMasina(IMasina masina) {
        this.masina = masina;
    }

    public float getLatime() {
        return latime;
    }

    public void setLatime(float latime) {
        this.latime = latime;
    }

    public float getLungime() {
        return lungime;
    }

    public void setLungime(float lungime) {
        this.lungime = lungime;
    }

    public String getTipFolie() {
        return tipFolie;
    }

    public void setTipFolie(String tipFolie) {
        this.tipFolie = tipFolie;
    }

    @Override
    public String toString() {
        return "Sticker{" +
                "masina=" + masina +
                ", latime=" + latime +
                ", lungime=" + lungime +
                ", tipFolie=" + tipFolie +
                '}';
    }
}
