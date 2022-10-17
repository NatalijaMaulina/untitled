package lekcija3.labDarbs;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    printCard();
    printCard();
    int laukums = aprekinaLaukumu(3,10);
        int i = 10;
        while(i<50){
            System.out.println( "i ir " + i);
            i++;
        }
        Scanner ievade= new Scanner(System.in);
        System.out.println("Ievadi skaitli  ");
        int number = ievade.nextInt();
        int summa = 0;
        while(number>0){
            summa=summa+number;
            System.out.println( "Ievadi skaitli ");
            number=ievade.nextInt();
        }
        System.out.println("Summa ir: " + summa);
        String[] kartis= { "Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};
        int j=0;
        while( j< kartis.length){
            System.out.println(kartis[j] + " ");
            j++;

        }

    }
    public static int aprekinaLaukumu (int platums, int garums){
        return garums*platums;
    }
    public static void masivi() {
        int[] menesaTerini = {100, 40, 23, 44, 55, 254};
        System.out.println("Masīva lielums ir" + menesaTerini.length);
        String[] produktuSaraksts = {"Piens", "Maize", "Siers"};
        produktuSaraksts[2] = "Biezpiens";
    }
    public static void name() {
        char[] vards = {'N', 'A', 'T', 'Ā', 'L', 'I', 'J', 'A'};
        for (char mansVards : vards) {
            System.out.println(mansVards);
        }
    }
    public static void printCard(){
        System.out.println("**********");
        System.out.println("NATALIJA MAUĻINA");
        System.out.println( "OLAINE");
        System.out.println("$$$$$$$$$$$");
    }
    public static void whileCikls() {
        int x = 5;
        while (x > 0) {
            System.out.println("x nav nulle, x = " + x);
            x--;
        }
    }
    public static void cars () {
        String[] cars = {"BMW", "Audi", "Mercedes", "Alfa Romeo"};
        int z = 0;
        while (z < 4) {
            System.out.println(cars[z]);
            z++;
        }
    }

//        public static void dowhileCikls() {
//                int q = 1;
//                do {
//                    System.out.println("TEST TEST TEST");
//                    q++;
//                } while (q < 10) {
//
//            }
//                }
                public static void forCikls () {
                    String[] kartis2 = {"Pīķa desmitnieks", "Kārava karalis", "Džokers"};
                    for (int j = 0; j < kartis2.length; j++) {
                        System.out.println(kartis2[j]);
                    }
                    long[] telNumuri = {2535635, 5222222, 1111666, 33377777};
                    for (long numurs : telNumuri) {
                        System.out.println(numurs);
                    }

                }


}
