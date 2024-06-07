/* print A 1 B 2
 *       C 3 D 4
 *       E 5 F 6
 */


class Patten10{
        public static void main(String [] args){

 		char ch = 'A';
                int num = 1;

                for(int i=1;i<=3;i++){

                        for (int j=1;j<=4;j++){

                                if(j%2!=0){
                                        System.out.print(ch + " ");
                                        ch++;
                                }else{
                                        System.out.print(num+" ");
					num++;
                                }
                        }
                        System.out.println();

                }
        }
}
