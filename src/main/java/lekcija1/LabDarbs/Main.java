package lekcija1.LabDarbs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet luksofora krāsu");
        String luksofors = scanner.nextLine();
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
}
