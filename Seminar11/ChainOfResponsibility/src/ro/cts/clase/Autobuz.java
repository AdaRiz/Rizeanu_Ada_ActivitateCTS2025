package ro.cts.clase;

public class Autobuz extends InfoMijlocTransport {

    @Override
    public void recomandaMijloc(int distanta) {
        if(distanta < 5){
            System.out.println("Calatorul va lua autobuzul");
        }else{
            this.getUrmMijloc().recomandaMijloc(distanta);
        }
    }
}
