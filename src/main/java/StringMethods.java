
public class StringMethods {

//    Написать метод removeSpaces(), который принимает на вход строку.
//    Если строка не пустая (проверить методом класса String), то примените метод по удалению пробелов в начале и в конце строки.
//    Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
//    Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
//    Если пробелов не было, вернуть сообщение “Пробелов не было”.
//    Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.

    public String removeSpaces(String str) {
        if (!str.isEmpty()) {
            str.trim();
            if (str.length() == str.trim().length()) {
                return "Пробелов не было";
            } else {
                return "Лишние пробелы удалены";
            }
        }
        return "Строка пустая";
    }

//    Написать алгоритм removeAllAs().
//    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
//    Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
//    Метод возвращает обработанную строку.

    public String removeAllAs(String str) {
        if (!str.isEmpty()) {
            String newStr = str.trim().replace("a", "");
            return newStr;
        }
        return "";
    }


//    Написать алгоритм removeAllZeros().
//    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
//    Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную
//    строку, в которой нет нулей. Если в строке не было нулей, метод возвращает сообщение “This is a valid string”.

    public String removeAllZeros(String str) {
        if (!str.isEmpty()) {

            String newStr = str.trim().replace("0", "");

            if (newStr.length() == str.trim().length()) {
                return "This is a valid string";
            } else {
                return newStr;
            }
        }
        return "Empty String";
    }

//    Напишите метод countAs(), который принимает на вход строку и считает, сколько букв а или А содержится в строке.
//    Метод возвращает количество букв a/A,  и количество букв/знаков в слове без букв a/A. Итоговый результат должен
//    строится с помощью метода из видео 2.

    public String countAs(String str) {
        if (Helpers.isValidString(str)) {
            str = str.trim().toLowerCase();

            int countLeterA = 0;
            int countOther = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a') {
                    countLeterA += 1;
                } else {
                    countOther += 1;
                }
            }
            if (countLeterA + countOther == str.trim().length()) {
                return String.valueOf(countLeterA).concat(", ").concat(String.valueOf(countOther));
            }
        }
        return "Error! Sentence is null or empty";
    }

//    Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается и заканчивается
//    на одинаковую букву, и false иначе

    public String sameFirstLastLeter(String word) {
        if (Helpers.isValidString(word)) {
            word = word.trim().toLowerCase();

            if (word.indexOf(word.charAt(word.length() - 1)) == 0) {   // берется последняя буква и первое вхождение этой буквы и сравнивается со значением под индексом 0
                return "true";
            }
            return "false";
        }
        return "Empty string";
    }


//    Напишите метод, который принимает на вход строку из двух слов, разделенных пробелом, и возвращает последнее слово

    public String returnLastWord(String twoWords) {
        if (Helpers.isValidString(twoWords)) {
            twoWords = twoWords.trim();

            if (twoWords.contains(" ")) {
                return twoWords.substring(twoWords.indexOf(" ") + 1);
            }
        }
        return "Empty string";
    }

//    Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все, что находится между
//    первой и последней буквой-параметром

    public String returnSentence(String str, char letter) {
        if (Helpers.isValidString(str)) {
            if (str.trim().contains(String.valueOf(letter))) {

                return str.substring(str.indexOf(letter), str.lastIndexOf(letter) + 1);
            }
            return "No " + letter + " in the sentence";
        }
        return "Empty string";
    }

//    Напишите метод, который принимает на вход название города и исправляет написание

    public String correctCity(String city) {
        if (Helpers.isValidString(city)) {
            city = city.trim().toLowerCase();

            return Character.toUpperCase(city.charAt(0)) + city.substring(1);

        }
        return "Empty string";
    }

//    Напишите метод insertQuotes(), который принимает на вход две строки, и добавляет знак :  после слова “писал”,
//    и оборачивает в кавычки вторую строку.
//Test Data:
//            “Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
//            “Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”

    public String insertQuotes(String str1, String str2) {
        if (Helpers.isValidString(str1) && (Helpers.isValidString(str2))) {
            str2 = str2.replace("Надо любить жизнь больше, чем смысл жизни", "\"Надо любить жизнь " +
                    "больше, чем смысл жизни\"");
            return (str1.concat(": ").concat(str2));
        }
        return "Empty string";
    }

//    Напишите метод insertQuotes(), который принимает слово и возвращает строку, в которой это слово “обернуто” в кавычки:
//    Test Data:
//            “Abracadabra” →  ““Abracadabra””

    public static String insertQuotes(String sentence) {
        if (Helpers.isValidString(sentence)) {
            char charToAdd = (char) 34;
            return "" + charToAdd + sentence + charToAdd;                //возвращает строку
        }
        return "Empty string";
    }

//    Напишите метод countJava(), который принимает на вход текст и проверяет, содержится ли в тексте
//    хотя бы одно слово Java.

    public String countJava(String str){
        if (Helpers.isValidString(str)) {
            if(str.contains("Java")){
                return "true";
            }
            return "false";
        }
        return "Empty string";
    }

//    Напишите метод countAs(), который принимает на вход строку и считает, сколько букв а или А содержится в строке.
//    Метод возвращает количество букв a/A,  и количество букв/знаков в слове без букв a/A.

    public String countAs1(String str) {
        if (Helpers.isValidString(str)) {

            int lengthStrWithoutA = str.toLowerCase().replace("a","").length();
            int lengthAaInString = str.length() - lengthStrWithoutA;

            return lengthAaInString + ", " + lengthStrWithoutA;
        }
        return "Empty string";
    }

//    Напишите метод, который принимает на вход строку из двух слов, разделенных пробелом, и возвращает последнее слово

    public String returnTheLastWord(String sentence) {
        if (Helpers.isValidString(sentence)) {
            return sentence.substring(sentence.indexOf(" ") + 1);
        }
        return "Empty string";
    }

//    Написать метод, который принимает строку, и 2 индекса. Метод удаляет все, что находится между двумя
//    индексами включительно

    public String returnPartOfSentence(String sentence, int a, int b) {
        if (Helpers.isValidString(sentence)) {
            return sentence.substring(sentence.length() - a - b);
        }
        return "Empty string";
    }

//    Напишите метод, который принимает на вход предложение и возвращает слова из этого предложения в виде массива слов

    public static String[] returnArrayWords(String str){
        if (Helpers.isValidString(str)) {
            return str.split(" ");
        }
        return new String[0];
    }

    public String returnArrayText(String str) {
        if (Helpers.isValidString(str)) {

            String[] strNew = str.split(" ");

            return "Имя: " + strNew[0] + "\nОтчество: " + strNew[1] + "\nФамилия: " + strNew[2];
        }
        return "Empty string";
    }

//    Написать метод, который принимает на вход слово и число n,  и возвращает строку, где слово повторяется n раз.

    public String returnSentence(String word, int number) {
        if (Helpers.isValidString(word)) {

            String str = word.repeat(number);
            return str;
        }
        return "Empty string";
    }

//    Напишите метод, который принимает строку и index, и возвращает численное значение буквы, которая
//    находится на позиции index

    public int returnIntChar(String str, int index) {
        if (Helpers.isValidString(str)) {

           return Character.codePointAt(str,index);

        }
        return 0;
    }

//    Написать метод, который принимает 3 слова, и сравнивает их методом, который считает, что прописные и заглавные
//    буквы - это одни и те же буквы. Метод возвращает true, если все слова одинаковы, и метод возвращает false,
//    если слова не одинаковы:

    public String equalwords(String word1, String word2, String word3) {
        if (Helpers.isValidString(word1) && Helpers.isValidString(word2) && Helpers.isValidString(word3) ) {

            if(word1.toLowerCase().equals(word2.toLowerCase()) && word2.toLowerCase().equals(word3.toLowerCase())){
                return "true";
            }
            return "false";

        }
        return "Empty string";
    }




//    public static void main(String[] args) {
//        String word1 = "one";
//        String word2 = "ONE";
//        String word3 = "One";
//        System.out.println(equalwords(word1,word2,word3));
//    }


}



