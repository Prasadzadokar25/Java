
// diffrent methods of writing code in lambda function

interface Employee4 {

        String lang();
}

class Client4 {

        public static void main(String args[]){

                Employee4 em = ()->  "marathi/hindi/english";

                System.out.println(em.lang());
        }
}
