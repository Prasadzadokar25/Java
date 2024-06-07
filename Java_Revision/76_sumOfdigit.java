class Main {
    public static int sumOfDigitsFromString(String numStr) {
        int totalSum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            // '0' has the ASCII value of 48, so subtracting '0' from a char digit gives the integer value
            totalSum += numStr.charAt(i) - '0';
        }
        return totalSum;
    }

    public static void main(String[] args) {
        String numberStr = "12345";
        System.out.println("Sum of digits (string): " + sumOfDigitsFromString(numberStr));
    }
}

