/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * Esta clase es de un tipo de Poligono llamado cuadrilátero.
 * @author Abigail
 */
public class Cuadrilatero extends Poligono{
    private int alfa, beta;
    private float a,b,base,alt;

    public Cuadrilatero() {
    }

    /**
     * 
     * @param alfa Es el primer ángulo del cuadrilátero, de tipo int
     * @param beta Es el segundo ángulo del cuadrilátero, de tipo int
     * @param a Es uno de los lados del cuadrilátero, de tipo float
     * @param b Es el otro lado del cuadrilátero, de tipo float
     * @param base Es la medida del lado que ejerce como base, tipo float
     * @param alt Es la medida del lado que ejerce como altura, tipo float
     */
    public Cuadrilatero(int alfa, int beta, float a, float b, float base, float alt) {
        this.alfa = alfa;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.alt = alt;
    }

    /**
     * 
     * @return De tipo int, es uno de los ángulos del cuadrilátero
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * 
     * @param alfa Es el primer ángulo del cuadrilátero, de tipo int
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * 
     * @return De tipo int, es uno de los ángulos del cuadrilátero
     */
    public int getBeta() {
        return beta;
    }

    /**
     * 
     * @param beta Es el segundo ángulo del cuadrilátero, de tipo int
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * 
     * @return De tipo float, a es uno de los lados
     */
    public float getA() {
        return a;
    }

    /**
     * 
     * @param a Es uno de los lados del cuadrilátero, de tipo float
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * 
     * @return De tipo float, b es uno de los lados
     */
    public float getB() {
        return b;
    }

    /**
     * 
     * @param b Es el otro lado del cuadrilátero, de tipo float
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * 
     * @return De tipo float, es la base del cuadrilátero.
     */
    public float getBase() {
        return base;
    }

    /**
     * 
     * @param base Es la medida del lado que ejerce como base, tipo float
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * 
     * @return De tipo float, es la altura del cuadrilátero.
     */
    public float getAlt() {
        return alt;
    }

    /**
     * 
     * @param alt Es la medida del lado que ejerce como altura, tipo float
     */
    public void setAlt(float alt) {
        this.alt = alt;
    }

    /**
     * 
     * @return Un conjunto de cadenas que imprimen los valores que tenemos del cuadrilátero
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", alt=" + alt + '}';
    }
    
}
