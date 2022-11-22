import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    @Test
    public void testMinMaxAve_HappyPath(){

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 6;

        int[] newArrayExpected = {3, 7, 5};

        int[] newArrayActual = new MinMaxAve().MinMaxAve(array, a, b);
        Assert.assertEquals(newArrayActual,newArrayExpected);

    }

    @Test
    public void testMinMaxAve_Negative(){

        int[] array = {};
        int a = 2;
        int b = 6;

        int[] newArrayExpected = null;

        int[] newArrayActual = new MinMaxAve().MinMaxAve(array, a, b);
        Assert.assertEquals(newArrayActual,newArrayExpected);

    }
}
