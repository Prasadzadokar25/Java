class Demo{
	public static void main(String[] args){

		String name = "oyo";

		String revName = "";  //revName = null  don't declere using null

		for(int i=0; i<name.length(); i++){
			
			revName = revName+(name.charAt(name.length()-1-i));
			
		}

		if(name.equals(revName)){
			System.out.println("yes");
		}else{
			System.out.println("No");
		}

		String revName2 = new StringBuffer(name).reverse().toString();

		if(name.equals(revName2)){
                        System.out.println("yes");
                }else{
                        System.out.println("No");
                }
	}
}
