package ro.cts.clase;

public abstract class InfoMijlocTransport {
    private InfoMijlocTransport urmMijloc;

    public InfoMijlocTransport(){
        urmMijloc = null;
    }

    public InfoMijlocTransport getUrmMijloc() {
        return urmMijloc;
    }

    public void setUrmMijloc(InfoMijlocTransport urmMijloc) {
        this.urmMijloc = urmMijloc;
    }

    public abstract void recomandaMijloc(int distanta);
}
