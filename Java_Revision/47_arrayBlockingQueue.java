import java.util.concurrent.*;

class Client{
	public static void main(String args[]){

		BlockingQueue q = new ArrayBlockingQueue(3);

		q.add(10);
		q.offer(12);
		System.out.println(q);
		try{
		q.put(20);
		q.put(20);
		}catch(Exception e){
			System.out.println("catch");
		}
		finally{
			System.out.println("finaly");
		}
		 System.out.println(q);
	}
}
