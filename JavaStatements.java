import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class JavaStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if ((A >= B) && (A >= C)) {
            System.out.println("larget is A");
            
        }
        else if (B >= C) {
            System.out.println("larget is B");
        }
        else {
            System.out.println("larget is C");
        }
        
    }
}
