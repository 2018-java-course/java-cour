
package ex.pkg8.pkg1;

public class ShoppingCart {
    
    static void test(char c) {
        Item item1 = new Item();
        if (item1.setColor(c)) {
            System.out.println("Color is: " + item1.color);
        } else {
            System.out.println("Invalid color code");
        }        
    }
    
   
    public static void main(String[] args){
        
        test(' '); // invalid
        test('C'); // valid
        
    }
}
