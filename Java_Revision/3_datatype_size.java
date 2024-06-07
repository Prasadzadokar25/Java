class Program3 {
	public static void main(String [] args){

		System.out.println("size of byte = " + Byte.BYTES);
		System.out.println("size of int = " + Integer.BYTES);
		
		Integer x = 10;
		int y = 20;
		System.out.println(x+y);

		System.out.println(x.TYPE); // return datatype of variable
		System.out.println(x.SIZE); // return size of variable in bite
	}
}
