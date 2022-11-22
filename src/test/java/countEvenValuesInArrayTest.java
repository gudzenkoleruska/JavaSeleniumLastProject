import org.testng.Assert;
import org.testng.annotations.Test;

public class countEvenValuesInArrayTest {
    @Test
    public void testcountEvenValuesInArray(){

        int[] array = {2, 4, 5, 0, 5, 8, 11};
        int countExpected = 4;

        int countActual= new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(countActual, countExpected);
    }

    @Test
    public void testcountAllNotEvenValuesInArray(){

        int[] array = {1, 3, 5, 7, 9, 11};
        int countExpected = 0;

        int countActual= new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(countActual, countExpected);
    }

    @Test
    public void testcountEvenValueseEmptyArray(){

        int[] array = {};
        int countExpected = -1;

        int countActual= new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(countActual, countExpected);
    }
}
