/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * Esta clase es de un tipo de Poligono llamado triángulo.
 * @author Abigail
 */
public class Triangulo extends Poligono{
    private float a,b,c,base,altura;
    private float alfa,beta,gama;


    public Triangulo() {
    }

    /**
     * 
     * @param a Es un cateto del triángulo, tipo float
     * @param b Es otro cateto del triángulo, tipo float
     * @param c Es la hipotenusa del triángulo, tipo float
     * @param base Es el cateto que se usa como base, tipo float
     * @param altura Es el cateto que se usa como altura, tipo float
     * @param alfa El primer ángulo del triángulo, tipo float
     * @param beta El segundo ángulo del triángulo, tipo float
     * @param gama Tercer ángulo del triángulo, tipo float
     */
    public Triangulo(float a, float b, float c, float base, float altura, float alfa, float beta, float gama) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
        this.alfa = alfa;
        this.beta = beta;
        this.gama = gama;
    }

    /**
     * 
     * @return De tipo float, regresa un lado del triángulo.
     */
    public float getA() {
        return a;
    }

    /**
     * 
     * @param a Es un cateto del triángulo, tipo float
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * 
     * @return De tipo float, regresa un lado del triángulo.
     */
    public float getB() {
        return b;
    }

    /**
     * 
     * @param b Es otro cateto del triángulo, tipo float
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * 
     * @return De tipo float, regresa un lado del triángulo.
     */
    public float getC() {
        return c;
    }

    /**
     * 
     * @param c Es la hipotenusa del triángulo, tipo float
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * 
     * @return De tipo float, es el lado que se usa como base.
     */
    public float getBase() {
        return base;
    }

    /**
     * 
     * @param base Es el cateto que se usa como base, tipo float
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * 
     * @return De tipo float, medida que representa la altura del triángulo
     */
    public float getAltura() {
        return altura;
    }

    /**
     * 
     * @param altura Es el cateto que se usa como altura, tipo float
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * 
     * @return De tipo float, medida de uno de los ángulos del triángulo
     */
    public float getAlfa() {
        return alfa;
    }

    /**
     * 
     * @param alfa El primer ángulo del triángulo, tipo float
     */
    public void setAlfa(float alfa) {
        this.alfa = alfa;
    }

    /**
     * 
     * @return De tipo float, medida de uno de los ángulos del triángulo
     */
    public float getBeta() {
        return beta;
    }

    /**
     * 
     * @param beta El segundo ángulo del triángulo, tipo float
     */
    public void setBeta(float beta) {
        this.beta = beta;
    }

    /**
     * 
     * @return De tipo float, medida de uno de los ángulos del triángulo
     */
    public float getGama() {
        return gama;
    }

    /**
     * 
     * @param gama Tercer ángulo del triángulo, tipo float
     */
    public void setGama(float gama) {
        this.gama = gama;
    }

    /**
     * 
     * @return Un conjunto de cadenas que imprimen las medidas obtenidas del triángulo.
     */
    @Override
    public String toString() {
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + ", alfa=" + alfa + ", beta=" + beta + ", gama=" + gama + '}';
    }
    
}
