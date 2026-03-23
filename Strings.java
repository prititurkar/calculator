
//concatenation
// public class Strings {

//     public static void main(String args[]){
//         String firstName = "priti";
//         String lastName = "turkar";
//         String fullName = firstName+ " "+lastName;
//         System.out.println(fullName);
//     }
    
// }

//length();

// public class Strings{
//     public static void main(String args[]){
//         String name = "My name is priti";
//         System.out.println(name.length());
//     }
// }

//charAt

// public class Strings{
//     public static void main(String args[]){
//     String name = "my name is priti";
//     for(int i=0; i<name.length(); i++){
//         System.out.println(name.charAt(i));
//     }
    
// }
// }

//compareTo();

// public class Strings {
//     public static void main(String args[]) {
//         String a1 = "priti";
//         String a2 = "priti";

//         int result = a1.compareTo(a2);

//         if (result == 0) {
//             System.out.println("Strings are equal");
//         } else if (result < 0) {
            
//             System.out.println("a2 is  greater than a1");
//         } else {
//             System.out.println("a1 is  greater than a2");
//         }
//     }
// }

//subString
// public class Strings{
//     public static void main(String args[]){
//         String name = "hello from apna college";
//         String result = name.substring(6,10);
//         System.out.println(result);
//     }
// }


// parseInt();
// public class Strings{
//     public static void main(String args[]){
//         String str = "123";
//         int num = Integer.parseInt(str);
//         System.out.println(num);

//     }
// }

// public class Strings{
//     public static void main(String args[]){
//         int num = 123;
//        String str = Integer.toString(num);
//         System.out.println(num);

//     }
// }

// Homework problem

// import java.util.*;
// public class Strings{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         String[] name = new String[size];

//         int tolength =0;
//         for(int i=0; i<size; i++){
//             name[i] = sc.next();
//             tolength+=name[i].length();
//         }

//     System.out.println(tolength);

//     }
// }

// import java.util.*;
// public class Strings{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String str = sc .next();
//         String result = "";
//         for(int i=0; i<str.length(); i++){
//             if(str.charAt(i)=='e'){
//                 result = result+'i';

//             }else{
//                 result = result + str.charAt(i);
//             }
//         }
//         System.out.println(result);

//     }
// }

// import java.util.*;
// public class Strings{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//       String name = sc.next();
//       String username = "";
//       for(int i=0; i<name.length(); i++){
//         if(name.charAt(i)=='@'){
//             break;
//         }else{
//             username+=name.charAt(i);
//         }
//       }
//       System.out.println(username);
    
//     }
// }


//String builder...
//print name

// import java.util.*;
// public class Strings{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("Priti");
//         System.out.println(sb);

//     }
// }

//charAt
// import java.util.*;
// public class Strings{
//  public static void main(String args[]){
//     StringBuilder sb = new StringBuilder("priti");
//     System.out.println(sb.charAt(3));
//  }
// }

//set charAt()..

// import java.util.*;
// public class Strings{
// public static void main(String args[]){
//     StringBuilder sb = new StringBuilder("priti turkar");
//     sb.setCharAt(0, 'k');
//     System.out.println(sb);

// }
// }


//insert 

// import java.util.*;
// public class Strings{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("priti");
//         sb.insert(0, 's');
//         System.out.println(sb);
//     }
// }


//delete string

// import java.util.*;
// public class Strings{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("priti");
//         sb.delete(3, 04);
//         System.out.println(sb);

//     }
// }

//append()

// import java.util.*;
// public class Strings{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("h");
//         sb.append("e");
//         sb.append("l");
//         sb.append("l");
//         sb.append("o");
//         System.out.println(sb);
//     }
// }

//length();

// import java.util.*;
// public class Strings{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("priti");
//         System.out.println(sb.length());
//     }
// }

//revers string

// import java.util.*;
// public class Strings{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("priti");
//         for(int i=0; i<sb.length()/2; i++){
//             int front = i;
//             int back = sb.length()-1-i;
//             char frontchar =sb.charAt(front);
//             char backchar = sb.charAt(back);
//             sb.setCharAt(front, backchar);
//             sb.setCharAt(back,frontchar);
//         }
//         System.out.println(sb);

//     }
// }
