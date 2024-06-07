class Program5 {

	public static void main(String args[]){

		String str1 = "prasad";
		String str2 = new String("prasad");

		if(str1 == str2){  //compair address
                        System.out.println("yes");
                }else{
                        System.out.println("no");
                }

		if(str1.equals(str2)){ //compair content
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
}
