package ex12_3_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // declare and instantiate a Shirt object using an Item reference type
        Shirt shirt = new Shirt(30.00, 'L', 'R');
        Item item = shirt;
        
        Item newItem = new Shirt(30.00, 'L', 'R');
        Shirt newShirt = (Shirt)newItem;
        
        
//        Item item = new Item("sono un item generico", 0.0);
        // call the display method on the object, then the getColor method
        item.display();

        if (item instanceof Shirt) {
            String shirtColor = ((Shirt) item).getColor();
            System.out.println("Shirt color is " + shirtColor);
        } else {
            System.out.println("Item is not a shirt!");
        }
    }
}
