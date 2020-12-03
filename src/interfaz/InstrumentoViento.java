/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 * Esta clase indica que hace nuestro instrumento y de que tipo es.
 * @author Abigail
 */
public class InstrumentoViento extends Object implements InstrumentoMusical{

    public InstrumentoViento() {
    }
    
    @Override
    public void tocar(){
        System.out.println("Estoy tocando instrumento de viento");
    }
    
    @Override
    public void afinar(){
        System.out.println("Estoy afinando un instrumento de viento");
    }
    
    /**
     * 
     * @return Una cadena que dice el tipo de instrumento
     */
    @Override
    public String tipoInstrumento(){
        return "Instrumento de viento";
    }

    /**
     * 
     * @return Una cade que imprime Instrumento de viento.
     */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
}
