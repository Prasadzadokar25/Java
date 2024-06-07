import java.util.*;

class Demo{
	public static void main(String[] args){

		String str = "aabaa";

		ArrayList arr = new ArrayList();

		for(int i = 0;i<str.length(); i++){

			if(arr.contains(str.charAt(i))){
				System.out.println(str.charAt(i));
				break;
			}else{
				arr.add(str.charAt(i));
			}
		}

		//**************************
		
		boolean[] arr2 = new boolean[256];

		for(int i = 0;i<str.length(); i++){

                        if(arr2[str.charAt(i)]){
                                System.out.println(str.charAt(i));
                                break;
                        }else{
                                arr2[str.charAt(i)] = true;
                        }
                }
	}
}
