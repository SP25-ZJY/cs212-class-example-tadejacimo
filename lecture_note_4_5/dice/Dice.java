package lecture_note_4_5.dice;
//Package -- means that this is part of lecture notes 4 and 5

/**
 * Dice class
 * CS 212
 * @author Cassie
 */


// Create another class within the class to test it
public class Dice {
    private String name;
    private String color;
    private int side;
    /**
     * number of sides of the dice <br />
     * might be 2, 3, 4...
     */
    public Dice(){
        name = "dice";
        color = "red";
        side = 6;
    }

    /**
     * Constructor with name, color, and sides of the dice
     * @param name The name of the dice
     * @param color The color of the dice
     * @param side The number of sides on the dice
     */

    public Dice(String name, String color, int side){
        this.name = name;
        this.color = color;
        this.side = side;
    }

    public int roll(){
        int n;
        n = (int)Math.round((Math.random()*100)%side + 1);
        return n;
    }
}
