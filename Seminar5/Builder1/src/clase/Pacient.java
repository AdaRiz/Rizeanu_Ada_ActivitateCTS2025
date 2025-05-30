package clase;

public class Pacient {
    private String numePacient;
    private String numeInsotitor;
    private boolean hasPatRabatabil;
    private boolean hasMicDejun;
    private boolean hasPapuciDeCamera;
    private boolean hasHalatInterior;

    protected Pacient(String nume, String numeInsotitor, boolean hasPatRabatabil, boolean hasMicDejun, boolean hasPapuciDeCamera, boolean hasHalatInterior) {
        this.numePacient = nume;
        this.numeInsotitor = numeInsotitor;
        this.hasPatRabatabil = hasPatRabatabil;
        this.hasMicDejun = hasMicDejun;
        this.hasPapuciDeCamera = hasPapuciDeCamera;
        this.hasHalatInterior = hasHalatInterior;

    }

    protected void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    protected void setNumeInsotitor(String numeInsotitor) {
        this.numeInsotitor = numeInsotitor;
    }

    protected void setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
    }

    protected void setHasMicDejun(boolean hasMicDejun) {
        this.hasMicDejun = hasMicDejun;
    }

    protected void setHasPapuciDeCamera(boolean hasPapucideCamera) {
        this.hasPapuciDeCamera = hasPapucideCamera;
    }

    protected void setHasHalatInterior(boolean hasHalatInterior) {
        this.hasHalatInterior = hasHalatInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume pacient='" + numePacient + '\'' +
                ", nume insotitor='" + numeInsotitor + '\'' +
                ", pat rabatabil=" + hasPatRabatabil +
                ", mic dejun=" + hasMicDejun +
                ", papuci de camera=" + hasPapuciDeCamera +
                ", halat interior=" + hasHalatInterior +
                '}';
    }
}
