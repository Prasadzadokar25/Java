class InvalidAge extends Exception {

    InvalidAge(String massgeString) {
        super(massgeString);
    }
}

class Main {

    public static void main(String[] args) throws InvalidAge {

        int age = 4;
        chechAge(age);
    }

    static void chechAge(int age) throws InvalidAge {
        if (age < 18) {
            throw new InvalidAge("invalid age ");
        }
    }
}