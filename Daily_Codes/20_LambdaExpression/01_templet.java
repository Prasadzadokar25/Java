
interface A {
    void display();
}

class LambdaExpressionExample {
    public static void main(String[] args) {

        System.out.println("==============by anonymous inner class example");
        A obj = new A() {
            public void display() {
                System.out.println("Anonymous Inner Class Example");
            }
        };
        obj.display();
        System.out.println("==============by lamabda expression example");
        A obj2 = () -> {
            System.out.println("Lambda Expression Example");
        };
        obj2.display();

    }
}