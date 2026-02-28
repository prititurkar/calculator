import java.util.*;

public class Second {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no.");
        int a = sc.nextInt();
        char  num = sc.next().charAt(0);
        int b = sc.nextInt();
        

        if(num == '+'){
            System.out.println(a+b);
        }
        else if(num == '-'){
              System.out.println(a-b);
        }
        else if(num == '*'){
            System.out.println(a*b);
        }
        else if(num == '/'){
            System.out.println(a/b);

        }
        else if(num == '%'){
            System.out.println(a%b);
        }
        else{
            System.out.println("invalid no.");
        }
        }      
              
         }
