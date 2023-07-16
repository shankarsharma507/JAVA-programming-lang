import java.util.Scanner;
public class myprogram{
    

    
    
    
        public static void main (String[] args) {
                Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
        

        while(i <= n){
            int j = 1;
            int p = i;
            while(j <= i){
                System.out.print(p);
                j = j + 1;
                p = p + 1;
                

            }
            System.out.println();
            i = i + 1;

        }
}
}
        
 
                
                       /* Scanner s=new Scanner (System.in);
                        int n=s.nextInt();
                        boolean isprime=true;
                        if(n%2==0)
                            isprime=false;
                        int i=3;
                        while(isprime&&i<n)
                        {
                            isprime=!(n%i==0);
                            i+=2;
                        }
                        if(isprime)
                        {
                            System.out.println("Prime");
                        }
                        else
                        {
                            System.out.println("Composite");
                        }
                    
                    }
                }
 */ 

            
            /* Your class should be named Solution.
             * Read input as specified in the question.
             * Print output as specified in the question.
            */
            /*  Scanner sc = new Scanner(System.in);
         
            char ch = sc.next().charAt(0);
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
    
            int totalMarks = m1 + m2 + m3;
    
    int averageMarks = totalMarks / 3;
    
    System.out.println("Name: " + ch);
    
    System.out.println("Average marks: " + averageMarks);
    
    
    }
    }*/
   /*import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		
		Scanner sc = new Scanner(System.in);
     
		char ch = sc.next().charAt(0);
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();

		int totalMarks = m1 + m2 + m3;

int averageMarks = totalMarks / 3;

System.out.println("Name: " + ch);

System.out.println("Average marks: " + averageMarks);


}
}
*/