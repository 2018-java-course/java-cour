
package ex.pkg8.pkg2;


public class Item {
    String desc;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", "+colorCode);
    }

    // Write a public 3-arg setItemDisplay method that returns void.
    void setItemFields(String desc, int quantity, double price) {
        this.desc = desc;
        this.quantity = quantity;
        this.price = price;
    }
    
    void setItemFields(String desc, int quantity, float price) {
        System.out.println("OPS!!!");
    }

    // Write a public 4-arg setItemDisplay method that returns an int.
    int setItemFields(String desc, int quantity, double price, char colorCode) {
        if (colorCode == ' ') {
            return -1;
        }
        this.colorCode = colorCode;
        
        setItemFields(desc,quantity,price);
        return 0;
    }
    
    
    
}
