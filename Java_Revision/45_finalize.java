import java.util.*;

class ModelDatat{

	String name = null;

	ModelDatat(String name){
		this.name = name;
	}

	public void finalize(){
		System.out.println("object deleted");
	}
	public String toString(){
		return name;
	}
	
}
class Client {

	public static void main(String args[]){

		HashMap whm = new HashMap();

		ModelDatat obj1 = new ModelDatat("prasad");
	       ModelDatat obj2 = new ModelDatat("om");
		
	       whm.put(obj1,"10");
	       whm.put(obj2,"20");

	       System.out.println(obj1);
	       //obj1 = null;
	       System.out.println("in main");
	       obj2 = null;
	       System.gc();
	       System.out.println(whm);

	       System.out.println(whm.keySet());
	}
}	
