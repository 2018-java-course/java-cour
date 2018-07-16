
package ex11_2_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
        String name;
        int age;
        
        // Print an error message if fewer than 2 args are passed in.
        if (args.length < 2) {
            System.out.println("Insufficient number of arguments. Expected 2, received "+ args.length);
            return;
        }
        // Parse the args array to populate name and age.  
        name = args[0];
        age = Integer.parseInt(args[1]);
        
        System.out.println("Ciao "+name+", your age is "+age);
        
        
	
        
        
    }
}
