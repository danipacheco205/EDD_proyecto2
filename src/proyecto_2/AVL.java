/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_2;

/**
 *
 * @author Daniela
 */

import java.util.Locale;
import java.text.Collator;

public class AVL {
    private Nodoavl raiz;
    private Collator coll;
    
    public AVL() 
    {
        this.raiz = null;
        this.coll = Collator.getInstance(new Locale("es","ES"));
        this.coll.setStrength(Collator.PRIMARY);
    }

    public Nodoavl getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodoavl raiz) {
        this.raiz = raiz;
    }

    public Collator getColl() {
        return coll;
    }

    public void setColl(Collator coll) {
        this.coll = coll;
    }
    
    
    public void insertroot(String word)
    {
        Nodoavl root = this.getRaiz();
        Nodoavl palabra = new Nodoavl(word);
        if (root == null)
        {
            this.setRaiz(palabra);
        }
        else
        {
            insertar(word, raiz);
        }
    }
    
    private void insertar(String palabra, Nodoavl root)
    {
        int comparar = coll.compare(palabra, root.getInfo());
        if (comparar < 0)
        {
            if (root.getNodizq() == null)
            {
                Nodoavl est = new Nodoavl(palabra);
                raiz.setNodizq(est);
            }
            else
            {
                insertar(palabra, root.getNodizq());
            }
        }
        else
        {
            if (root.getNoderc() == null)
            {
                Nodoavl est = new Nodoavl(palabra);
                root.setNoderc(est);
            }
            else
            {
                insertar(palabra, root.getNoderc());
            }
        }
    }
}
