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

public class AVL 
{
    private Nodoavl raiz;
    private Collator coll;
    
    public AVL() 
    {
        /**
         * Constructor de la clase
         */
        this.raiz = null;
        this.coll = Collator.getInstance(new Locale("es","ES"));
        this.coll.setStrength(Collator.IDENTICAL);
    }

    public Nodoavl getRaiz() {
        /**
         * Obtiene la raiz del árbol
         */
        return raiz;
    }

    public void setRaiz(Nodoavl raiz) {
        /**
         * Establece la raiz del árbol
         */
        this.raiz = raiz;
    }

    public Collator getColl() {
        /**
         * Obtiene el comparador para Strings
         */
        return coll;
    }

    public void setColl(Collator coll) {
        /**
         * Establece el comparador para Strings
         */       
        this.coll = coll;
    }
    
    public void insertroot(String word)
    {
        /**
         * Si el arbol esta vacío, el primer nodo que sea insertado va a ser la raíz del árbol,
         * sino es insertado como algún hijo, además de cada insercción el arból se balancea
         */
        Nodoavl root = this.getRaiz();
        Nodoavl palabra = new Nodoavl(word);
        if (root == null)
        {
            this.setRaiz(palabra);
        }
        else
        {
            this.setRaiz(insertar(word, this.raiz));
        }
    }
    
    private Nodoavl insertar(String palabra, Nodoavl root)
    {
        /**
         * Inserta un string al arbol dependiendo del comparador
         */
        if(root == null)
        {
            return new Nodoavl(palabra);
        }
        int comparar = coll.compare(palabra, root.getInfo());
        if (comparar < 0)
        {
            if (root.getNodizq() == null)
            {
                Nodoavl est = new Nodoavl(palabra);
                root.setNodizq(est);
            }
            else
            {
                root.setNodizq(insertar(palabra, root.getNodizq()));
            }
        }
        else if (comparar > 0)
        {
            if (root.getNoderc() == null)
            {
                Nodoavl est = new Nodoavl(palabra);
                root.setNoderc(est);
            }
            else
            {
                root.setNoderc(insertar(palabra, root.getNoderc()));
            }
        }
        actuAltura(root);
        return balancear(root);
    }

    private void actuAltura(Nodoavl nodo) 
    {
        /**
         * Actualiza la altura de un nodo en base a la altura de sus hijos
         */
        if (nodo != null) {
            int alturaIzq = obtAltura(nodo.getNodizq());
            int alturaDer = obtAltura(nodo.getNoderc());
            nodo.setAltura(Math.max(alturaIzq, alturaDer) + 1);
        }
    }
    
    private int obtAltura(Nodoavl nodo) 
    {
        /**
         * Obtiene la altura del nodo
         */
        if (nodo == null) {
            return 0;
        }
        return nodo.getAltura();
    }
    
    private int obtBalance(Nodoavl nodo) 
    {
        /**
         * Calcula el balance del nodo
         */
        if (nodo == null) {
            return 0;
        }
        return obtAltura(nodo.getNodizq()) - obtAltura(nodo.getNoderc());
    }
    
    private Nodoavl balancear(Nodoavl nodo) 
    {
        /**
         * Revisa el balance y las rotaciones necesarias para balancearlo
         */
        if (nodo == null) 
        {
            return null;
        }

        actuAltura(nodo);
        int balance = obtBalance(nodo);

        if (balance > 1) 
        {
            if (obtBalance(nodo.getNodizq()) >= 0) 
            {
                return rotarDerecha(nodo);
            } else 
            {
                nodo.setNodizq(rotarIzquierda(nodo.getNodizq()));
                return rotarDerecha(nodo);
            }
        }

        if (balance < -1) 
        {
            if (obtBalance(nodo.getNoderc()) <= 0) 
            {
                return rotarIzquierda(nodo);
            } else 
            {
                nodo.setNoderc(rotarDerecha(nodo.getNoderc()));
                return rotarIzquierda(nodo);
            }
        }

        return nodo;
    }
    
    private Nodoavl rotarDerecha(Nodoavl y) 
    {
        /**
         * Rotación simple a la derecha
         */
        Nodoavl x = y.getNodizq();
        Nodoavl z = x.getNoderc();
        
        x.setNoderc(y);
        y.setNodizq(z);
        
        actuAltura(y);
        actuAltura(x);
        
        return x;
    }
    
    private Nodoavl rotarIzquierda(Nodoavl x) 
    {
        /**
         * Rotación simple a la izquierda
         */
        Nodoavl y = x.getNoderc();
        Nodoavl z = y.getNodizq();
        
        y.setNodizq(x);
        x.setNoderc(z);
        
        actuAltura(x);
        actuAltura(y);
        
        return y;
    }
    
    public boolean Balance() 
    {
        /**
         * Verifica si el arbol completo esta balanceado
         */
        return estaBalanceado(this.raiz);
    }
    
    private boolean estaBalanceado(Nodoavl nodo) 
    {
        /**
         * Verifica si cada subarbol está balanceado
         */
        if (nodo == null) 
        {
            return true;
        }
        
        int balance = obtBalance(nodo);
        return Math.abs(balance) <= 1 && estaBalanceado(nodo.getNodizq()) && estaBalanceado(nodo.getNoderc());
    }
    
    public String inorden(Nodoavl raiz, String resultado)
    {
        /**
         * Recorre el arbol en inorden, es decir en orden alfabético
         */
        if (raiz != null)
        {
            resultado = inorden(raiz.getNodizq(), resultado); 
            resultado += raiz.getInfo() + ", ";
            resultado = inorden(raiz.getNoderc(), resultado); 
        }
        return resultado;
    }
    
}