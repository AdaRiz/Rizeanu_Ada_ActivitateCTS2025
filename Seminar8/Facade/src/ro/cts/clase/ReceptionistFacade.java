package ro.cts.clase;

public class ReceptionistFacade {
    public String poateLuaLocLaMasa(Masa masa){
        Ospatar ospatar = new Ospatar();
        Picolo  picolo = new Picolo();

        if(masa.isEsteLibera()){
            if(picolo.esteDebarasata(masa)){
                if(ospatar.esteAranjataMasa(masa)){
                    return "Va rog luati loc la masa!";
                }else{
                    return "Asteptati sa fie aranjata masa!";
                }
            }else{
                return "Asteptati putin! Tocmai s-a ridicat cineva!";
            }
        }else{
            return "Momentan masa " + masa.getNrMasa() + " nu este disponibila!";
        }
    }
}
