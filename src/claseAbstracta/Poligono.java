/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 * Esta clase abstracta declara los dos métodos básicos de los polígonos.
 * @author Abigail
 */
public abstract class Poligono {
    
    public abstract float area();
    public abstract float perimetro();

    /**
     * 
     * @return Una cadena que dice Poligono
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
