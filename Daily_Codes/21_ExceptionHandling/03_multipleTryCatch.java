class ExceptionHandlingExample {
    public static void main(String[] args) {

        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic error occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("A general error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution of try-catch block is complete.");
        }

        System.out.println("Program continues after exception handling.");
    }
}