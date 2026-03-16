// //Solid rectangle

// public class Third{
// public static void main(String args []){
// int num1 = 4;
// int num2 = 5;
// for(int i=1; i<=num1; i++){
// for(int j=1; j<=num2; j++){
// System.out.print("* ");
// }
// System.out.println();

// }

// }
// }

// Hallo rectangle****************************************************
// import java.util.*;
// public class Third{
// public static void main(String args []){
// Scanner sc = new Scanner(System.in);
// int n = 4;
// int m = 5;
// for(int i=1; i<=n; i++){
// for(int j=1; j<=m; j++){
// if(i==1 || j==1 || i==n || j==m){
// System.out.print("* ");
// }else{
// System.out.print(" ");
// }

// }
// System.out.println();
// }

// }
// }

// half pyramid**********************************************

// public class Third{
// public static void main(String args[]){
// int num1=4;
// for(int i=1; i<=num1; i++){
// for(int j=1; j<=i; j++){
// System.out.print("* ");

// }
// System.out.println();
// }
// }
// }

// *********************** */

// public class Third{
// public static void main(String args[]){
// int num1=4;
// for(int i=num1; i>=1; i--){
// for(int j=1; j<=i; j++){
// System.out.print("* ");

// }
// System.out.println();
// }
// }
// }

// ******************************************** */

// public class Third{
// public static void main(String args[]){
// int n = 4;
// for(int i=1; i<=n; i++){
// for(int j=1; j<=n-i; j++){
// System.out.print(" ");
// }
// for(int j=1; j<=i; j++){
// System.out.print("*");//no space
// }
// System.out.println();
// }
// }
// }

/********************************************* */
// public class Third{
// public static void main(String args[]){
// int n = 5;
// for(int i=1; i<=n; i++){
// for(int j=1; j<=i; j++){
// System.out.print(j+" ");
// }
// System.out.println();
// }
// }
// }

// ********************************************* */

// public class Third{
// public static void main(String args[]){
// int n = 5;
// for(int i=n; i>=1; i--){
// for(int j=1; j<=i; j++){
// System.out.print(j+" ");
// }
// System.out.println();
// }
// }
// }

/******************************************************** */

// public class Third{
// public static void main(String args[]){
// int n = 5;
// int num=1;
// for(int i=1; i<=n; i++){
// for(int j=1; j<=i; j++){
// System.out.print(num+" ");
// num++;

// }
// System.out.println();
// }
// }
// }

/********************************************************* */
// public class Third{
// public static void main(String args[]){
// int n=4;
// for(int i=1; i<=n; i++){
// for(int j=1; j<=n-i; j++){
// System.out.print(" ");
// }
// for(int j=1; j<=2*i-1; j++){
// System.out.print("*");
// }
// System.out.println();
// }

// for(int i=n; i>=1; i--){
// for(int j=1; j<=n-i; j++){
// System.out.print(" ");
// }
// for(int j=1; j<=2*i-1; j++){
// System.out.print("*");
// }
// System.out.println();
// }

// }
// }

/************************************************************** */
// public class Third{
// public static void main(String args[]){

// int n=5;

// for(int i=1; i<=n; i++){
// for(int j=1; j<=i; j++){
// if(j==1 || j==i){
// System.out.print("*");
// }else{
// System.out.print(" ");
// }
// }

// for(int j=1; j<=2*(n-i); j++){
// System.out.print(" ");
// }
// for(int j=1; j<=i; j++){
// if(j==1 || j==i){
// System.out.print("*");

// }else{
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// for(int i=n; i>=1; i--){
// for (int j=1; j<=i; j++){
// if(j==1 || j==i){
// System.out.print("*");
// }else{
// System.out.print(" ");

// }

// }
// for(int j=1; j<=2*(n-i); j++){
// System.out.print(" ");
// }
// for(int j=1; j<=i; j++){
// if(j==1 || j==i){
// System.out.print("*");
// }else{
// System.out.print(" ");
// }
// }
// System.out.println();
// }

// }
// }

/********************************************************** */

// public class Third{
// public static void main(String args[]){
// int n = 5;
// for(int i=1; i<=n; i++){
// for(int j=1; j<=n-i; j++){
// System.out.print(" ");
// }
// int num = 1;
// for(int j=1; j<=i; j++){
// System.out.print(num+" ");
// num=num*(i-j)/j;

// }
// System.out.println();
// }
// }
// }

/*********************************************************** */

// public class Third{
// public static void main(String args[]){
// int n = 5;
// for(int i=1; i<=n; i++){
// for(int j=1; j<=n-i; j++){
// System.out.print(" ");
// }
// for(int j=1; j<=i; j++){
// System.out.print(j+" ");
// }
// System.out.println();
// }
// }
// }

/******************************************************* */
// import java.util.*;
// public class Third{
// public static int addNum(int a, int b){
// int sum = a+b;
// return sum;
// }
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int sum = addNum(a,b);
// System.out.println(sum);

// }
// }

/*********************************************** */
// import java.util.*;
// public class Third{
// public static int multiNum(int a, int b){
// // int multi = a*b;
// // return multi;
// return a*b;
// }
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();

// // int multi = multiNum(a,b);
// // System.out.println(multi);
// System.out.println(multiNum(a,b));

// }
// }

/***************************************** */
// import java.util.*;
// public class Third{
// public static void fact(int num){
// int fact= 1;
// for(int i=1; i<=num; i++ ){
// fact=fact*i;
// }
// System.out.println(fact);
// return;
// }
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int num= sc.nextInt();
// fact(num);
// }
// }

/****************************************************** 88 */
// import java.util.*;
// public class Third{
// public static void isPrime(int num){
// int count=0;
// for(int i=1; i<=num; i++){
// if(num%i==0){
// count++;
// }
// }
// if (count == 2){
// System.out.println("no. is prime");
// }else{
// System.out.println("no. is not prime");
// }

// }

// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// isPrime(num);
// }

// }

// import java.util.*;
// public class Third{
// public static void oddEven(int num){
// if(num%2==0){
// System.out.println("no. is even");
// }else{
// System.out.println("no. is odd");
// }
// }

// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// oddEven(num);
// }
// }

/***************************************** */

// import java.util.*;
// public class Third{
// public static void table(int num){
// for(int i=1; i<=10; i++){
// System.out.println(num+"x"+i+"="+(num*i));
// }
// }
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// table(num);
// }
// }

/******************************************************/

// public class Third{
// public static void printNum(int num){
// if(num==0){
// return;
// }
// System.out.println(num);
// printNum(num-1);
// }
// public static void main(String args[]){
// printNum(100);

// }

// }
/*********************************************************************** */

// import java.util.*;
// public class Third{
// public static double avg(int a, int b, int c){
// double num = (a+b+c)/3.0;
// return num;
// }

// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();

// double result = avg(a,b,c);
// System.out.println(result);
// }
// }

/****************************************************** */

// import java.util.*;
// public class Third{
// public static void oddSum(int num){
// int n = 0;

// for(int i=1; i<=num; i++){
// if(i%2==1){
// n = n+i;
// }

// }

// System.out.println(n);
// }

// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// oddSum(num);
// }
// }

/******************************************* */

// import java.util.*;
// public class Third{
// public static void greatNum(int num1, int num2){
// if (num1 >= num2){
// System.out.println("num1 is greater");
// }else{
// System.out.println("num2 is greater");
// }
// }

// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int num1 = sc.nextInt();
// int num2 = sc.nextInt();

// greatNum(num1, num2);
// }
// }

/**************************************** */

// import java.util.*;
// public class Third {
// public static double radius(double num){
// double x= 2*3.14*num;
// return x;
// }

// public static void main(String args[]){

// Scanner sc= new Scanner(System.in);
// double num = sc.nextDouble();

// double result = radius(num);
// System.out.println(result);

// }

// }

/***************************************************** */

// import java.util.*;
// public class Third{
// public static void oddSum(int num){
// int sum=0;
// for(int i=1; i<=num; i++){
// if(i%2==1){
// sum=sum+i;
// }

// }
// System.out.println(sum);

// }
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// oddSum(num);
// }
// }

/******************************************* */

// import java.util.*;
// public class Third{
// public static int greatNum(int a, int b ){
// if(a>b){
// return a;
// }else{
// return b;
// }

// }
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();

// int result = greatNum(a,b);
// System.out.println(result);

// }
// }

/****************************************** */

// import java.util.*;
// public class Third{
// public static boolean age(int n){
// if(n>18){
// return true;
// }else{
// return false;
// }
// }
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// boolean result = age(n);
// if(result){
// System.out.println(result+" "+ "eligible to vote");
// }else{
// System.out.println(result+" "+"not eligible to vote");
// }
// }
// }

/******************************************** */
// import java.util.*;
// public class Third{
// public static int divisor(int a, int b){
// int gcd = 1;
// for(int i=1; i<=a && i<=b; i++){
// if(a%i==0 && b%i==0){
// gcd=i;
// }

// }
// return gcd;
// }
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);

// int a = sc.nextInt();
// int b = sc.nextInt();

// int result = divisor(a,b);
// System.out.println(result);
// }
// }

/****************************************** */

// import java.util.*;
// public class Third{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// int a = 0;
// int b = 1;

// for(int i=1; i<=n; i++){
// System.out.println(a);
// int next = a+b;
// a=b;
// b=next;
// }
// }
// }

/*********************************************** */

// import java.util.*;
// public class Third{
// public static int power(int x, int n){
// int a = 1;
// for(int i=1; i<=n; i++){
// a = a*x;
// }
// return a;
// }
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();
// int n = sc.nextInt();
// int result = power(x,n);
// System.out.println(result);
// }
// }

/* Array */
/******************************************************* */
// import java.util.*;
// public class Third{
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
// public class Third{
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
// public class Third{
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
// public class Third{
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

import java.util.*;
public class Third{
        public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int []num = new int[size];

        for(int i=0; i<size; i++){
                num[i]=sc.nextInt();
        }
        boolean isAscending = true;

        for(int i=0; i<num.length-1; i++){
                if(num[i]>num[i+1]){
                        isAscending= false;
                }
        }
        if(isAscending){
                System.out.println("The array is sorted in Ascending");
        }else{
                System.out.println("the array is not sorted in Ascending");
        }


        }
}