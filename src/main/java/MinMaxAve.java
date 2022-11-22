public class MinMaxAve {

//   Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов. Алгоритм возвращает
//   массив, который содержит минимальное значение, максимальное значение,  и среднее среди всех значений между 2-мя индексами.

    public int[] MinMaxAve(int[] array, int startIndex, int endIndex){

        if (Helpers.isItArray(array)) {

            int summ = 0;
            int max = array[startIndex];

            for (int i = startIndex; i < endIndex + 1; i++){
                if(max < array[i]){
                    max = array[i];
                }
                summ += array[i];
            }
            int average = summ / (endIndex - startIndex + 1);

            int min = array[startIndex];
            for (int i = startIndex; i < endIndex + 1; i++){
                if(min > array[i]){
                    min = array[i];
                }
            }

           int[] resultArray = new int[3];
           resultArray[0] = min;
           resultArray[1] = max;
           resultArray[2] = average;

           return resultArray;
        }
       return null;
    }
}
