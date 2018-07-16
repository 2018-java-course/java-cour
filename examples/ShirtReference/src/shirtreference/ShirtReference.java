/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shirtreference;

/**
 *
 * @author claudio
 */
public class ShirtReference {

    static void changeShirtColor(Shirt shirt, char c) {
        shirt = new Shirt();
        shirt.color = c;
        System.out.println("Reference of myShirt: " + Integer.toHexString(System.identityHashCode(shirt)));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        System.out.println("Reference of myShirt: " + Integer.toHexString(System.identityHashCode(myShirt)));

        System.out.println("Initial color: " + myShirt.color);
        changeShirtColor(myShirt, 'C');
        System.out.println("Changed color: " + myShirt.color);
    }

}

class Shirt {

    char color;
}
