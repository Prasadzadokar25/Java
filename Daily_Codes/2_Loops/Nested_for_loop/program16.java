/*print  * * * *
 *       * * *
 *       * *
 *       *
 *
 */

class Patten16{
        public static void main(String [] args){

                int row = 4;
                int col = 4;

                for(int i=1;i<=row;i++){
                        for(int j=col;j>=i;j--){
                                System.out.print("*");
                        }
                        System.out.println();
                }
        }
}
