/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wars;

/**
 *
 * @author aisha
 */
public class Teamwork {
  private String[] details = new String[12];
  
  public Teamwork(){
      details[0] = "surname of programmer1";
      details[1] = "first name of programmer1";
      details[2] = "SRN of programmer1";
      details[3] = "surname of programmer2";
      details[4] = "first name of programmer2";
      details[5] = "SRN of programmer2";
      details[6] = "surname of programmer3";
      details[7] = "first name of programmer3";
      details[8] = "SRN of programmer3";
      details[9] = "surname of programmer4";
      details[10] = "first name of programmer4";
      details[11] = "SRN of programmer4";
      }
      
    public String[] getTeamDetails()
    {
        return details;
    }
    
    public void displayDetails()
    {
        for(String temp:details)
        {
            System.out.println(temp.toString());
        }
    }

}

