/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg7.pkg2;

/**
 *
 * @author claudio
 */
public class Ex72 {

    /**
     * @param args the command line arguments
     */
     public static void main (String[] args){
        String custName = "Claudio Capobianco";
        String firstName;
        int spaceIdx;
        StringBuilder sb;
       
        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        
        sb = new StringBuilder(firstName);
        sb.append(custName.substring(spaceIdx));
        
        System.out.println("String builder contains: " + sb.toString());
        
        //System.out.println(firstName);
          
	//Instantiate and initialize sb to firstName.

	// Put the full name back together, using StringBuilder append method.
	//   You can just enter the String literal for the last name.
	//   Print the full name.
        
    }
    
}
