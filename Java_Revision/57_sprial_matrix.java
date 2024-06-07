class Demo{
        public static void main(String[] args){

                int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		int x = 0;
		int y = 0;

		int n = arr.length;
		
		
		while(n>0){

		for(int i = 0; i<n-1; i++){
			System.out.print(arr[x][y]+" ");
			y++;
		}
		for(int i = 0; i<n-1; i++){
                        System.out.print(arr[x][y]+ " ");
                        x++;                                                                                                                                                }
		for(int i = 0; i<n-1; i++){
                        System.out.print(arr[x][y]+ " ");
                        y--;                                                                                                                                                }
		for(int i = 0; i<n-1; i++){
                        System.out.print(arr[x][y]+ " ");
                        x--;        
		}
		n = n-2;
		x++;
		y++;
		}
		if(n==1){
			system.out.print(arr[x][y]+ " ");
		}

		System.out.println();
	}
}
		
