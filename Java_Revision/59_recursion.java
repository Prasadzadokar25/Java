class Demo{

        static void printNums(int num){

                
                if(num == 0){
                        return;
                }
                System.out.println(num);
		printNums(--num);
        }
	 static void printNums2(int num){


                if(num == 0){
                        return;
                }
		printNums2(num-1);
                System.out.println(num);
               
        }
        public static void main(String args[]){

                int x = 10;
                printNums2(x);
        }
}
