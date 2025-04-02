
/**
 * Write a description of class Frigate here.
 *
 * @author (Ohemaa&Ishika)
 * @version (a version number or a date)
 */
public class Frigate extends Ships
{
    // instance variables - replace the example below with your own
    private int noOfCannons;
    private boolean pinnace;
    //Subclass of Ship
    /**
     * Constructor for objects of class Frigate
     * @param <error>
     */
    public Frigate(String nm ,String cap,int bs ,int cf,int cannons ,boolean pin)
    {
        // initialise instance variables
        super(nm ,cap ,bs,cf);
        this.noOfCannons = cannons;
        this.pinnace = pin;
    }

    public boolean hasPinnance()
    {
        return true; // returns T/F if ship has pinnance
    }
    
    
    public int noOfCannons( int can)
    {
        noOfCannons = can;
        return noOfCannons;
          ; //Placeholder
        // return
    }
    //Frigates have their own individual battle skill
    //Friagte commission fee baesd on number of cannons
    //1 cannnon = 10 pounds
    //2 cannon = 20 ponunds
    
    
}
