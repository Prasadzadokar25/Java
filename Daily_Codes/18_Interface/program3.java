// Multiple inheritance in java

interface InterfaceDemo1 {

        void gun();
        
}
interface InterfaceDemo2 {

       void gun();
}
class Child implements InterfaceDemo1,InterfaceDemo2 {

        public void gun(){

                System.out.println("in client gun");
        }
}
class Client {

        public static void main(String args[]){

                InterfaceDemo1 obj =  new Child();

                obj.gun();

        }
}
