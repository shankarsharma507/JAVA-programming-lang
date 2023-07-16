/*public class JavaPattern {
    public static void main(String[] args) {
        for(int line=1; line<=4; line++) {

            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} 
*/
public class JavaPattern { 
    
   public static void Daimond_pattern(int n) {
// first half
    for(int i = 1; i<=n; i++){

        for(int j = 1; j<=(n-i); j++) {
        System.out.print(" ");
        }
        
        for(int j =1; j<=(2*i)-1; j++) {
            System.out.print("*"); 
        }

        System.out.println();
        
        }
    
        
        
        
        //second half

        for(int i = n; i>=1; i--){

            for(int j = 1; j<=(n-i); j++) {
            System.out.print(" ");
            }
            
            for(int j =1; j<=(2*i)-1; j++) {
                System.out.print("*"); 
            }
            System.out.println();
            
            }
            
            
            
}

        public static void main(String[] args) {
           Daimond_pattern(100);

        }
    }
    

    

