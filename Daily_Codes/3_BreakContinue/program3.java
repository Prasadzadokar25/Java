/* write a program to print the all number from 1 to 50 exept the number which are 
 * divisible by both 3 and 5 or divisible by 4 */



class BCDemo3{
	public static void main(String[] arg){

		for(int i=1;i<=50;i++){
			if((i%3==0 && i%5==0) || (i%4==0)){
				continue;
			}
			System.out.println(i);
		}
	}
}
