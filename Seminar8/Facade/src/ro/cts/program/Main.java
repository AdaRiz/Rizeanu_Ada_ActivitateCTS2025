package ro.cts.program;

import ro.cts.clase.ReceptionistFacade;
import ro.cts.clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(30, true,4);
        ReceptionistFacade receptionist = new ReceptionistFacade();
        System.out.println(receptionist.poateLuaLocLaMasa(masa1));

        Masa masa2 = new Masa(41, true, 2);
        System.out.println(receptionist.poateLuaLocLaMasa(masa2));

        Masa masa3 = new Masa(20, false, 4);
        System.out.println(receptionist.poateLuaLocLaMasa(masa3));

        Masa masa4 = new Masa(32, true, 6);
        System.out.println(receptionist.poateLuaLocLaMasa(masa4));
    }
}
