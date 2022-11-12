import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {


//    Test Data:
//    {0, 1, 2, 3, 4, 5} → 15
//    {-7, -3} → -10

    @Test
    public void testSumArrayPositiveNumbers_HappyPath(){
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = new SumArray().SumArray(array);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumArrayNegativeNumbers_HappyPath(){
        int[] array = {-7, -3};
        int expectedResult = -10;

        int actualResult = new SumArray().SumArray(array);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumArray_ZeroLength(){
        int[] array = {};
        int expectedResult = 0;

        int actualResult = new SumArray().SumArray(array);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumArray_NegativePath(){
        int[] array = null;
        int expectedResult = 0;

        int actualResult = new SumArray().SumArray(array);
        Assert.assertEquals(actualResult, expectedResult);
    }


}
