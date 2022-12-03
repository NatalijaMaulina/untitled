package lekcija5.majasDarbs;

public class Cilindrs {
    private double r;
    private double h;
    final double PI = 3.14;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    public double cilindraTilpums (){
        return r*r*PI*h;
    }
    public double cilindraVirsmasLaukums (){
        return 2*PI*r*r + 2*PI*r*h;
    }

    public Cilindrs() {
    }

    public Cilindrs(double r, double h) {
        this.r = r;
        this.h = h;
    }
}
