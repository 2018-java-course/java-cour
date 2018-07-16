package ex.pkg8.pkg1;

public class Item {

    char color;

    boolean setColor(char c) {
        if (c != ' ') {
            color = c;
            return true;
        }
        return false;
    }
    
    static void sayHello() {
        System.out.println("Hello!");
    }

}
