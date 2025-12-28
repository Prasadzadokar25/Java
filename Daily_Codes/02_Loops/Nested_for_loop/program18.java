/* print   A B C D
 *         A B C
 *         A B
 *         A 
 *
 */


class Patten18{
        public static void main(String [] args){

                int row = 4;
                int col = 4;

                for(int i=1;i<=row;i++){

			char ch = 'A';

                        for(int j=col;j>=i;j--){
                                System.out.print(ch+" ");
				ch++;
                        }
                        System.out.println();
                }
        }
}
