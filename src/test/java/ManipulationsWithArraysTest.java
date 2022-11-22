import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {


    @Test
    public void testManipulationsWithArrays_HappyPath(){

        int[] array = {1, 2, 3, 4, 5};
        int number = 3;

        int[] expectedResult = {3, 6, 9, 12, 15};
        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Ignore
    @Test
    public void testManipulationsWithArrays_ZeroNumber(){

        int[] array = {1, 2, 3, 4, 5};
        int number = 0;

        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testManipulationsWithArrays_NoLength(){

        int[] array = {};
        int number = 3;

        int[] expectedResult = {};
        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testManipulationsWithArrays_NullArray(){

        int[] array = null;
        int number = 3;

        int[] expectedResult = {};
        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
