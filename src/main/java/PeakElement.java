public class PeakElement {
//    Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и
//    возвращает значения пиковых элементов (элементы, которые больше своих соседей).

    public int[] PeakElement(int[] array){
        if (Helpers.isItArray(array)) {

            int count = 0;

            for(int i = 0; i < array.length; i++) {               //находим значения
                if ((i == array.length - 1 || array[i] > array[i + 1]) && (i == 0 || array[i] > array[i - 1])) {
                    count++;
                }
            }
            int[] newArray = new int[count];
            int indexArray = 0;

            for(int i = 0; i < array.length; i++){                 //заполняем значения в новом массиве
                if((i == array.length - 1 || array[i] > array[i + 1]) && (i == 0 || array[i] > array[i - 1])){
                    newArray[indexArray] = array[i];
                    indexArray += 1;
                }
            }
            return newArray;
        }
        return new int[0];
    }

}
