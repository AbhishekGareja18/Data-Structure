public class StackDemo {
    int arr[];
    int top=-1;
    int size;

    StackDemo(){
        arr=new int[size];
        this.size=size;
    }
    void push(){
        if(top>=arr.length){
            System.out.println("Stack overflow");
        }
        else{
            top++;
        } 
    }
    int pop(){
        int temp=arr[top];
        if(top<=0){
            System.out.println("Stack is underflow");
        }
        else{
            top--;
           
        }
        return top+1;
    }
    int peep(int index){
        int temp=top;
        if(top<=0){
            System.out.println("Stack is underflow");
        }
        else{
            while(index==temp[])
        }


    }
    
    public static void main(String[] args) {
        System.out.println();
    }
}
