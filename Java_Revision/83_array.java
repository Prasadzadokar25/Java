class Demo {
    public static void main(String[] args) {
        int[] bags = {100, 100, 99, 100, 100, 100, 100, 100, 100, 100};

        int[] psArr = new int[bags.length];
        psArr[0] = bags[0];

        // Calculate the prefix sum array
        for (int i = 1; i < bags.length; i++) {
            psArr[i] = psArr[i - 1] + bags[i];
        }

        int start = 0;
        int end = bags.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;

            int leftW = psArr[mid] - (start == 0 ? 0 : psArr[start - 1]);
            int rightW = psArr[end] - psArr[mid];

            if (leftW < rightW) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Bag with less weight is at index: " + (mid));
    }
}

