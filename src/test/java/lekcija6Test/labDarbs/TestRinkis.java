package lekcija6Test.labDarbs;


import lekcija6.labDarbs.Rinkis;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRinkis {
    @Test
    public void testRekinaLaukumu(){
        System.out.println("Mans 1. tests, tests kas rekina riņķa laukumu");
        Rinkis mansRinkis = new Rinkis(4.5);
                Double expectedArea = 63.62;
                        Double actualArea= mansRinkis.rekinatLaukumu();
        Assert.assertEquals(expectedArea,actualArea);
    }

}
