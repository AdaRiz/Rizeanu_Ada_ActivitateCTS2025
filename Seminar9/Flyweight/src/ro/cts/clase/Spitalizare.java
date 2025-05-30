package ro.cts.clase;

public class Spitalizare {
    private int nrsalon;
    private int nrPat;
    private int nrZileSpitalizare;

    public Spitalizare(int nrsalon, int nrPat, int nrZileSpitalizare) {
        this.nrsalon = nrsalon;
        this.nrPat = nrPat;
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    @Override
    public String toString() {
       String delimitator = " | ";
       StringBuilder sb = new StringBuilder("Spitalizare: {");
       sb.append("numar salon = ").append(nrsalon).append(delimitator);
       sb.append("numar pat = ").append(nrPat).append(delimitator);
       sb.append("numar zile spitalizare = ").append(nrZileSpitalizare).append("}");
       return sb.toString();
    }

}
