/* print 1
 *       4 9 
 *       16 25 36
 *       46 64 81 100
 */

class Patten19{
        public static void main(String [] args){

                int row = 4;
                int col = 4;
		int num = 1;

                for(int i=1;i<=row;i++){
                        for(int j=1;j<=i;j++){
                                System.out.print(num*num +" ");
				num++;
                        }
                        System.out.println();
                }
        }
}
