package ro.cts.clase;

public class Tramvai extends  InfoMijlocTransport{
    @Override
    public void recomandaMijloc(int distanta) {
        if(distanta < 10){
            System.out.println("Calatorul va lua troleibuzul.");
        }else{
            this.getUrmMijloc().recomandaMijloc(distanta);
        }
    }
}
