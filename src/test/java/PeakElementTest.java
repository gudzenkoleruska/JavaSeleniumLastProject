import org.testng.Assert;
import org.testng.annotations.Test;

public class PeakElementTest {

//    {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}

    @Test
    public void testPeakElement_Positive(){
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};

        int[] expectedArray = {3, 7, 23};
        int[] actualArray = new PeakElement().PeakElement(array);

        Assert.assertEquals(actualArray,expectedArray);
    }

    @Test
    public void testPeakElement_Positive_OneNumber(){
        int[] array = {3};

        int[] expectedArray = {3};
        int[] actualArray = new PeakElement().PeakElement(array);

        Assert.assertEquals(actualArray,expectedArray);
    }

    @Test
    public void testPeakElement_Negative(){
        int[] array = {};

        int[] expectedArray = {};
        int[] actualArray = new PeakElement().PeakElement(array);

        Assert.assertEquals(actualArray,expectedArray);
    }
}
