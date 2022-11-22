import java.util.Arrays;

public class Intersection {

//    Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и возвращает массив общих элементов.

    public int[] Intersection(int[] array1, int[] array2) {
        if (Helpers.isItArray(array1) && (Helpers.isItArray(array2))) {

            int[] newArray = new int[array1.length + array2.length];
            int outlength = 0;

            for (int i = 0; i < array1.length; i++){
                for (int j = 0; j < array2.length; j++) {

                    if (array1[i] == array2[j]) {
                        newArray[outlength] = array1[i];
                        outlength++;
                    }
                }
            }
            return Arrays.copyOf(newArray, outlength);
        }

        return null;
    }
}

