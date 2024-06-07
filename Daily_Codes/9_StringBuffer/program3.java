// concept => acceninhg capacity to StringBuffer


class StringBuffer3 {
	public static void main (String args[]) {

		StringBuffer str = new StringBuffer(50);  // Here we accen the 50 charecter capacity to StringBuffer
		str.append("prasad");
		System.out.println(str);
		System.out.println(str.capacity());
	}
}
