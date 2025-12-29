class ExceptionHandlingExample {
    static void calculateArea(int radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        } else {
            double area = Math.PI * radius * radius;
            System.out.println("Area: " + area);
        }
    }

    public static void main(String[] args) {
        try {
            calculateArea(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}