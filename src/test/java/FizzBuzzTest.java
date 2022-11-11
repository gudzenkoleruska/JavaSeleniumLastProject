import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    @Test
    public void testStartLessOfEnd_HappyPath() {
        int start = 1;
        int end = 20;

        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testStartEqualsEnd_HappyPath() {
        int start = 1;
        int end = 1;

        String[] expectedResult = {"1"};

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        Assert.assertEquals(actualResult,expectedResult);
    }


    @Test
    public void testNegativeValues_HappyPath() {
        int start = -20;
        int end = -1;

        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz", "-14", "-13", "Fizz", "-11",
                "Buzz", "Fizz", "-8", "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1" };          //from the end to start

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testStartBiggerEnd_Negative() {
        int start = 20;
        int end = 1;

        String[] expectedResult = {};

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        Assert.assertEquals(actualResult,expectedResult);
    }


}
