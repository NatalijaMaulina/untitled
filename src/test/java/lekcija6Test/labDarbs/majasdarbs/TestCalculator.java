package lekcija6Test.labDarbs.majasdarbs;

import lekcija6.majasDarbs.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCalculator {
    Calculator myCalculator;

    @BeforeTest
            public void setup (){
      myCalculator  = new Calculator(25,5);

    }

    @Test
    public void testAdd(){

        int expectedResult = 30;
        int actualResult = myCalculator.add();
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testSubstract(){
        int expectedResult = 20;
        int actualResult = myCalculator.substract();
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testMultiply(){
        int expectedResult = 125;
        int actualResult = myCalculator.multiply();
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testDivide(){
        float expectedResult = 5;
        float actualResult = myCalculator.divide();
        Assert.assertEquals(expectedResult,actualResult);
    }
}
