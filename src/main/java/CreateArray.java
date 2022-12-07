public class CreateArray {

//    написать в этом классе метод createIntArray(), который принимает на вход 5 целых чисел,
//    и возвращает массив из этих же чисел.

    public int[] createIntArray(int a, int b , int c, int d, int e){

        return new int[]{a, b, c, d, e};
    }

//    Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double,
//    и возвращает массив из этих же чисел

    public double[] createDoubleArray(double a, double b, double c, double d, double e){

        return new double[]{a, b, c, d, e};
    }

//    Написать метод createStringArray(), который принимает на вход 5 слов, и возвращает массив из этих слов

    public String[] createStringArray(String a, String b, String c, String d, String e){
        return new String[]{a, b, c, d, e};
    }


    public String[] createArrayFromText(String sentence){
        return sentence.split(" ");                //разделение символов строки на отдельные значения разделяя пробелами
    }

    //    написать метод createIntArrayFromText(), который принимает на вход строку чисел (н-р, “3 4 1 8 10 12.3”)
//    и возвращает массив типа int[] из этих чисел.

    public int[] createIntArrayFromText(String str){

        if(str == null || str.equals("")){
            return new int[0];
        }
        String[] arrayChar = str.split(" ");

        int[] resultArray = new int[arrayChar.length];

            for(int i = 0; i < arrayChar.length; i++){
               if(arrayChar[i].contains(".")){
                   double temp = Double.parseDouble(arrayChar[i]);
                   int number = (int) temp;
                   resultArray[i] = number;
                }else{
                   int temp = Integer.parseInt(arrayChar[i]);
                   resultArray[i] = temp;
            }
        }
            return resultArray;
    }

//    В классе CreateArray написать метод multiplesOf(), который принимает на вход целое положительные
//    число number в пределах от 1 включительно до 10 включительно, и возвращает таблицу умножения на это
//    число в виде массива
//    Например, multiplesOf(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

    public int[] multiplesOf(int number){

        int[] array = new int[11];
        if(number >= 0 && number <= Integer.MAX_VALUE / 10){
            for(int i = 0; i <= 10; i++){
                array[i] = number * i;
            }
            return array;
        }
        return new int[0];
    }


}
