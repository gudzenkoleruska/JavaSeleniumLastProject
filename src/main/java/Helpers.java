public class Helpers {

    public static int countRandom(int n, int m) {
        int num = (int) ((Math.random() * (m - n + 1) + n));
        return num;
    }

    public static void printAverage(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        System.out.println("Average value of array: " + count / arr.length);
    }

    public static int findSmallestInt(int[] args) {

        int min = args[0];
        for (int i = 0; i < args.length; i++) {
            if (min > args[i]) {
                min = args[i];
            }
        }
        return min;
    }

    public static int countNumbers(Boolean arrayNumbers[]) {
        int count = 0;

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] != null) {
                if (arrayNumbers[i] == true) {
                    count++;
                }
            } else {
                return count;
            }
        }
        return count;
    }

    public static boolean isItArray(int[] array) {
        if (array != null && array.length > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] ReverseArray(int[] array) {

            int[] reverseArray = new int[array.length];

            for(int i = 0; i < array.length; i++){

                reverseArray[i] = array[array.length - 1 - i];
            }
            return reverseArray;
    }


    public static int[] SortArray(int[] array) {

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

    public int[] evenArray(int[] arr){

        int[] resultArray = new int[arr.length];

        int resultArrIndex = 0;

        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                resultArray[resultArrIndex] = i;
                resultArrIndex++;
            }
        }
        return resultArray;
    }

    public int[] oddArray(int[] arr){

        int[] resultArray = new int[arr.length];

        int resultArrIndex = 0;

        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0){
                resultArray[resultArrIndex] = i;
                resultArrIndex++;
            }
        }
        return resultArray;
    }



}




