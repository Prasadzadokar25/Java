import java.io.*;

class Node{
	Node next = null;
	int data;

	Node(int data){
		this.data = data;
	}
}
class LinkedList{

	Node head = null;

	void printLinkedList(){

		Node temp = head;

		if(head == null){

			System.out.println("empty linked list");
			return;

		}
		while(temp.next!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.print(temp.data);
		System.out.println();
	}
	void addFirst(int data){

		Node newNode = new Node(data);

		if(head == null){

			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}

			
	}
	void addLast(int data){

		Node newNode = new Node(data);
		
		Node temp = head;

		if(head == null){
			head = newNode;
			return;
		}
		while(temp.next!=null){
			temp = temp.next;
		}

		temp.next = newNode;
	}

	int nodeCount(){

		int count = 0;

		Node temp = head;

		while(temp != null){
			count ++;
			temp = temp.next;
		}

		return count;
	}

	void insertAt(int data, int pos){

		Node newNode = new Node(data);

		if(pos == 1){
			addFirst(data);
			return;
		}

		Node temp = head;

		while(pos - 2!=0){
			pos--;
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	void reverse(){

		Node priv = null;
		Node current = head;
		Node forward = null;

		while(current != null){

			forward = current.next;
			current.next = priv;
			priv = current;
			current = forward;
		}
		head = priv;
	}
}
class Client{
	public static void main(String[] args) throws IOException{

		LinkedList ll = new LinkedList();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int choice;
		int cont;

		do{
			 System.out.println("1. print");
			 System.out.println("2. addFirst");
			 System.out.println("3. addLast");
			 System.out.println("4. nodeCount");
			 System.out.println("5. insertAtPosion");
			 System.out.println("6. reverse");

			choice = Integer.parseInt(br.readLine());

			switch(choice){
				case 1:{
					       ll.printLinkedList();
					       break;
				}
				 case 2:{
						int data = Integer.parseInt(br.readLine());
                                               ll.addFirst(data);
                                               break;
                                }
				 case 3:{
                                                int data = Integer.parseInt(br.readLine());
                                               ll.addLast(data);
                                               break;
                                }
				case 4:{
                                                
                                               System.out.println(ll.nodeCount());
                                               break;
                                }

				 case 5:{

                                               int data = Integer.parseInt(br.readLine());
					       int position = Integer.parseInt(br.readLine());
					       ll.insertAt(data,position);
                                               break;
                                }
				 case 6:{
                                               ll.reverse();
                                               break;
                                }
			
			}
			System.out.println("wnat to continue");
			 cont = Integer.parseInt(br.readLine());
		}while(cont == 1);
	}
}
			


	


