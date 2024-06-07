 class Outer {

	interface InnerInterface{
		void innerMethod();
	}
     InnerInterface outerMethod() {
         int localVar = 10; // Local variable
        
        // Method-local inner class defined within outerMethod()
        class Inner implements InnerInterface{
	
		final static int x = 20;
            public void innerMethod() {
                System.out.println("Local variable inside inner class: " + x);
            }
        }
        
        // Create an instance of the inner class
        Inner innerObject = new Inner();
        
        // Call a method of the inner class
        return innerObject;
    }
    
    public static void main(String[] args) {
        Outer outerObject = new Outer();
        InnerInterface obj = outerObject.outerMethod();

	obj.innerMethod();
    }
}

