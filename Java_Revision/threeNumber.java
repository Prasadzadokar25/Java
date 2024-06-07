class Demo{
	public static void main(String[] args){

		int a = 10;
		int b = 30;
		int c = 30;

		if((a>b && a>=c) || (a>c && a>=b) ){
			System.out.println(a);
		}else if((b>a && b>=c)||(b>c && b>=a)){
			System.out.println(b);
		}else if((c>b && c>=a) || (c>a && c>=b)){
			System.out.print(c);
		}
		else{
			System.out.println("equal");
		}

		Temp obj= new Temp();
		
	}
}

class Temp {

	int x = 10;
}
