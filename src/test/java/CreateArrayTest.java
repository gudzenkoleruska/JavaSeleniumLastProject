import org.testng.annotations.Test;

public class CreateArrayTest {

    @Test
    public void testCreateArrayFromText(){

        String sentence = "It was an apple pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        String[] actualResult = new CreateArray().createArrayFromText(sentence);

    }
}
