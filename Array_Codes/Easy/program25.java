// alterteting even and odd number


class Array25 {

     static int[] alternateEvenOdd(int[] arr) {

        int ECount = 0;
        int OCount = 0;
	int EIndex = 0;
	int OIndex = 0;

        for (int i=0;i<arr.length;i++) {

            if (arr[i]%2== 0)
                ECount++;
            else
                OCount++;
        }

        int[] ENumber = new int[ECount];
        int[] ONumber = new int[OCount];

        for (int i=0;i<arr.length;i++) {

            if (arr[i]%2 == 0) {

                ENumber[EIndex] = arr[i];
		EIndex++;

            } else {

                ONumber[OIndex] = arr[i];
		OIndex++;
            }
        }
	int arrIndex=0;

        for (int i = 0; i < ECount; i++) {

            arr[arrIndex++] = ONumber[i];
            arr[arrIndex++] = ENumber[i];

        }
	return arr;
	
    }

    public static void main(String[] args) {

        int arr[] = {1,2,4,3,6,8,1,3};
       
        int newArray[] = alternateEvenOdd(arr);

	for(int x:newArray){
                System.out.print(x+" ");
        }
        System.out.println();
    }
}

