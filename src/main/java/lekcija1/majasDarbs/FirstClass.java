package lekcija1.majasDarbs;

import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {

        String valsts = "Jaunzēlande";
        int iedzivotaji = 5132690;
        double platiba =268.7;
        String pilseta = "Vellingtona";
        String valoda = "angļu un maori";
        char valuta = '$';
        System.out.println(valsts);
        System.out.println( valsts + " - ir valsts Okeānijā, kurā dzīvo " + iedzivotaji + " iedzīvotāji \n Jaunzēlandes platība ir "+ platiba + " kvadrātkilometri un tās galvaspilsēta ir " + pilseta +". \n Iedzīvotāji pārsvarā runā " + valoda + " valodās. \n Valsts valūta ir - NZ" + valuta+ " jeb Jaunžēlandes dolārs");

        int x = 20;
        int y = 5 ;
        int summa =x+y;
        int starpiba = x-y;
        int reizinajums = x*y;
        int dalijums = x/y;
        System.out.println(" Skaitļu summa ir :" + summa);
        System.out.println(" Skaitļu starpība ir " + starpiba);
        System.out.println(" Skaitļu reizinājums ir " + reizinajums);
        System.out.println(" Skaitļu dalījums ir " + dalijums);


    }
}

