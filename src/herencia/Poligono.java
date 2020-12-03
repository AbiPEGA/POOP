/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * Esta clase contiene los dos métodos básicos de los polígonos.
 * @author Abigail
 */
public class Poligono {

    public Poligono() {
    }
    
    /**
     * 
     * @return Un cero para que en cualquier caso el área mínima sea 0, es un float
     */
    public float area(){
        return 0;
    }
    
    /**
     * 
     * @return Un cero para que en cualquier caso el perímetro mínimo sea 0, es un float
     */
    public float perimetro(){
        return 0;
    }

    /**
     * 
     * @return Una cadena que dice Poligono.
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
