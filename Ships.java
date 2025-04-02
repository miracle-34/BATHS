/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wars;

/**
 *
 * @author aisha
 */
public class Ships {
    private String name;
    private String captain;
    private int battleSkill;
    private double commissionFee;
    private ShipState shipState;
    
    public Ships(String nam, String cap, int bs, double cf, ShipState ss ){
        name = nam;
        captain = cap;
        battleSkill = bs;
        commissionFee = cf;
        shipState = ss;  
    }
    public String getShipName(){
    return name;
    }
    
    public int getShipBattleSkill(){
        return battleSkill;
    }
    
    
    
    public void commission(){
        ShipState = ACTIVE;
    }
    //Should the ship’s status or cost be updated dynamically when these methods are called?

    public void deCommission(){
    }
    
    public boolean isAvailableForEncounter(){
       return shipState == shipState.ACTIVE;
    }
    
    public void sink(){
    }
    
   @Override
    public String toString(){
    return "Name: "+ name + "\nCaptain: " + captain + 
            "\nBattle Skill" + battleSkill + 
            "\n Commission Fee: " + commissionFee +
            "\nShip State: " + shipState ; 
    }

}

