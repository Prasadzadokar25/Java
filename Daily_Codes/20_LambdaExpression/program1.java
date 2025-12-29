

/* 1. Lambda function sme effort of creatting class
 * 2. Lambda function work only on functinal interface
 */

/* code using Annonimas inner class
 
interface Employee {

	void lang();
}

class Client {

	public static void main(String args[]){

		Employee em = new Employee() {
   
			public void lang () {    // overidding lang method of Employee interface

				System.out.println("java/cpp/python");
			}
		};

		em.lang();
	}
}

*/

// code using lambda function

interface Employee1 {

	void lang();
}

class Client1 {

        public static void main(String args[]){

                Employee1 em = ()-> {

				System.out.println("java/cpp/pytghon");

		};

                em.lang();
        }
}
