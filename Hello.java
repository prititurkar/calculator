import java.util.*;
public class Hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 >= num2){
            System.out.println("number one is greater than no. two");
        }else{
            System.out.println("number two is greater than no. one");
        }
        System.out.println("hello from apan college");
    }
}