/*  consept :  error( Dublicate case lable )
 *  	       same case value not allow in java
 */



class SwitchDemo2{
        public static void main(String args[]){

                int x = 4;

                switch(x){

                        case 1 : System.out.println(" one ");
                                 break;
                        case 4 : System.out.println(" Two ");
                                 break;
                        case 3 : System.out.println(" Three ");
                                 break;
                        case 4 : System.out.println(" Four ");        // error ( dublicate case lable )
                                 break;                        
			case 5 : System.out.println(" Five ");
                                 break;
			case 2+1 : System.out.println(" Three ");     // erro (dublicate case lable )
				   break;
			case 'A' : System.out.println(" letter A ");
				   break;
			case 65 : System.out.println (" number 65");  // erro ( dublicate case lable )
				  break;

                        default : System.out.println(" other ");
                                  break;
                }
                System.out.println(" After Switch ");
	}
}

