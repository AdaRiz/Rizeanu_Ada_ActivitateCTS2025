package ro.cts.clase;

import javax.swing.text.InternationalFormatter;

public class Troleibuz extends InfoMijlocTransport {

    @Override
    public void recomandaMijloc(int distanta) {
        if(distanta < 3){
            System.out.println("Calatorul va alege troleibuzul");
        }else{
            this.getUrmMijloc().recomandaMijloc(distanta);
        }
    }
}
