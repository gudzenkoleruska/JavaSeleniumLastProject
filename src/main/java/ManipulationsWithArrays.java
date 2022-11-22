public class ManipulationsWithArrays {
//    Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
//    Метод возвращает массив тех же чисел, умноженных на number

    public int[] multiplуArrayByNumber(int[] array, int number) {

        if (array == null) {
            return new int[0];
        }


        int[] newArray = new int[array.length];

        if (array.length == 0) {
            return new int[0];
        }
        if (number == 0) {
            return newArray;
        }

        for (int i = 0; i < array.length; i++) {
            int result = array[i] * number;

            if (result / number == array[i]) {                //проверяем, что не выходят значения за пределы int
                newArray[i] = result;
            } else {
                return new int[0];
            }
        }
        return newArray;
    }

//    Написать метод toDoubleArray(), который принимает на вход массив целых чисел,
//    и возвращает массив типа double[] из тех же чисел

    public double[] toDoubleArray(int[] array){

        double[] newDoubleArray = new double[array.length];

        if(Helpers.isItArray(array)){

            for(int i = 0; i < array.length; i++){
                newDoubleArray[i] = array[i];
            }
            }else{
            return new double[0];
        }
        return newDoubleArray;
    }

//    Написать метод toIntArray(), который принимает на вход массив типа double[],
//    и возвращает массив типа int[] из тех же чисел

    public int[] toIntArray(double[] array) {

        int[] newArrayInt = new int[array.length];

        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                newArrayInt[i] = (int) array[i];
            }
        } else {
            return new int[0];
        }
        return newArrayInt;

    }

//    Написать метод toStringArray(), который принимает на вход массив целых чисел,  и возвращает массив типа
//    String[] из тех же чисел (желательно не использовать метод .toString(), нужно переводить вручную)

    public String[] toStringArray(int[] array) {

        String[] newArrayString = new String[array.length];

        if (array.length == 0) {
            return new String[0];
        }
        for (int i = 0; i < array.length; i++) {
            newArrayString[i] = "" + array[i];
        }

        return newArrayString;
    }

//    В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(), который принимает на вход массив
//    целых чисел и число number. Метод возвращает значение true, если все элементы массива больше number,
//    иначе возвращает false

    public boolean areValuesGreaterThanNumber(int[] array, int number){

        if (array.length == 0) {
            return false;
        }

        int countBiggerValueOfElements = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] > countBiggerValueOfElements){
                countBiggerValueOfElements ++;
            }
        }
       if(countBiggerValueOfElements == array.length){
           return true;
        }
       return false;
    }

}
