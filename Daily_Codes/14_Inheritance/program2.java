/* concept = all function in parent class is acesseble to child class
 */

class India {

	double IndGDP = 350;

	void indSports() {

		System.out.println("Cricket");
	}
}
class Maha extends India {

	double MahaGDP = 50;

	void mahaSports() {
		System.out.println("Kabaddi");
	}

	public static void main(String args [] ){

		Maha obj = new Maha();

		obj.mahaSports();
		obj.indSports();

		System.out.println(obj.IndGDP);
		System.out.println(obj.MahaGDP);
	}
}
