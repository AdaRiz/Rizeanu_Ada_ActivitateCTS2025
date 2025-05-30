package ro.cts.clase;

public class plataSMS implements IMetodaPlata{
    private float credit;

    public plataSMS(float credit) {
        this.credit = credit;
    }

    @Override
    public void realizeazaPlata(float pretBilet) {
        if(credit >= pretBilet){
            System.out.println("Plata efectuata prin SMS");
            credit -= pretBilet;
        }else{
            System.out.println("Credit insuficient!");
        }

    }
}



