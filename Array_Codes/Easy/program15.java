// union of two array


class Array15 {

    public static int[] getUnion(int[] arr1, int[] arr2) {
        
        int maxLength = arr1.length + arr2.length;

        int[] tempArray = new int[maxLength];

        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            
		int flag = 0;
            	for (int j = 0; j < count; j++) {

                	if (arr1[i] == tempArray[j]) {
                    		flag = 1;
                    		break;
                	}
            	}
            	if (flag==0) {

                	tempArray[count] = arr1[i];
                	count++;
            	}
        }
	for (int i = 0; i < arr2.length; i++) {

            int flag  = 0;
            for (int j = 0; j < count; j++) {

                if (arr2[i] == tempArray[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {

                tempArray[count] = arr2[i];
                count++;
            }
        }

        int unionArray[] = new int[count];

        for (int i = 0; i < count; i++) {
            unionArray[i] = tempArray[i];
        }

        return unionArray;
    }

    public static void main(String[] args) {
        int arr1[] = {2,1,3,4,6};
        int arr2[] = {5,4,7,2,3};

        int unionArray[] = getUnion(arr1, arr2);

        System.out.println("Union of the two arrays:");
        for (int num : unionArray) {
            System.out.print(num + " ");
        }
	System.out.println();
    }
}


