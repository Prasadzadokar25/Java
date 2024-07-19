class Demo {
    public static void main(String[] args) {
        String str = "prasad";
        System.out.println(reverse(str));
    }

    static String reverse(String str) {

        if (str.length() == 0)
            return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }
}