interface Reactangle {
    int area(int length, int breadth);
}

class LambdaExpressionExample {
    public static void main(String[] args) {
        Reactangle obj = (l, b) -> {
            return l * b;
        };

        System.out.println("Area of Rectangle: " + obj.area(5, 10));
    }
}