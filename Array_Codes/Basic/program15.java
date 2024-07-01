// sum of the disting elements

class Array15 {

        static int sumOfDistingElements(int arr[]){

                int sum = 0;
               
                for(int i=0; i<arr.length; i++){

                        int flag = 0;
                        for(int j=0; j<i; j++){

                                if(arr[i]==arr[j]){

                          		flag = 1;
					break;
                                }
                        }
			if(flag == 0){
				sum += arr[i];
			}
                }
                return sum;
        }

        public static void main(String args[]){

		int arr[] = {1,2,3,4,5,5,5};

		System.out.println("sum od distrint element = "+sumOfDistingElements(arr));
	}
}

