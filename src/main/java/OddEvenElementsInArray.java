public class OddEvenElementsInArray {

//    В классе OddEvenElementsInArray написать метод countOddEvenValuesInArray(),
//    который принимает на вход массив целых чисел и возвращает массив int[2],
//    который содержит количество четных и нечетных элементов входящего массива

    public int[] OddEvenElementsInArray(int[] array) {
        if (Helpers.isItArray(array)) {

            int even = 0;
            int odd = 0;

            for(int i = 0; i < array.length; i++){
                if(array[i] % 2 == 0){
                    even++;
                }else{
                    odd++;
                }
            }
            return new int[]{even, odd};
        }
        return new int[0];

    }
}
