/* Electric bill problem 
 *
 * calculate the bill amount
 * codition : unit<=100 :price per unit is 1
 * 	      unit>100  :price per unit is 2
 */
 

class IfElseDemo8{
	public static void main(String[] arg){
		int unit = 103;
		int cost1,cost2;

		if(unit<100){
			cost1 = unit*1;
			System.out.println(cost1);
		}else{
			cost2 = 100*1+(unit-100)*2;
			System.out.println(cost2);
		}
	}
}
