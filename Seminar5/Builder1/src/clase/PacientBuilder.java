package clase;

public class PacientBuilder implements IBuilder{
    private Pacient pacient;

    public PacientBuilder(String nume) {
        this.pacient = new Pacient(nume, "un alt pacient", false, false, false, false);
    }
    public PacientBuilder setHasPatRabatabil(boolean hasPatRabatabil){
        this.pacient.setHasPatRabatabil(hasPatRabatabil);
        return this;
    }
    public PacientBuilder setNumeInsotitor(String numeInsotitor){
        this.pacient.setNumeInsotitor(numeInsotitor);
        return this;
    }

    public PacientBuilder setHasMicDejun(boolean hasMicDejun){
        this.pacient.setHasMicDejun(hasMicDejun);
        return this;
    }

    public PacientBuilder setHasPapuciDeCamera(boolean hasPapuciDeCamera){
        this.pacient.setHasPapuciDeCamera(hasPapuciDeCamera);
        return this;
    }

    public PacientBuilder setHasHalatInterior(boolean hasHalatInterior){
        this.pacient.setHasHalatInterior(hasHalatInterior);
        return this;
    }

    @Override
    public Pacient build() {
        return this.pacient;
    }
}
