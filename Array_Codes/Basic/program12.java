// first and last occurence of element


class Array12 {

	static void firstLastOccurrences(int arr[],int element){

		int firstOccurrence = -1;
		int lastOccurrence  = -1;

		for(int i=0; i<arr.length; i++){

			if(arr[i]==element){

				firstOccurrence = i;
				break;
			}
		}
		for(int i=arr.length-1; i>=0; i--){

                        if(arr[i]==element){

                                lastOccurrence = i;
                                break;
                        }
                }
	
		if(firstOccurrence == -1){

			System.out.println(-1);
			return;
		}

		System.out.println("first and last Occurencesare "+firstOccurrence+" and "+lastOccurrence);
	}


	public static void main(String args[]){

		int arr[] = {2,4,3,7,8,4,4,1};
		int element = 4;

		firstLastOccurrences(arr,element);
	}
}
