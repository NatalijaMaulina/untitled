package lekcija2.majasdarbs2;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        printCard();
        printCard();
        printCard();
        printBusinessCard2("Jānis","Bērziņš", "5463252","2005");
        printBusinessCard2("Līga", "Liepiņa", "5478239","1985");

    }

    public static void izteiksmes() {
        int x = 6;
        System.out.println(x > 0);
        System.out.println(x < 0);
        System.out.println(x > 5 && x == 10 || x == 10);
        System.out.println(x > 5 && x != 5 && x < 10);
        System.out.println(x == 0 || x == 10);
        System.out.println(x * x > 10);
    }

}
    public static void month (){
        Scanner ievade= new Scanner(System.in);
        System.out.println("Ievadiet mēneša numuru ");
        int month = ievade.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Feruary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Ievadīts nekorekts numurs,šāds mēnesis neeksistē");
        }
    }
}
   public static int maxNumber (){
    Scanner ievade2= new Scanner(System.in);
      System.out.println("Ievadiet trīs veselus skaitļus ");
       int x = ievade2.nextInt();
       int y = ievade2.nextInt();
       int z = ievade2.nextInt();
       if (x>y && x>z) {
           System.out.println("Lielākais skaitlis ir " + x);
       }else if(y>x && y>z){
               System.out.println("Lielākais skaitlis ir "+ y );
           }else {
           System.out.println("Lielākais skaitlis ir "+ z );
       }

    }

    public static void luksofors() {
        Scanner ievade3 = new Scanner(System.in);
        System.out.println("Ievadiet luksofora krāsu");
        String luksofors = ievade3.nextLine();
        if (luksofors.equals("red")) {
            System.out.println("STAVI");
        } else if (luksofors.equals("green")) {
            System.out.println("Ej");
        } else if (luksofors.equals("orange")) {
            System.out.println("Gaidi");
        } else {
            System.out.println("Nedeg neviena gaisma");
        }
    }
    public static void printCard(){
        System.out.println("NATĀLIJA MAUĻINA");
        System.out.println( "12345678");
        System.out.println("1991");
    }
    public static void printBusinessCard2 (String vards, String uzvards, long numurs,int gads){
        System.out.println(vards + " " + uzvards);
        System.out.println(numurs);
        System.out.println(gads);
    }

}