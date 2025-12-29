
// diffrent methods of writing code in lambda function

interface Employee3 {

        String lang();
}

class Client3 {

        public static void main(String args[]){

                Employee3 em = ()->{
		       
			return "marathi/hindi/english";
		};

                System.out.println(em.lang());
        }
}
