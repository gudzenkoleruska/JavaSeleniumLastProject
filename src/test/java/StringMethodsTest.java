import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

    //removeSpaces method

    @Test
    public void testDelateSpaces(){

        String str = " Red Rover School  ";
        String expectedResult = "Лишние пробелы удалены";

        String actualResult = new StringMethods().removeSpaces(str);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNoSpaces(){

        String str = "Red Rover School";
        String expectedResult = "Пробелов не было";

        String actualResult = new StringMethods().removeSpaces(str);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyString(){

        String str = "";
        String expectedResult = "Строка пустая";

        String actualResult = new StringMethods().removeSpaces(str);
        Assert.assertEquals(actualResult, expectedResult);
    }

//    removeAllAs method

    @Test
    public void removeAllAs1(){

        String str = "    Red Rover School   ";
        String expectedResult = "Red Rover School";

        String actualResult = new StringMethods().removeAllAs(str);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void removeAllAs2(){

        String str = "panda   ";
        String expectedResult = "pnd";

        String actualResult = new StringMethods().removeAllAs(str);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void removeAllAs3(){

        String str = "taramasalata";
        String expectedResult = "trmslt";

        String actualResult = new StringMethods().removeAllAs(str);
        Assert.assertEquals(actualResult, expectedResult);
    }

//    removeAllZeros method

    @Test
    public void removeAllZeros1(){

        String str = "3504209706040000 ";
        String expectedResult = "35429764";

        String actualResult = new StringMethods().removeAllZeros(str);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void removeAllZeros2(){

        String str = "0000000111";
        String expectedResult = "111";

        String actualResult = new StringMethods().removeAllZeros(str);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void removeAllZeros3(){

        String str = "7356764756746  ";
        String expectedResult = "This is a valid string";

        String actualResult = new StringMethods().removeAllZeros(str);
        Assert.assertEquals(actualResult, expectedResult);
    }

//    countAs method

    @Test
    public void countAs_Positive1(){

        String str = " Communicate is an important thing ";
        String expectedResult = "3, 30";

        String actualResult = new StringMethods().countAs(str);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void countAs_Positive2(){

        String str = "Homenum Revelio";
        String expectedResult = "0, 15";

        String actualResult = new StringMethods().countAs(str);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void countAs_Positive3(){

        String str = "3 tarAmasAlatA";
        String expectedResult = "6, 8";

        String actualResult = new StringMethods().countAs(str);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void countAs_EmptySentense(){

        String str = "";
        String expectedResult = "Error! Sentence is null or empty";

        String actualResult = new StringMethods().countAs(str);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void countAs_NullSentense(){

        String str = "";
        String expectedResult = "Error! Sentence is null or empty";

        String actualResult = new StringMethods().countAs(str);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Check First_Last letter
    @Test
    public void firstLastLetterOfWord_Positive(){

        String word = "Abracadabra";
        String expectedResult = "true";

        String actualResult = new StringMethods().sameFirstLastLeter(word);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void firstLastLetterOfWord_NotMatch(){

        String word = "Whippersnapper";
        String expectedResult = "false";

        String actualResult = new StringMethods().sameFirstLastLeter(word);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void firstLastLetterOfWord_Negative(){

        String word = "";
        String expectedResult = "Empty string";

        String actualResult = new StringMethods().sameFirstLastLeter(word);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //return last word

    @Test
    public void returnLastWord_Positive(){

        String words = "Red Rover";
        String expectedResult = "Rover";

        String actualResult = new StringMethods().returnLastWord(words);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void returnLastWord_Negative(){

        String words = "";
        String expectedResult = "Empty string";

        String actualResult = new StringMethods().returnLastWord(words);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void returnSentence_Positive(){

        String str = "Abracadabra";
        char letter = 'b';
        String expectedResult = "bracadab";

        String actualResult = new StringMethods().returnSentence(str, letter);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void returnSentence_Negative(){

        String str = "Abracadabra";
        char letter = 'c';
        String expectedResult = "c";

        String actualResult = new StringMethods().returnSentence(str, letter);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void correctCity_FirstLetter(){

        String city = "ташкент";
        String expectedResult = "Ташкент";

        String actualResult = new StringMethods().correctCity(city);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void correctCity_MiddleLetter(){

        String city = "ЧикаГО";
        String expectedResult = "Чикаго";

        String actualResult = new StringMethods().correctCity(city);
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void equalwords_PositiveTrue(){

        String word1 = "one";
        String word2 = "ONE";
        String word3 = "One";
        String expectedResult = "true";

        String actualResult = new StringMethods().equalwords(word1, word2, word3);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void equalwords_PositiveFalse(){

        String word1 = "one";
        String word2 = "Один";
        String word3 = "One";
        String expectedResult = "false";

        String actualResult = new StringMethods().equalwords(word1, word2, word3);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void equalwords_PositiveNegative(){

        String word1 = "";
        String word2 = "";
        String word3 = "One";
        String expectedResult = "Empty string";

        String actualResult = new StringMethods().equalwords(word1, word2, word3);
        Assert.assertEquals(actualResult, expectedResult);
    }

}
