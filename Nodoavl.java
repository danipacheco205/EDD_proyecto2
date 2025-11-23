/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_2;

/**
 *
 * @author Daniela
 */
public class Nodoavl {
    private String info;
    private Nodoavl nodizq;
    private Nodoavl noderc;
    private int nivel;

    public Nodoavl(String info) {
        this.info = info;
        this.nodizq = null;
        this.noderc = null;
        this.nivel = 1;
    } 
}
