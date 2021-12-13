package management;

public class Main {
    public static void main(String[] args) {

        int[] values = {15,22,62,19,21,1,48,188,145,5922};
        int[] values2 = {61,512,1992,290,95,21,1};
        int[] values3 = {56,11,20,895,288};

        System.out.println("The average is " + methods.average(values) + "\r");
        System.out.println("The index of the smallest number is " + methods.indexOfMin(values) + " and the value of it is " + methods.ValueOfMinim(values) + "\r");
        System.out.println("The index of the biggest number is " + methods.indexOfMax(values) + " and the value of it is " + methods.valueOfMax(values) + "\r");

        sorts.bubbleSort(values);

        for (int c : values) {
            System.out.println(c + " ");
        }
        System.out.println("________________________________");
        sorts.selectionSort(values2);

        for (int c : values2) System.out.println(c + " ");

        System.out.println("________________________________");

        sorts.insertionSort(values3);

        for (int c : values3) System.out.println(c + " ");
    }
}
