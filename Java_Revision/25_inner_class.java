class OuterPrasad{
	
	class Inner{

		final static int x = 10;
	
		void m1(){
			System.out.println("in inner");
		}
	}

	void m3(){
		System.out.println("in outer");
		Inner obj = new Inner();
		obj.m1();
	}
	class Inner1{

                void m1(){
                        System.out.println("in inner");
                }
        }
}

class Client{
	public static void main(String[] args){

		OuterPrasad obj1 = new OuterPrasad();
		obj1.m3();

		OuterPrasad.Inner obj = obj1.new Inner();
		System.out.println(obj1.new Inner().x);
	}
}
