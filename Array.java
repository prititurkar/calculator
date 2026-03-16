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