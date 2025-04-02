
/**
 * Write a description of class Encounter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Encounter
{
    // instance variables - replace the example below with your own
    private int    encounterNo; //
    private String encouterType;
    private String location;
    private int    requiredSkill;
    private double prizeMoney;

    /**
     * Constructor for objects of class Encounter
     */
    public Encounter()
    {
        // initialise instance variables
        
    }


    public int getSkillLevel()
    {
        // put your code here
        return requiredSkill;
    }
    
    public boolean isShipEligilbe()
    {
        return true;
    }
    
    public void winEncounter()
    {
      //handle what happens when a player wins 
      // add money to war chest and so on
    }
    
    public void loseEncounter()
    {
        //handles what happens whne a player loses
    }
    
    public String toString()
    {
     return null;
    }
}
