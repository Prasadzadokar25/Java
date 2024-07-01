// countries at war


class Array41 {

	public static void main(String args[]){

		int countreA[] = {5,5,4};
		int countreB[] = {5,2,1};

		int AWin = 0;
		int BWin = 0;

		  for(int i=0; i<countreA.length; i++){

                        if(countreA[i]>countreB[i]){
				AWin++;
                        }
			else if(countreB[i]>countreA[i]){
				BWin++;
			}
                }
		if(AWin>BWin){
			System.out.println("A win the war");
		}
		else if(BWin>AWin){
			System.out.println("B win the war");
		}
		else{
			System.out.println("No one wins");
		}
	}
}
