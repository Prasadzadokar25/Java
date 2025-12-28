// Method :  eqauls


// code using pridifine mathod in java


/*
 * class MethodDemo4{
        public static void main(String [] args){

                String str1 = "prasad";
                String str2 = "am";
                String str3 = "prasant";
                String str4 = "prasad";

                System.out.println(str1.equals(str2));
                System.out.println(str1.equals(str3));
                System.out.println(str1.equals(str4));
        }
}
*/


// code using userdifine method in java



import java.util.Scanner;

class MethodDemo7{

        static String myEquals(String str1,String str2){


                String result=null;
                char arr1[] = str1.toCharArray();
                char arr2[] = str2.toCharArray();

                if(arr1.length==arr2.length){
                        
			int c = 0;
                	for(int i=0;i<arr1.length;i++){
                        	int ch1=arr1[i];
                        	int ch2=arr2[i];


                        	if(ch1!=ch2){
                               		result = "false";
                                	break;
                      	  	}else{
                                	c++;
                        	}
                	}
                	if(c==arr1.length){
                        	result = "true";

                        }
                }

                else{
                        result = "false";
                }

               return result;
                }

        public static void main(String [] args){

                Scanner sc= new Scanner(System.in);
                System.out.println("Enter string one");
                String s1 = sc.next();

                System.out.println("Enter String two");
                String s2 = sc.next();

                System.out.println(myEquals(s1,s2));

        }
}
