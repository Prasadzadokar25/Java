import java.util.Arrays;

class P7 {
    public static void main(String[] args) {

        int[] arr = { 9, 1, 8, 2, 7, 3, 6, 4 };
        int start = 0;
        int end = arr.length - 1;
        queckSort(arr, start, end);
        System.out.println(Arrays.toString(arr));

    }

    static void queckSort(int[] arr, int start, int end) {

        if (start < end) {
            int pivoteIndex = paration(arr, start, end);

            queckSort(arr, start, pivoteIndex - 1);
            queckSort(arr, pivoteIndex + 1, end);
        }
    }

    static int paration(int[] arr, int start, int end) {

        int pivote = arr[end];

        int current = start;
        for (int i = start; i < end; i++) {

            if (arr[i] < pivote) {
                int temp = arr[i];
                arr[i] = arr[current];
                arr[current] = temp;
                current++;
            }
        }

        int temp = arr[current];
        arr[current] = pivote;
        arr[end] = temp;

        return current;

    }

}
