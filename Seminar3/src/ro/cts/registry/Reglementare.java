package ro.cts.registry;

public class Reglementare {
    private String model;
    private int nrRegelemtare;
    private String dataReglementare;

    Reglementare(String model, int nrRegelemtare, String dataReglementare) {
        this.model = model;
        this.nrRegelemtare = nrRegelemtare;
        this.dataReglementare = dataReglementare;
    }

    @Override
    public String toString() {
        return "Reglementare{" +
                "model='" + model + '\'' +
                ", nrRegelemtare=" + nrRegelemtare +
                ", dataReglementare='" + dataReglementare + '\'' +
                '}';
    }
}
