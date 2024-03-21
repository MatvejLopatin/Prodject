public class BubleSort {
    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 8, 4, 7, 1};
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        for (int s : arr) {
            System.out.println(s);
        }
    }
}
