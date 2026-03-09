// //Solid rectangle

// public class Third{
//     public static void main(String args []){
//         int num1 = 4;
//         int num2 = 5;
//         for(int i=1; i<=num1; i++){
//             for(int j=1; j<=num2; j++){
//                 System.out.print("* ");
//             }
//            System.out.println();

//         }
      
//     }
// }


//Hallo rectangle
// import java.util.*;
// public class Third{
//     public static void main(String args []){
        // Scanner sc = new Scanner(System.in);
//         int n = 4;
//         int m = 5;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=m; j++){
//             if(i==1 || j==1 || i==n || j==m){
//                 System.out.print("* ");
//             }else{
//                 System.out.print("  ");
//             }
            
//             }
//             System.out.println();
//         }
        

//     }
// }

//half pyramid

// public class Third{
//     public static void main(String args[]){
//         int num1=4;
//         for(int i=1; i<=num1; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");

//             }
//             System.out.println();
//         }
//     }
// }

//*********************** */

public class Third{
    public static void main(String args[]){
        int num1=4;
        for(int i=num1; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}