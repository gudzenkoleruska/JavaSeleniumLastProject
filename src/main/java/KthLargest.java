public class KthLargest {
//    Написать алгоритм KthLargest, который принимает на вход массив целых чисел и число k,
//    и возвращает k-тый максимальный элемент.

    public int[] KthLargest(int[] array, int k) {
        if (Helpers.isItArray(array)) {

            if (k < array.length && k != 0){
                return new int[]{Helpers.SortArray(array)[array.length - k]};
            }

        }
        return new int[0];
    }
}
