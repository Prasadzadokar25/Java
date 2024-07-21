class P4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int num = 8;

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == num) {
                System.out.println(mid);
                return;
            }
            if (num > arr[mid]) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }
        System.out.println("-1");

    }
}