/* Problem Statement : Take three movies name there IMDB ratting and total box office collection
 * 			sort the data according to the movie name , IMDB ratting and total box collection
 */



import java.util.*;

class Movie {

        String name = null;
        float IMDB = 0;
	double boc = 0;

        Movie(String name , float IMDB , double boc ) {

                this.name = name;
                this.IMDB = IMDB;
		this.boc = boc;

        }
        public String toString() {

                return "{" + name + " : " + IMDB+ " : "+ boc+ "}";

        }

}

class SortByNameAsen implements Comparator <Movie> {

        public int compare(Movie obj1 ,Movie obj2) {

                return (obj1.name).compareTo(obj2.name);

        }

}

class SortByNameDsen implements Comparator<Movie> {

        public int compare(Movie obj1 ,Movie obj2) {

                return -((obj1.name).compareTo(obj2.name));

        }

}

class SortByboc implements Comparator<Movie> {

	public int compare(Movie obj1,Movie obj2) {

		return (int)(obj1.boc - obj2.boc);

	}

}

class SortByIMDB implements Comparator<Movie> {

	public int compare(Movie obj1,Movie obj2) {

		int flag = 0;

		if (obj1.IMDB - obj2.IMDB > 0)
			flag =  1;

		else if (obj1.IMDB - obj2.IMDB < 0)
			flag = -1;
	
		else 
			flag = 0;

		return flag;
		
	}

}

class ArrayListDemo8 {

        public static void main (String args[]) {

                ArrayList al = new ArrayList();

                al.add(new Movie("Gadar2",8.8f,1500000));
                al.add(new Movie("OMG2",8.4f,1600000));
                al.add(new Movie("Openhiamer",9.1f,1100000));
                al.add(new Movie("Jailer",8.0f,900000));
                al.add(new Movie("Barbi",8.1f,700000));

                System.out.println(al);

                Collections.sort(al,new SortByNameAsen());
                System.out.println(al);

                Collections.sort(al,new SortByNameDsen());
                System.out.println(al);

		Collections.sort(al,new SortByIMDB());
                System.out.println(al);

		Collections.sort(al,new SortByboc());
                System.out.println(al);
        }
}
