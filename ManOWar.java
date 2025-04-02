
/**
 * Write a description of class ManOWar here.
 *
 * @author (Ohemaa&Ishika)
 * @version (a version number or a date)
 */
public class ManOWar extends Ships 
{
    // instance variables - replace the example below with your own
    private int noOfMarines;
    private int  noOfDecks;
    private int battleSkill;

    /**
     * Constructor for objects of class ManOWar
     */
    public ManOWar(String nm , String cap,int cf, int nFm, int nFd ,int bk)
    {
        super(nm ,cap,cf);
        noOfMarines = nFm;
        noOfDecks = nFd ; 
        battleSkill = bk;
    }
    
    
    
     //updates the number of marines
    public int setMarines(int no)
    {
        noOfMarines = no;
        return  noOfMarines;     
    }
    
    public void setCommissionFee(int fee)
    {
        this.commissionFee = fee;
    }     
    
    public int getCommissionFee()//
    {
        return commissionFee;
    }
    //Sets commission fee based on the number of decks
      public int calculateCommission()
        {
            if (noOfDecks == 2)
            {
                setCommissionFee(300);
            }
            else
            {
                setCommissionFee(500);
            }
          return getCommissionFee();
        }
              
    
    public String toString()
    {
        return super.toString() + "\nMarines: " + noOfMarines + "\nDecks: " + noOfDecks + 
           "\nCommission Fee: " + commissionFee;
    }
}
