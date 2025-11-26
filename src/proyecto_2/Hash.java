/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2;

/**
 *
 * @author Daniela
 */

public class Hash {

    public Hash()
    {
        /**
         * Constructor de la clase
         */
        int hashcode;
    }
    
    public int getHashCode(String Value)
    {
        /**
         * Calcula el indice del String para ser añadido al arreglo 
         */
        char[] character = Value.toCharArray();
        int hashcode = 0;
        for(int i=0; i<character.length; i++) 
        {
            hashcode += (int) character[i];
        }
        int newcode = hashcode % Value.length();
        newcode += 2;
        return newcode;
    }
    
}

