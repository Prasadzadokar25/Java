
// Parameter to lambda function

interface Employee5 {

		String lang(int num);
}

class Client5 {

        public static void main(String args[]){

                Employee4 em = (i)->  "marathi/hindi/english  " + i; // Employee4 em = (int i)->  here we can be mention data type of oarameter

                System.out.println(em.lang(12));
        }
}
