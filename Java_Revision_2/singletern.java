class singletern {

    static singletern obj = new singletern();

    private singletern() {
        System.out.println("In constructor");
    }

    static singletern getObjrct() {
        return obj;
    }

}

class Main {
    public static void main(String[] args) {

        singletern obj1 = singletern.getObjrct();
        singletern obj2 = singletern.getObjrct();
        System.out.println(singletern.obj);
        System.out.println(obj2);

    }
}
