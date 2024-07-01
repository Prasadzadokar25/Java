// maximum odd sum

class Array10 {

    public static void main(String[] args) {

    	int[] arr = {2,5,-3,3,2,-1,-1};
        int maxOddSum = -1; 
	int minOddNegative = -100;
	int flag = 0;

	for(int i = 0; i<arr.length;i++){

		if(arr[i] <0 && arr[i]>=minOddNegative ){

			minOddNegative = arr[i];
			flag = 1;
		}
	}
	
        for (int i = 0; i < arr.length; i++) {

            int sum = 0;
	    int count = 0;
               
            for (int j = i; j < arr.length; j++) {

		if( arr[j] > 0){

               		 sum += arr[j];
		}

                if (sum % 2 == 1 && sum > maxOddSum) {

                    maxOddSum = sum;
                }
		
		if( flag == 1 && (sum+minOddNegative) > maxOddSum && (sum+minOddNegative)%2!=0){

			maxOddSum = sum + minOddNegative;
		}
            }
        }
	 if (maxOddSum == -1) {
            System.out.println("-1");
        } else {
            System.out.println("Maximum odd sum: " + maxOddSum);
        }
       
    }
}

