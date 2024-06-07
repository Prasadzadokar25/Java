// Singleton design patten


class SingletonDesignPatten {

	static SingletonDesignPatten obj = new SingletonDesignPatten();

	private SingletonDesignPatten() {

		System.out.println("In constructer ");
	}

	static SingletonDesignPatten getObject() {

		return obj;
	}
}

class Client {

	public static void main(String args[]){

		SingletonDesignPatten obj1 = SingletonDesignPatten.getObject();

		System.out.println(obj1);

                SingletonDesignPatten obj2 = SingletonDesignPatten.getObject();

                System.out.println(obj2);
	}
}
