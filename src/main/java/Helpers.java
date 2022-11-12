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

}

