
import java.util.*;

// Java program to find factorial of given number
public class JavaFactorial
{
// method to find factorial of given number
public static int factorial(int n)
{
if (n == 0){
return 1;
}
else{
    return n*factorial(n-1);
}
}




// Driver method
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();


System.out.println("Factorial of "+ num + " is " + factorial(num));
}
}

