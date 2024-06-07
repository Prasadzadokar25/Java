/*print *--*
 *      *--*
 *      *--*
 *      *--*
 */


	
class Patten11{
	public static void main(String [] Args){

		int row = 4;
		int col = 4;

		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){

				if(j==1 || j==row){
					System.out.print("*");
				}else{
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
}
