interface Reactangle {
    void area(double length, double breadth);
}

class LambdaExpressionExample {

    public static void main(String[] args) {
        // Lambda expression to implement area method
        Reactangle rect = (l, b) -> {
            double area = l * b;
            System.out.println("Area of Rectangle: " + area);
        };
        rect.area(5, 10);
    }
}
