class Array3 {

        public static void main(String args[]){


                int arr[] = {5,8,3,1,2,6};

		 int max = arr[0];

               

               for(int i = 0;i<arr.length;i++){

                                if(arr[i]>max){

                                        max = arr[i];
                                }
                        }
                
                System.out.println("maximum element is "+ max);

        }
}
