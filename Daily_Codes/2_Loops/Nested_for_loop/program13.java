/* print     *
 *          **
 *         ***
 *        ****
 */


class Patten13{
        public static void main(String [] args){
		
		int row = 4;
		int col = 4;
		int x = row;

                for(int i=1;i<=row;i++){
                        for(int j=1;j<=col;j++){
				
				if(j<x){
                                	System.out.print(" ");
                        	}else{
					System.out.print("*");
				}
			}
                        System.out.println();
			x--;
			
                }
        }
}
