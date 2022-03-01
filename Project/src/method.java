public class method {
    public static int[] orderArray (int[] list) {
        int n = list.length;
        int temp;

        for (int j = 0 ; j < n; j++) {
            for (int k = 0 ; k < n - 1; k++) {
                if (list[k] > list[k+1]) {
                    temp = list[k];
                    list[k] = list[k + 1];
                    list[k + 1] = temp;
                }
            }
        }
        return list;
    }
}
