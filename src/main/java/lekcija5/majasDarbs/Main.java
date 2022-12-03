package lekcija5.majasDarbs;

public class Main {
    public static void main(String[] args) {
    Cilindrs cilindrs = new Cilindrs ();
    cilindrs.setR(3);
    cilindrs.setH(16);
        System.out.println(cilindrs.getH());
        System.out.println(cilindrs.getR());
        System.out.println(cilindrs.cilindraTilpums());
        System.out.println(cilindrs.cilindraVirsmasLaukums());
    Cilindrs cilindrs1 = new Cilindrs(8, 20);
        System.out.println(cilindrs1.getH());
        System.out.println(cilindrs1.getR());
        System.out.println(cilindrs1.cilindraTilpums());
        System.out.println(cilindrs1.cilindraVirsmasLaukums());
    }
}
