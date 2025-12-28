/*Take a number and print multiple of 4 till that number
 */

class WhileDemo4{
	public static void main(String [] args){
		
		int num = 22;
		int i = 4;
		while(i<num){
			if(i%4==0){
				System.out.println(i);
			}
		i++;
		}
		
	}
}
	
	
/*class WhileDemo4{
	public static void main(String[] arg){
		
		int num = 22;
		int i = 4;
		while(i<num){
			System.out.println(i);
			i=i+4;          // num+=4
		}
	}
}
*/
