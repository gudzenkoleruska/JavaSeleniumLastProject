public class SortArray {

//    Написать алгоритм SortArray, который принимает на вход массив целых чисел,
//    и сортирует элементы массива в порядке возрастания.

    public int[] SortArray(int[] array) {

        if (Helpers.isItArray(array)) {

            for (int j = 0; ; ) {
                int temp = 0;
                int count = 0;                  //для остановки массива

                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        count++;
                    }
                }
                if (count == 0) {
                    break;
                }
            }
            return array;
        }
        return new int[0];
    }
}


