public class ReverseArray {

//    Написать алгоритм ReverseArray, который принимает на вход массив целых чисел, и возвращает “перевернутый” массив.

    public int[] ReverseArray(int[] array) {
        if (Helpers.isItArray(array)) {

            int[] reverseArray = new int[array.length];

            for(int i = 0; i < array.length; i++){

                reverseArray[i] = array[array.length - 1 - i];
            }
            return reverseArray;

        }
        return new int[0];
    }
}
