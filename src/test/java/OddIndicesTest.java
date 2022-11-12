import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    //        Test Data:
//        Input = {-45, 590, 234, 985, 12, 68}
//        Expected Result =  {590, 985, 68}

    //Positive

    @Test
    public void testOddIndices_HappyPath(){

        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = new OddIndices().OddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testOddIndices_ArrayOfTwo(){

        int[] array = {-45, 590};
        int[] expectedResult = {590};

        int[] actualResult = new OddIndices().OddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testOddIndices_ArrayOfOne(){

        int[] array = {-45};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().OddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //Negative

    @Test
    public void testOddIndices_ArrayNull(){

        int[] array = null;
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().OddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testOddIndices_ArrayEmpty(){

        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().OddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
