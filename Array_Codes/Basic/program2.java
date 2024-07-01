class Array2 {

	public static void main(String args[]){
	

                int arr[] = {9,8,3,1,2,6};

		for(int j=0;j<arr.length;j++){

			int temp = 0;

                	for(int i = 0;i<arr.length-1;i++){

                        	if(arr[i+1]<arr[i]){

                                	temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
                        }
                }
		System.out.println("minimun and maximun element of array are "+arr[0]+" and "+arr[arr.length-1]);

	}
}	
