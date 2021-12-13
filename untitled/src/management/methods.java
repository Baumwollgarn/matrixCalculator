package management;

public class methods {
    public static double average(int[] array) {
        double average = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;

        return average;
    }

    public static int indexOfMin(int[] array) {
        int indexOfMin = 0;
        int valueMin = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= valueMin) {
                valueMin= array[i];
                indexOfMin = i;
            }
        }

        return indexOfMin;
    }

    public static int ValueOfMinim(int[] array) {
        return array[indexOfMin(array)];
    }

    public static int indexOfMax(int[] array) {
        int indexOfMax = 0;
        int valueMax = Integer.MIN_VALUE;

        for (int i = 0 ; i < array.length; i++) {
            if (array[i] >= valueMax) {
                indexOfMax = i;
                valueMax = array[i];
            }
        }
        return indexOfMax;
    }

    public static int valueOfMax(int[] array) {
        return array[indexOfMax(array)];
    }
}
