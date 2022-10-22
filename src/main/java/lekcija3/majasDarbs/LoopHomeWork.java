package lekcija3.majasDarbs;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

    }

    public static void summa() {
        int summa = 0;
        Scanner ievade = new Scanner(System.in);
        System.out.println("Ievadiet veselu skaitli");
        int x = ievade.nextInt();
        while (summa < 100) {
            summa = summa + x;
            summa++;
        }
        if (summa == 100 || summa > 100) {
            System.out.println("GATAVS");

        }
    }

    public static void masivi() {
        String[] names = {"Olga", "Janis", "Katrīna", "Baiba"};
        int i = 0;
        while (i < names.length) {
            System.out.println(names);
            i++;
        }
        int[] shoes = {35, 43, 32, 40, 41};
        int j = 0;
        for (j = 0; j < shoes.length; j++) {
            System.out.println(shoes);
        }
        char[] letter = {'A', 'L', 'E', 'X'};
        for (int burti : letter) {
            System.out.println(burti);
        }
        int q = 1;
        do {
            System.out.println(letter);
            q++;
        } while (q < letter.length);
    }
    public static void para (){
        int[] paraSkaitli=new int [100];
        int i;
        for(i=2;i<=100; i++){
            if(i%2==0){
            }
            System.out.println(paraSkaitli+ " ");
        }

    }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
