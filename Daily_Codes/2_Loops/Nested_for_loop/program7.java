/* Print A A A
 *       B B B
 *       C C C
 */


class Patten7{
	public static void main(String[] args){

		char ch = 'A';
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print(ch + " ");
			}
			ch++;
			System.out.println();

		}
	}
}
