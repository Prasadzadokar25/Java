// Method : compareTo


// code using pridifine mathod in java


/*
 * class MethodDemo4{
	public static void main(String [] args){

		String str1 = "prasad";
		String str2 = "am";
		String str3 = "prasant";
		String str4 = "prasad";

		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareTo(str4));
	}
}
*/


// code using userdifine method in java



import java.util.Scanner;

class MethodDemo4{

        static void myCompairTo(String str1,String str2){


                int result=0;
                char arr1[] = str1.toCharArray();
                char arr2[] = str2.toCharArray();

                if(arr1.length==arr2.length){
                        int c = 0;

                for(int i=0;i<arr1.length;i++){
                        int ch1=arr1[i];
                        int ch2=arr2[i];


                        if(ch1!=ch2){
                                result = ch1-ch2;
                                System.out.println(result);
                                break;
                        }else{
                                c++;
                        }
                }
                if(c==arr1.length){
                        System.out.println("0");

                        }
                }

                else{
                        System.out.println(arr1.length-arr2.length);
                }

                
         }

        public static void main(String [] args){

                Scanner sc= new Scanner(System.in);
                System.out.println("Enter string one");
                String s1 = sc.next();

                System.out.println("Enter String two");
                String s2 = sc.next();


                        myCompairTo(s1,s2);

        }
}
