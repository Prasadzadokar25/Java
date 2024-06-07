class Demo{
        public static void main(String[] args){

                int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

		for(int i = arr[0].length-1; i>=0; i--){

			int y = 0;
			int x = i;

			while(x>=0 && y <arr.length){

				System.out.print(arr[y][x]+" ");
				x--;
				y++;
			}
			System.out.println();
		}
		for(int i = 0; i<arr[0].length; i++){

                        int y = 0;
                        int x = i;

                        while(x>=0 && y <arr.length){

                                System.out.print(arr[y][x]+" ");
                                x--;
                                y++;
                        }
                        System.out.println();
                }
	}
}	       	
