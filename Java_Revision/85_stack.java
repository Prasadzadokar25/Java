import java.io.*;

class Stack{

	int[] stackarr ;
	int size;
	int top = -1;

	Stack(int size){
		this.size = size;
		this.stackarr = new int[size];
	}

	void push(int data){

		if(top == size-1){
			System.out.println("stak is full");
		}else{
			top++;
			stackarr[top] = data;
		}
	}

	void printStack(){

		if(top == -1){
			System.out.println("empty");
		}
		else{
			for(int i=0; i<=top; i++){
				System.out.print(stackarr[i]);
			}
			System.out.println();
		}
	}
	int pop(){

                if(top == -1){
                        System.out.println("empty");
			return -1;
                }
                else{
                        int ele = stacharr[top];
			top--;
			return ele;
                }
        }

}

class Client{
	public static void main(String[] args) throws IOException{

		Stack st = new Stack(10);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int con;
		do{
			System.out.println("1. push");
			System.out.println("2. print");

			int ch = Integer.parseInt(br.readLine());

			switch(ch){
				case 1:{

					       int data = Integer.parseInt(br.readLine());
					       st.push(data);
					       break;
				}
				case 2:{
                                               
                                               st.printStack();
                                               break;
                                }
			}
			System.out.println("continue?");
			con = Integer.parseInt(br.readLine());

		}while(con != 0);
	}
}



		


