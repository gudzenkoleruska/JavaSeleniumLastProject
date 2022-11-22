import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectionTest {

//        {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
//        {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
//        {1, 2, 4, 5, 89}, {8, 9, 45} → {}
    @Test
    public void testIntersection_PositiveScenario(){

        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2};

        int[] expectedArray = {2, 4};
        int[] actualArray = new Intersection().Intersection(array1,array2);

        Assert.assertEquals(actualArray,expectedArray);

    }

    @Test
    public void testIntersection_PositiveScenario2(){

        int[] array1 = {1, 2, 4, 5, 8, 9};
        int[] array2 = {8, 9, -4, -2};

        int[] expectedArray = {8, 9};
        int[] actualArray = new Intersection().Intersection(array1,array2);

        Assert.assertEquals(actualArray,expectedArray);

    }

    @Test
    public void testIntersection_NegativeScenario(){

        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 45};

        int[] expectedArray = {};
        int[] actualArray = new Intersection().Intersection(array1,array2);

        Assert.assertEquals(actualArray,expectedArray);

    }


}
