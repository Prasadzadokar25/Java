import java.util.Arrays;

class P6 {
    public static void main(String[] args) {

        int[] arr = { 9, 1, 8, 2, 7, 3, 6, 4 };
        int start = 0;
        int end = arr.length - 1;
        mergeSort(arr, start, end);
        System.out.println(Arrays.toString(arr));

    }

    static void mergeSort(int[] arr, int start, int end) {

        if (start < end) {
            int mid = start + (end - start) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    static void merge(int[] arr, int start, int mid, int end) {

        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] an1 = new int[n1];
        int[] an2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            an1[i] = arr[start + i];
        }

        for (int i = 0; i < n2; i++) {
            an2[i] = arr[mid + 1 + i];
        }

        int index = start;
        int c1 = 0;
        int c2 = 0;
        while (c1 < n1 && c2 < n2) {
            if (an1[c1] < an2[c2]) {
                arr[index] = an1[c1];
                index++;
                c1++;
            } else {
                arr[index] = an2[c2];
                index++;
                c2++;
            }
        }

        while (c1 < n1) {
            arr[index] = an1[c1];
            c1++;
            index++;
        }
        while (c2 < n2) {
            arr[index] = an2[c2];
            c2++;
            index++;
        }
    }
}
