/* Concept => Default capacity of StringBuffer ( 16 charecter )
 */

class StringBuffer2 {

	public static void main(String args[]) {
 
		System.out.println("-----------Default capacity---------");

		StringBuffer str1 = new StringBuffer();
                System.out.println(str1.capacity());   // Default capacity od StringBuffer is 16
		
		str1.append("Prasad");
		System.out.println(str1);
		System.out.println(str1.capacity());

		System.out.println("----------- capacity when String initialize---------");

		StringBuffer str2 = new StringBuffer("OmPatil");
		System.out.println(str2);
                System.out.println(str2.capacity());   // cpacity = Default capacity + number of charecter in stingBuffer
						      
		System.out.println("------------capacity when StringBuffer length is grater than default capacity-------");

		StringBuffer str3 = new StringBuffer ("p");
		str3.append("PrasadVarshaVinayakZadokar");
		System.out.println(str3);
		System.out.println(str3.capacity());  // Here new capicty = (current capicit +1 ) *2
	}
}
