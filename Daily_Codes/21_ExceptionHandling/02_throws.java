
class ExceptionHandlingExample {

    static void divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) throws ArithmeticException {

        int a = 15;
        int b = 0;
        try {
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}