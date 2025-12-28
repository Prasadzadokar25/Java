/* print 1
 *       1 2
 *       1 2 3
 *       1 2 3 4
 */


class Patten15{
        public static void main(String [] args){

                int row = 4;
                int col = 4;

                for(int i=1;i<=row;i++){
			
			int num = 1;
                        for(int j=1;j<=i;j++){
                                System.out.print(num+" ");
				num++;
                        }
                        System.out.println();
                }
        }
}
