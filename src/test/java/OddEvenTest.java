import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    @Test
    public void testOddNumber(){
        int number = 2222;

        String expectedResult = "Even";
        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testEvenNumber(){
        int number = -345;

        String expectedResult = "Odd";
        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testZeroNumber(){
        int number = 0;

        String expectedResult = "Even";
        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult,expectedResult);
    }



}
