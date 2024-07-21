
class MyStack {
    int[] arr;
    int maxSize;
    int top = -1;

    MyStack(int maxsize) {
        this.maxSize = maxsize;
        this.arr = new int[maxsize];
    }

    void push(int data) {
        if (top == maxSize - 1) {
            System.out.println("stack full");
            return;
        }
        top++;
        arr[top] = data;
    }

    void printStack() {

        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    int pop() {
        if (top == -1) {
            System.out.print(" stack is empty");
            return -1;
        }
        int val = arr[top];
        top--;
        return val;
    }
}

class p9 {
    public static void main(String[] args) {

        MyStack st = new MyStack(10);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.printStack();
        st.pop();
        st.printStack();
    }
}
