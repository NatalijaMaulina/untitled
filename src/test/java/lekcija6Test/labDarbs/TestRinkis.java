package lekcija6Test.labDarbs;


import lekcija6.labDarbs.Rinkis;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRinkis {
    @BeforeTest
    public void pirmsTesta(){
        System.out.println("Šī ir beforeTest anotācija");
    }

    @Test
    public void testRekinaLaukumu(){
        System.out.println("Mans 1. tests, tests kas rekina riņķa laukumu");
        Rinkis mansRinkis = new Rinkis(4.5);
                Double expectedArea = 63.62;
                        Double actualArea= mansRinkis.rekinatLaukumu();
        Assert.assertEquals(expectedArea,actualArea);
    }
    @AfterTest
    public void pecTesta (){
        System.out.println("Šī ir pēc testa anotācija");
    }
    @BeforeMethod

    public void sagatavosanas(){
        System.out.println("Šī metode teik izpildīta pirms katra testa");
    }

}
