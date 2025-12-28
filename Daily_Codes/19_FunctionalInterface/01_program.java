
// interface with a single abstract method
interface A {

    void display();
}

class FunctionalInterfaceExample implements A {

    @Override
    public void display() {
        System.out.println("Functional Interface Example");
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample example = new FunctionalInterfaceExample();
        example.display();
    }
}
