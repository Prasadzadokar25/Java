// Method : lastIndexOf


// code using pridefine method in java


/*
class MethodDemo9{
        public static void main(String [] args){

                String str1 = "Prasadzadokar";
                char ch = 'a';
                int lastindex = 5;


                int x = str1.lastIndexOf(ch,fromindex);
                System.out.println("The last "+ch+" found at index "+ x +" when we search upto index "+lastindex);
        }
}
*/


//code using user difine method in java


import java.util.Scanner;
class MethodDemo9{

        static int strLastIndexOf(String str,char ch,int lastindex){
                
                char arr[] = str.toCharArray();
                for(int i=(lastindex-1) ; i>=0 ; i--){

                        if(ch==arr[i]){
                               int  x = i;
				System.out.println("The last "+ch+" found at index "+ x +" when we search upto index "+lastindex);
                                break;
                        }
			
                }
                return 0;
        }

        public static void main(String[]args){

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the string : ");
                String str1 = sc.next();

                System.out.print("Enter the chatter need to search : ");
                char ch1 = sc.next().charAt(0);

                System.out.print("Enter the index were search end : ");
                int lastindex1 = sc.nextInt();

                strLastIndexOf(str1,ch1,lastindex1);
                
        }
}
