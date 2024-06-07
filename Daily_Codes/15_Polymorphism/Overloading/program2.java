/* Concept = if we pass parameter to method it search for equal match if match 
 * not found then it search for bigger parameter
 */
 


class OverloadingDemo2 {

        void fun (float x) {

                System.out.println("Fun with float ");
        }
        
        public static void main(String args [] ) {

                OverloadingDemo2 obj1 = new OverloadingDemo2();
                
                obj1.fun(1);    /* we pass int but method with int parameter
				  is not fond hence it call method with float */
                obj1.fun(10.1f);
        }
}
