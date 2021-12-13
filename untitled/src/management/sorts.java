package management;

public class sorts {
    public static int[] bubbleSort(int[] M){
        int n = M.length;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (M[i] > M[i + 1]) {
                    int temp = M[i];
                    M[i] = M[i + 1];
                    M[i + 1] = temp;
                }
            }
        }
        return M;
    }

    public static int[] selectionSort(int[] M){
        int n = M.length;
        int temp;
        int minValue;
        int minIndex;

        for (int i = 0; i < n; i++) {
            minValue = M[i];
            minIndex = i;

            for (int j = i; j < n; j++){
                if (M[j] < minValue){
                    minValue = M[j];
                    minIndex = j;
                }
            }
            if (minValue < M[i]){
                temp = M[i];
                M[i] = M[minIndex];
                M[minIndex] = temp;
            }
        }
        return M;
    }

    public static int[] insertionSort(int[] M){
        int n = M.length;

        for (int i = 1; i < n; i++){
            int k = M[i];
            int temp;

            int j = i - 1;

            while (j >= 0 && k < M[j]){

                // swap
                temp = M[j];
                M[j] = M[j+1];
                M[j+1] = temp;
                j--;
            }
        }





        return M;
    }
}
