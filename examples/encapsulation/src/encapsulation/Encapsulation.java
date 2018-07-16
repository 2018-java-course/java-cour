package encapsulation;

/**
 *
 * @author claudio
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Referee davide = new Referee("Davide");
        davide.setAge(23);
        
        Whistle myWhistle = new Whistle();
        myWhistle.doWhistle();
    }
    
}

class Whistle {
    private double db = 50;
    
    // Constructor with no arguments
    public Whistle() {
        db = 100;
    }
    
    // We can also have a private constructor
    private Whistle(double db) {
        this.db = db;
    }
    
    // A cumbersome and non-sense constructor, just for academic purpose
    public Whistle(boolean b) {
        this(200);
        if (b) {
            this.db = 0;
        }
    }
    
    public void doWhistle() {
        System.out.println("Whistling at " + db + " decibel!!!");
    }
}

class Referee {
    private String name;
    private int age;

    Referee() {
        this("Giulio");
    }
    
    Referee(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("You have to be in age!");
            return;
        }
        this.age = age;
    }
    
    
}