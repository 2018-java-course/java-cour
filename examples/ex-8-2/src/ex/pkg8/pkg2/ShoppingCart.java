
package ex.pkg8.pkg2;


public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("Maglietta",10,5.0);

        // Call the 4-arg setItemFields method, checking the return value.  
        int ret = item1.setItemFields("Maglietta",10,5.0,' ');

	// Test your code for both valid and invalid values
        System.out.println("Return value is: " + ret);
        
        // Watch out to literals!
        item1.setItemFields("Maglietta",10,5.0F);
        
        
    }
}
