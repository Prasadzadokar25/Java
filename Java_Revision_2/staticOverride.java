interface Demo {

    int num = 10;
    static void fun() {
        System.out.println("in interface");
    }
}

class Child implements Demo {
 void fun() {
        System.out.println("in child");
        System.out.println(Demo.num);


    }
}

class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.fun();
        
    }
}