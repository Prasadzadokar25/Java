class P3 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        int[] arr2 = new int[arr.length];

        arr2[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr2[i] = arr2[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                if (i == 0) {
                    System.out.println(arr2[j]);
                } else
                    System.out.println(arr2[j] - arr2[i - 1]);
            }
        }
    }
}
