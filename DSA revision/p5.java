import java.util.Arrays;

class P5 {

    public static void main(String[] args) {
        int[] arr = { 3, 2, 13, 4, 25, 6, 7, 10, 9 };

        // buble sort
        // for (int i = 0; i < arr.length; i++) {

        // for (int j = 0; j < arr.length - 1 - i; i++) {
        // if (arr[i] > arr[i + 1]) {
        // int temp = arr[i];
        // arr[i] = arr[i + 1];
        // arr[i + 1] = temp;
        // }
        // }
        // };

        // insertion sort
        // for (int i = 1; i < arr.length; i++) {

        // int element = arr[i];

        // int j = i - 1;
        // while (j >= 0 && arr[j] > element) {
        // arr[j+1] = arr[j];
        // j--;
        // }

        // arr[j+1] = element;

        // }

        // selection sort

        // for (int i = 0; i < arr.length; i++) {
        // int min=i;
        // for(int j=i+1; j<arr.length; j++){

        // if(arr[j]<arr[min]){
        // min = j;
        // }
        // }

        // int temp = arr[min];
        // arr[min] = arr[i];
        // arr[i] = temp;
        // }

        for (int i = 1; i < arr.length; i++) {

            int j = i - 1;

            int element = arr[i];
            while (j >= 0 && arr[j] > element) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = element;
        }

        System.out.println(Arrays.toString(arr));

    }
}
