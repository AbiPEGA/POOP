/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 * Esta interfaz declara los elementos de nuestros objetos.
 * @author Abigail
 */
public interface InstrumentoMusical {
    //Por defecto todos los métodos son public y abstract
    void tocar();
    void afinar();
    String tipoInstrumento();
}
