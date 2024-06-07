/*print whither the person has high ,Normal or low tempreture
 * codition  tem > 98.8 ----high
 * 	     tem < 98.0 ----low  */


class IfElseDemo4{
	public static void main(String[] arg){

		float temp = 98.1f;
	       
		if(temp>98.6f){
			System.out.println("Tempreture is high");

		}else if(temp<98.0f){
			System.out.println("Tempreture is low");

		}else{
			System.out.println("Tempreture is normal");
		}
	}
}	
