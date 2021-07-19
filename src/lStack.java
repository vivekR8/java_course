public class lStack {
    static Integer maxSize=100;
    static Integer[] arr= new Integer[maxSize];
    int top=-1;

    void push(Integer data){
        if(top+1==maxSize){
            System.out.println("Memory Full");
        }
        else{
            arr[++top]=data;
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("No data in the stack");
        }
        else{
            System.out.println("removing "+ arr[top--]);
        }
    }
    Integer size(){
        return top+1;
    }
    Integer peek(){
        if(top==-1){
            System.out.println("No Elements to peek");
            return top;
        }
        return arr[top];
    }
    public static void main(String[] args) {
        lStack stack= new lStack();
        System.out.println(stack.peek());
        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.size();
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();

    }
}
