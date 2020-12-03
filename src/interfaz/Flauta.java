/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 * Esta clase trata de un tipo de instrumento específico
 * @author Abigail
 */
public class Flauta extends InstrumentoViento{

    public Flauta() {
    }
    
    /**
     * 
     * @return De tipo String, es el instrumento que es nuestro objeto
     */
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }

    /**
     * 
     * @return Una cadena que dice Flauta
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
    
}
