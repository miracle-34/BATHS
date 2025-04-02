
/**
 * Write a description of class Sloop here.
 *
 * @author (Ohemaa&Ishika)
 * @version (a version number or a date)
 */
public class Sloop extends Ships
{
    // instance variables - replace the example below with your own
   
    private boolean doctor;
    private int  battleSkill ;

    /**
     * Constructor for objects of class Sloop
     */
    public Sloop(String nm ,String cap,int cf,boolean doc )
    {
        // initialise instance variables
        super(nm ,cap,cf);
        this.doctor = doc;
        this.battleSkill = 5;
    }
    
    
    public boolean hasDoctor()
    {
     return true; // returns T/F if the ship has a doctor
    }
    
    public int setCommissionFee(int money)
    {
        // put your code here
        return 5; // set the commision fee for the ship
    }
}
