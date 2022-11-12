public class SumArray {

//    Написать алгоритм SumArray, который возвращает сумму всех чисел массива

    public int SumArray (int[] array){
        int result = 0;

        if (Helpers.isItArray(array)){

            for(int i = 0; i <array.length; i++){
                result += array[i];
            }
            return result;
        }

        return 0;
    }

}
