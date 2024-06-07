import java.io.*;

class ModelData implements Serializable{

	int id = 0;
	String name = "prasad";

	ModelData(int id, String name){

		this.id = id;
		this.name = name;
	}

	 
}

class Client{
	public static void main(String args[]) throws Exception{

		FileOutputStream f = new FileOutputStream("playersdata.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);

		o.writeObject(new ModelData(18,"virat"));

		f.close();
		o.close();

		FileInputStream fi = new FileInputStream("playersdata.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);

		ModelData obj = (ModelData)oi.readObject();
		System.out.println(obj.id);
	}
}


