// alterteting positive and negattive number


class Array26 {

     static void alternatePositiveNegative(int[] arr) {

        int pCount = 0;
        int nCount = 0;
	int pIndex = 0;
	int nIndex = 0;

        for (int i=0;i<arr.length;i++) {

            if (arr[i] > 0)
                pCount++;
            else
                nCount++;
        }

        int[] pNumber = new int[pCount];
        int[] nNumber = new int[nCount];

        for (int i=0;i<arr.length;i++) {

            if (arr[i] > 0) {

                pNumber[pIndex] = arr[i];
		pIndex++;

            } else {

                nNumber[nIndex] = arr[i];
		nIndex++;
            }
        }
	int arrIndex=0;

        for (int i = 0; i < pCount; i++) {

            arr[arrIndex++] = pNumber[i];
            arr[arrIndex++] = nNumber[i];

        }
	for(int x:arr){
		System.out.print(x+" ");
	}
	System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {3,1,-4,-3,5,-6};
       
        alternatePositiveNegative(arr);
    }
}
