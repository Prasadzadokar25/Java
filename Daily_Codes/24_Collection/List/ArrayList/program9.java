/* Sortting the user define data of list
 */

import java.util.*;

class Planet {

        String pname = null;
        double dfs = 0;       // dsf = distanse from sun

        Planet(String pname , double dfs) {

                this.pname = pname;
                this.dfs = dfs;

        }
        public String toString() {

                return "{" + pname + " : " + dfs+ "}";

        }

}

class SortByNameAsen implements Comparator {

        public int compare(Object obj1 ,Object obj2) {

                return ((Planet)obj1).pname.compareTo(((Planet)obj2).pname);

        }

}

class SortByNameDsen implements Comparator {

        public int compare(Object obj1 ,Object obj2) {

                return -((Planet)obj1).pname.compareTo(((Planet)obj2).pname);

        }

}

class SortBydfs implements Comparator {

        public int compare(Object obj1 ,Object obj2) {

                return (int)(((Planet)obj1).dfs - (((Planet)obj2).dfs));

        }

}

class ArrayListDemo9 {

        public static void main (String args[]) {

                ArrayList al = new ArrayList();

                al.add(new Planet("Earth",1500000));
                al.add(new Planet("Mars",1600000));
                al.add(new Planet("Jupitar",1800000));
                al.add(new Planet("Vens",90000));
                al.add(new Planet("Pluto",1900000));

                System.out.println(al);

                Collections.sort(al,new SortByNameAsen());
                System.out.println(al);

                Collections.sort(al,new SortByNameDsen());
                System.out.println(al);

		Collections.sort(al,new SortBydfs());
                System.out.println(al);
        }
}
