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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Nodoavl getNodizq() {
        return nodizq;
    }

    public void setNodizq(Nodoavl nodizq) {
        this.nodizq = nodizq;
    }

    public Nodoavl getNoderc() {
        return noderc;
    }

    public void setNoderc(Nodoavl noderc) {
        this.noderc = noderc;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
