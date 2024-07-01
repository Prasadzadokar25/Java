import java.io.*;

class Node{

	static int data;

	static Node left;
	static Node right;

	Node(int data){
		this.data = data;
	}
}

class Client{

	static Node root = null;

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Node root = null;

		int ch;

		do{
			System.out.println("1. add node");
			System.out.println("2. print");
			int choice = Integer.parseInt(br.readLine());

			

			switch(choice){
				case 1:
					System.out.println("Add node");
					int data = Integer.parseInt(br.readLine());
					root = addNode(root,data);
					break;

				case 2:
					printg(root);

			}

			System.out.println("continue?");
			ch = Integer.parseInt(br.readLine());
		}while(ch != 0);

	}


	static Node addNode(Node root, int data){

                Node newNode = new Node(data);
                if(root == null){

        		 root = newNode;
	 		return root;		 
			
                }
                if(data<root.data){
                        addNode(root.left,data);
                }else{
                         addNode(root.right,data);
                }

		return root;

	

        }

        static void printg(Node root){

                if(root == null){
                        return ;
                }
                printg(root.left);
                System.out.print(root.data);
                printg(root.right);

		System.out.println();
        }
	
}
