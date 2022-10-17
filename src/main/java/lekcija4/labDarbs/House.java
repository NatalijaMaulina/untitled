package lekcija4.labDarbs;

public class House {
    int stavuDaudzums;
    int loguSkaits;
    int durvjuSkaits;
    String adrese;
    double griestuSkaists;
    long kadastraVertiba;
    boolean vaiPrivatipasums;
    public House(int stavuDaudzums, int loguSkaits, int durvjuSkaits, String adrese, double griestuSkaists, long kadastraVertiba, boolean vaiPrivatipasums) {
        this.stavuDaudzums = stavuDaudzums;
        this.loguSkaits = loguSkaits;
        this.durvjuSkaits = durvjuSkaits;
        this.adrese = adrese;
        this.griestuSkaists = griestuSkaists;
        this.kadastraVertiba = kadastraVertiba;
        this.vaiPrivatipasums = vaiPrivatipasums;
    }


    public void printHouse() {
        System.out.println("House{" +
                "stavuDaudzums=" + stavuDaudzums +
                ", loguSkaits=" + loguSkaits +
                ", durvjuSkaits=" + durvjuSkaits +
                ", adrese='" + adrese + '\'' +
                ", griestuSkaists=" + griestuSkaists +
                ", kadastraVertiba=" + kadastraVertiba +
                ", vaiPrivatipasums=" + vaiPrivatipasums +
                '}');
    }
}
