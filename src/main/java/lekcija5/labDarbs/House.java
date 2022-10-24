package lekcija5.labDarbs;

public class House {
    private int stavuDaudzums;
    private int loguSkaits;
    private int durvjuSkaits;
    private String adrese;
    private double griestuSkaists;
    private  long kadastraVertiba;
    private boolean vaiPrivatipasums;

    public void setKadastraVertiba(long kadastraVertiba) {
        this.kadastraVertiba = kadastraVertiba;
    }

    public String getAdrese() {
        return adrese;
    }

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
