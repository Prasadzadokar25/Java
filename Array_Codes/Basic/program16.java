// last imndex of 1 in string

class Array16 {

        static int lastOccurrence(String s){

                int lastOccur = -1;
               
                for(int i=s.length()-1; i>=0; i--){

			if(s.charAt(i)=='1'){
				lastOccur = i;
				break;
			}
                }
                return lastOccur;
        }
        public static void main(String args[]){

		String s = "00010";

		System.out.println("last occurrence of 1 is at "+lastOccurrence(s));
	}
}

