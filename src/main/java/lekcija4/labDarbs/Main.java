package lekcija4.labDarbs;

public class Main {
    public static void main(String[] args) {
        House majaViens= new House(2,14,9, "Rozessala 1-6", 2.9, 150648, true);
        majaViens.printHouse();


        Velosipeds mansVelo = new Velosipeds();
        System.out.println(mansVelo.atrums);
        mansVelo.paatrinajums();
        mansVelo.paatrinajums();
        mansVelo.paatrinajums();
        mansVelo.paatrinajums();
        System.out.println(mansVelo.atrums);
        System.out.println( "Priekšā izskrien ezis ");
        mansVelo.bremze();
        mansVelo.bremze();
        mansVelo.bremze();
        System.out.println(mansVelo.atrums);


        Kakis kakisTaisons = new Kakis();
        kakisTaisons.suga = "Bezšķirnes";
        kakisTaisons.gadi = 2;
        kakisTaisons.vards = "Taisons";
        kakisTaisons.vaiIzsalcis = true;
        kakisTaisons.printKakis();

        Rinkis rinkis1 = new Rinkis();
        rinkis1.r = 5;
        System.out.println(rinkis1.rekinatLaukumu());
    }

}
