/* Array */
/******************************************************* */
// import java.util.*;
// public class Array{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// int []arr = new int[size];

// for(int i=0; i<size; i++){
// arr[i]=sc.nextInt();
// }
// for(int i=0; i<arr.length; i++){
// System.out.println(arr[i]);
// }

// }
// }

/*********************************************** */

// import java.util.*;
// public class Array{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// int []num = new int[size];

// for(int i=0; i<size; i++){
// num[i]=sc.nextInt();
// }

// int x = sc.nextInt();
// for(int i=0; i<num.length; i++){
// if(num[i] == x){
// System.out.println(num[i]);
// }
// }
// }
// }

/**************** */

// import java.util.*;
// public class Array{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// String []name = new String[size];
// for(int i=0; i<size; i++){
// name[i] = sc.next();

// }

// for(int i=0; i<name.length; i++){
// System.out.println(name[i]);
// }

// }
// }

/******************************************* */

// import java.util.*;
// public class Array{
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);

//                 int size = sc.nextInt();
//                 int []num = new int[size];

//                 for(int i=0; i<size; i++){
//                         num[i] = sc.nextInt();

//                 }

//                 int max = Integer.MIN_VALUE;
//                 int min = Integer.MAX_VALUE;

//                 for(int i=0; i<num.length; i++){
//                         if(num[i]<min){
//                                min = num[i];
//                         }
//                         if(num[i]>max){
//                                 max=num[i];
//                         }
//                 }
//                 System.out.println("largest no. is "+ max);
//                  System.out.println("smallest no. is "+ min);

//         }
// }



/********************************* */

// import java.util.*;
// public class Array{
//         public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int []num = new int[size];

//         for(int i=0; i<size; i++){
//                 num[i]=sc.nextInt();
//         }
//         boolean isAscending = true;

//         for(int i=0; i<num.length-1; i++){
//                 if(num[i]>num[i+1]){
//                         isAscending= false;
//                 }
//         }
//         if(isAscending){
//                 System.out.println("The array is sorted in Ascending");
//         }else{
//                 System.out.println("the array is not sorted in Ascending");
//         }


//         }
// }

// public class Array{
//     public static void main(String args[]){
//         int num = 6;
        
        
//         for(int i=1; i<=num; i++){
//             for(int j=1; j<=i; j++){
//                 if(j == 1 || j == i){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }

//             }
//             for(int j=1; j<=2*(num-i+1); j++){
//                 System.out.print(" ");
//             }
            
//             for(int j=1; j<=i; j++){
//                 if(j==1 || j==i){
//                     System.out.print("*");

//                 }else{
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println();
//         }

//         for(int i=num; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 if(j == 1 || j == i){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }

//             }
//             for(int j=1; j<=2*(num-i+1); j++){
//                 System.out.print(" ");
//             }

//             for(int j=1; j<=i; j++){
//                 if(j == 1 || j == i){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//Sum of Array numbers

// import java.util.*;
// public class Array{
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int size = sc.nextInt();
//     int[] num = new int[size];

//     for(int i=0; i<size; i++){
//         num[i]=sc.nextInt();
//     }
//     int sum = 0;
//     for(int i=0; i<num.length; i++){
//         sum = sum+num[i];
//     }
//     System.out.println(sum);
// }
// }
//count even
//even or odd;
// import java.util.*;
// public class Array{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] num = new int[size];

//         for(int i=0; i<size; i++){
//             num[i]=sc.nextInt();
//         }
//         int count = 0;
//         for(int i=0; i<num.length; i++){
//             if(num[i]%2==0){
//                 count++;
                // System.out.println(num[i]+" "+"num is even");
            // }else{
                // System.out.println(num[i]+" "+"num is odd");
//             }
//         }
//         System.out.println(count);
//     }
// }


// largest no.

// import java.util.*;
// public class Array{
//     public static void main(String aargs[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] num = new int[size];
//         for(int i=0; i<size; i++){
//             num[i]=sc.nextInt();

//         }

//         int max = num[0];
//         for(int i=0; i<num.length; i++){
//             if(num[i]>max){
//                 max=num[i];

//             }
//         }
//         System.out.println(max);
//     }
// }


//Smallest no. 
// import java.util.*;
// public class Array{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] num = new int[size];
//         for(int i=0; i<size; i++){
//             num[i] = sc.nextInt();

//         }

//         int min = num[0];
//          for(int i=0; i<num.length; i++){
//             if(num[i]<min){
//                 min=num[i];
//             }
//          }
//          System.out.println(min);
//     }
// }

//reverse Array
import java.util.*;
public class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num = new int[size];
        for(int i=0; i<size; i++){
            num[i]=sc.nextInt();

        }

        for(int i=size-1; i>=0; i--){
            System.out.println(num[i]);

        }
    }
}
