/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import inheritance.game.Game;

/**
 *
 * @author claudio
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Referee giulio = new Referee();
        giulio.setName("Giulio");
        giulio.doWhistle();
        
        Player francesco = new Player();
        francesco.setName("Francesco");
        francesco.setNumber(3);
        francesco.doGoal();
        
        Game game = new Game();
        // System.out.println(game.var); // doesn't work, game is in a subpackage
        
        Team team = new Team();
        System.out.println(team.var); // OK, team is in the same package
    }
    
}

class FIGCAssociate {
    private String name;
    
    FIGCAssociate() {
        System.out.println("No args FIGCAssociate constructor");
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Player extends FIGCAssociate {
    private int number;
    
    Player() {
        System.out.println("No args Player constructor");
    }
    
    public void doGoal() {
        System.out.println("Player " + getName() + " with number "+ getNumber() +" marked a GOOOOOAL!");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

class Referee extends FIGCAssociate {
    Referee() {
        System.out.println("No args Referee constructor");
    }
    
    public void doWhistle() {
        System.out.println(getName() + " does FIIIIIII!");
    }
    
    
    @Override
    public void setName(String name) {
        super.setName("Mr."+name);
    }
    
}
