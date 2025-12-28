/* Nested Switch
 */


class SwitchDemo5{
	public static void main(String [] args){

		System.out.println("oh pune");
		String str1 = "veg";

		switch(str1){
			case"veg": {
					   String str2 = "starter";
					   switch (str2){
						   case "starter" :
							   System.out.println("water");
							   break;
						   case "main course":
							   System.out.println("panir");
							   break;
					   }
					   break;
			}
			case"non veg":{
					      String str3 = "main course";
					      switch(str3){
						      case "starter":
							      System.out.println("Shup");
							      break;
						      case "main course":
							      System.out.println("Chicken");
							      break;
					      }break;
			}
		}
	}
}
