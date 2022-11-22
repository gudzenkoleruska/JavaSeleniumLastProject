import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {

//    {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
    @Test
    public void testSortArray(){

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};

        int[] expectedArray = {2, 3, 4, 4, 5, 7, 9, 12, 12};
        int[] actualArray = new SortArray().SortArray(array);

        Assert.assertEquals(actualArray,expectedArray);

    }
}
