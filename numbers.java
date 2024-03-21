public class numbers {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 1, 3, 5, 0, 7, 6, -1};
        int d = 0;

        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = arr.length-1; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    d = arr[j];
                    arr[j] = arr[i];
                    arr[i] = d;
                }
            }
        }
    
        for (int s : arr) {
            System.out.println(s);
        }
    }
}
