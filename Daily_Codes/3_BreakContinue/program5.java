/* Take a number and print its first 3 factoes
 */


class BCDemo5{
	public static void main(String [] args){

		int num = 150;
		int count = 0;

		for(int i=1;i<=num;i++){
			if(num%i==0){
				System.out.println(i);
					count++;
			}
			if(count==3){
				break;
			}
		}
	}
}
