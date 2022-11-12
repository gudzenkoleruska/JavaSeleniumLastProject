import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

//    Test Data: 3333, 9999

    @Test
    public void testBbiggerA_HappyPath(){
        int a = 3333;
        int b = 9999;

        int expectedResult = 9999;
        int actualResult = new BiggerValue().BiggerValue(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAbiggerB_HappyPath(){
        int a = 9999;
        int b = 3333;

        int expectedResult = 9999;
        int actualResult = new BiggerValue().BiggerValue(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAEqualB_HappyPath(){
        int a = 9999;
        int b = 9999;

        int expectedResult = 9999;
        int actualResult = new BiggerValue().BiggerValue(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
