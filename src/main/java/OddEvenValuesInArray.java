public class OddEvenValuesInArray {

//    Написать метод countEvenValuesInArray(), который принимает на вход массив целых чисел,
//    и возвращает количество четных чисел в этом массиве

    public int countEvenValuesInArray(int[] array){

        if (Helpers.isItArray(array)){

            int count = 0;

            for(int i = 0; i < array.length; i++){
                if(array[i] % 2 == 0){
                    count ++;
                }
            }
            return count;
        }

        return -1;
    }

}
