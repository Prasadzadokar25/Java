class Program2 {
	public static void main(String args[]){

		 System.out.println("Size of byte: " + Byte.BYTES + " bytes");
        System.out.println("Size of short: " + Short.BYTES + " bytes");
        System.out.println("Size of int: " + Integer.BYTES + " bytes");
        System.out.println("Size of long: " + Long.BYTES + " bytes");
        System.out.println("Size of float: " + Float.BYTES + " bytes");
        System.out.println("Size of double: " + Double.BYTES + " bytes");
        System.out.println("Size of char: " + Character.BYTES + " bytes");

        // Since boolean is not precisely defined, we can't use Boolean.BYTES. Its size is JVM-dependent.
        System.out.println("Size of boolean: " + "depends on the JVM");
	}
}

