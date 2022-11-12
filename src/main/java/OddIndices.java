public class OddIndices {

    //    Написать алгоритм OddIndices, который принимает массив целых чисел,  и возвращает массив значений нечетных индексов
    public int[] OddIndices(int[] array) {
        if (Helpers.isItArray(array)){
            int j = 0;
            int[] newArray = new int[array.length / 2];                  //длина в 2 раза меньше
            for (int i = 1; i < array.length; i += 2) {
                newArray[j] = array[i];
                j++;
            }
            return newArray;
        }
        return new int[0];

    }
}




