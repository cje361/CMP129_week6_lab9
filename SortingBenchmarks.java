public class SortingBenchmarks {

    public static void main(String[] args) {
        int[] array1 = {45, 12, 89, 3, 67, 23, 91, 8, 54, 31,
                        76, 19, 62, 5, 38, 84, 27, 70, 14, 50};
        int[] array2 = {45, 12, 89, 3, 67, 23, 91, 8, 54, 31,
                        76, 19, 62, 5, 38, 84, 27, 70, 14, 50};

        System.out.print("Original array:       ");
        displayArray(array1);

        int bubbleExchanges = bubbleSort(array1);
        int selectionExchanges = selectionSort(array2);

        System.out.print("After bubble sort:    ");
        displayArray(array1);
        System.out.print("After selection sort: ");
        displayArray(array2);

        System.out.println();
        System.out.println("Bubble sort exchanges:    " + bubbleExchanges);
        System.out.println("Selection sort exchanges: " + selectionExchanges);
    }

    public static int bubbleSort(int[] array) {
        int exchanges = 0;

        for (int pass = 0; pass < array.length - 1; pass++) {
            for (int i = 0; i < array.length - 1 - pass; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    exchanges++;
                }
            }
        }
        return exchanges;
    }

    public static int selectionSort(int[] array) {
        int exchanges = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            if (smallestIndex != i) {
                int temp = array[i];
                array[i] = array[smallestIndex];
                array[smallestIndex] = temp;
                exchanges++;
            }
        }
        return exchanges;
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
