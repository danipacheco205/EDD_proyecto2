/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_2;

import java.io.File;        
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
/**
 *
 * @author Daniela
 */
public class Proyecto_2 {

    /**
     * @param args the command line arguments
     */
    
    public static String strappfile = System.getProperty("java.io.tmpdir") + "grafo.txt";
    public static File appfile = new File(strappfile);
    
    public static void main(String[] args) {
        // TODO code application logic here
        Interfaz interf = new Interfaz();
        interf.setVisible(true);
    }
    
}
