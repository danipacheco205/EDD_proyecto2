/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto_2;

/**
 *
 * @author Daniela
 */
public class Hash {

    public Hash()
    {
        int hashcode;
    }
    
    public int getHashCode(String Title)
    {
        char[] character = Title.toCharArray();
        int hashcode = 0;
        for(int i=0; i<character.length; i++) 
        {
            hashcode += (int) character[i];
        }
        return hashcode;
    }
    
}
