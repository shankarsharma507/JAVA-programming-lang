public class pattern {
     

    /* public static void main (String[] args) {
         
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         
         int i = 1;
 
         char ch = (char) ('A' + n - 1);
         
         while(i <= n){
             
             int j = 1;
             while(j <= i){
                 System.out.print(ch);
                 ch = (char) (ch + 1);
 
 
             }
 
             ch = (char) (ch - 1);
             System.out.println();
             i = i +1;
 
         }
     }
 }
 
 import java.util.Scanner;
 
 
 public class Solution {
     public static void main(String[] args) {
         //Your code goes here
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
 
         int i = 0;
         int ch =(char) ('A' + n - 1);
         
         while(i < n){
             
              char currentChar = (char) (ch - i);
             int j = 0;
             while(j <= i){
                 System.out.print(currentChar);
                 currentChar = (char) (currentChar + 1);
                 j++;
 
 
             }
 
             
             System.out.println();
             i = i +1;
 
         }
     }
 }
 
 
 
 */
 /* 
 import java.util.Scanner;
 public class pattern {
     
     public static void main(String[] args) {
         // Write your code here
        
    
 
 
         Scanner scanner = new Scanner(System.in);
        
         int N = scanner.nextInt();
 
         int row = 1;
 
         // Upper half of the pattern
         while (row <= N) {
             int count = 1;
 
             // Print stars
             while (count <= row) {
                 System.out.print("*");
                 count++;
             }
 
             count = 1;
 
             // Print numbers
             while (count <= row) {
                 System.out.print(count);
                 count++;
             }
 
             System.out.println();
             row++;
         }
 
         row = N - 1;
 
         // Lower half of the pattern
         while (row >= 1) {
             int count = 1;
 
             // Print stars
             while (count <= row) {
                 System.out.print("*");
                 count++;
             }
 
             count = 1;
 
             // Print numbers
             while (count <= row) {
                 System.out.print(count);
                 count++;
             }
 
             System.out.println();
             row--;
         }
     }
 }*/
 public static int sum(int a,int b)
 {
     System.out.print("int sum ");
     return a+b;
 }
 public static double sum(double a,double b)
 {
     System.out.print("float sum ");
     return a+b;
 }
 public static void main (String[] args) {
     System.out.print(sum(5,4));
     System.out.print(sum(5.0,4.0));
 }
 }
 
 
 
 

