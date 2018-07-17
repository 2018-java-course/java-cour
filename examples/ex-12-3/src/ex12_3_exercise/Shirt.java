package ex12_3_exercise;

public class Shirt extends Item{
    private char size;
    private char colorCode;

    public String getColor() {
        String color;
        switch (colorCode) {
            case 'R': color = "Red";break;
            case 'W': color = "White";break;
            case 'Y': color = "Yellow";break;
            default: color = "Unknown";
        }
        
        return color;
    }
    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }
    
    public void display(){
//        super.display();
        System.out.println("\tSize: "+size);
        System.out.println("\tColor Code: "+ colorCode);
    } 
    
    // Code a public getColor method that converts the colorCode to a the color name
       // Use a switch statement.  Return the color name. 

}