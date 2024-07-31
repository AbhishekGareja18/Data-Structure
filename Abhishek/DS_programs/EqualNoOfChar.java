import java.util.Scanner;



class Equal{

    char [] array ;

    private  int top = -1;

    int size = 0; 



    

    Equal(int size){

        array = new char[size];

        this.size = size;

    }

//================================= geter method ===========================================

        int getTop(){

            return  top;

        }

//================================= Push method ===========================================

    void push(char x){

        if(top >= size-1){

            System.out.println("Stack overflow");

        }

        else{

            top++;

            array[top] = x;

        }

    }



//================================= Pop method ===========================================

    char pop(){

   


        if(top==-1){

         
            System.out.println("Stack Underflow");

            return 'l';

        }

        else{

            top--;

            return array[top+1]; 

          

        }

    }

}



public class EqualNoOfChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.print("Enter the String which contains '{}','()','[]' : ");

        String st = sc.nextLine();



        Equal singEqual = new Equal(st.length());

        



        for(int i=0 ; i<st.length() ; i++){



            if(st.charAt(i)=='a'){

                singEqual.push('a');

            }

            else{

                if(singEqual.top==-1){

                    System.out.println("invalid");

                    return;

                }

                else{

                    singEqual.pop();

                }

            }

        }

        


        if(singEqual.getTop()==-1){

            

            System.out.println("given string is valid");

        }

        else{

            System.out.println("given string is invalid");

        }

    }

}