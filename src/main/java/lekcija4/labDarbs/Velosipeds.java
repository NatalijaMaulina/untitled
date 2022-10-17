package lekcija4.labDarbs;

import java.util.Date;

public class Velosipeds {
    String zimols;
    int ramjaIzmers;
    int atrums =0;
    Date izgDatums;
    Velosipeds(){
        System.out.println("Taisam jaunu velo");
        izgDatums = new Date();
        System.out.println("Izgatavošanas datums " + izgDatums);

    }
    Velosipeds(String zimols, int ramjaIzmers, int atrums){
        izgDatums = new Date();
        this.zimols = zimols;
        this.ramjaIzmers = ramjaIzmers;
        this.atrums = atrums;
    }
    public void paatrinajums(){
        System.out.println("Velo paātrinās");
        atrums = atrums + 5;
    }
    public void bremze() {
        if (atrums >=5) {
            System.out.println("Velo bremzē");
            atrums = atrums - 5;
        }

    }
}
