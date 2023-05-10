/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.obstaculos;

import Model.Cadrado;
import Model.Xogo;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author a22braisdr
 */
public abstract class Obstaculo {
    private ArrayList<Cadrado> cadrados = new ArrayList<>();
    private Iterator<Cadrado> iterCadrados;
    /**
     * Tamaño do lado de cada Cadrado do Obstáculo
     */
    protected int ladoCadrado=70;
    private Xogo xogo1;
    /**
     * Primeiro dos Cadrados
     */
    protected Cadrado c0;
    /**
     * Segundo dos Cadrados
     */
    protected Cadrado c1;
    /**
     * Terceiro dos Cadrados
     */
    protected Cadrado c2;
    /**
     * Cuarto dos Cadrados
     */
    protected Cadrado c3;

    
    /**
     * Construtor do Obstaculo
     * @param xogo1 Xogo
     */
    public Obstaculo(Xogo xogo1) {
        this.xogo1=xogo1;
        crearCadrados();
    }

    /**
     *
     * @return
     */
    public ArrayList<Cadrado> getCadrados() {
        return cadrados;
    }

    /**
     *
     * @param cadrados
     */
    public void setCadrados(ArrayList<Cadrado> cadrados) {
        this.cadrados = cadrados;
    }

    /**
     *
     * @return
     */
    public int getLadoCadrado() {
        return ladoCadrado;
    }

    /**
     *
     * @param ladoCadrado
     */
    public void setLadoCadrado(int ladoCadrado) {
        this.ladoCadrado = ladoCadrado;
    }
    
    /**
     *
     * @return
     */
    public Iterator<Cadrado> getIterCadrados() {
        return iterCadrados;
    }

    /**
     *
     * @param iterCadrados
     */
    public void setIterCadrados(Iterator<Cadrado> iterCadrados) {
        this.iterCadrados = iterCadrados;
    }

    /**
     *
     * @return
     */
    public Cadrado getC0() {
        return c0;
    }

    /**
     *
     * @param c0
     */
    public void setC0(Cadrado c0) {
        this.c0 = c0;
    }

    /**
     *
     * @return
     */
    public Cadrado getC1() {
        return c1;
    }

    /**
     *
     * @param c1
     */
    public void setC1(Cadrado c1) {
        this.c1 = c1;
    }

    /**
     *
     * @return
     */
    public Cadrado getC2() {
        return c2;
    }

    /**
     *
     * @param c2
     */
    public void setC2(Cadrado c2) {
        this.c2 = c2;
    }

    /**
     *
     * @return
     */
    public Cadrado getC3() {
        return c3;
    }

    /**
     *
     * @param c3
     */
    public void setC3(Cadrado c3) {
        this.c3 = c3;
    }
    
    
    /**
     * Crea os Cadrados que forman o Obstáculo
     */
    public void crearCadrados(){
        c0 = new Cadrado(xogo1);
        c1 = new Cadrado(xogo1);
        c2 = new Cadrado(xogo1);
        c3 = new Cadrado(xogo1);
        montarFicha(c0, c1, c2, c3);
    }
    
    private void montarFicha(Cadrado c0,Cadrado c1,Cadrado c2,Cadrado c3){
        cadrados.add(c0);
        cadrados.add(c1);
        cadrados.add(c2);
        cadrados.add(c3);
    }
    
    
    /**
     * Xera unha posición para o cadrado c0 do Obstaculo e comproba se é posible
     */
    public void xerarPosicionObstaculo(){
        do{
            int numX = (int) Math.floor(Math.random() * ((xogo1.getMAXX()/ladoCadrado) - 0 + 1) + 0);
            int numY = (int) Math.floor(Math.random() * ((xogo1.getMAXY()/ladoCadrado) - 0 + 1) + 0);
            c0.setX(numX*ladoCadrado);
            c0.setY(numY*ladoCadrado); 
            establecerFicha();
        }
        while ((!xogo1.getVentanaPrincipal().comprobarObstaculos(this)) || !comprobarPosicion(c3.getX(), c3.getY()));
    }
        
        
    
    private boolean comprobarPosicion(int x, int y){
        boolean correcto=true;
        if (x>=(xogo1.getMAXX()-ladoCadrado) || y>=(xogo1.getMAXY()-ladoCadrado)){
            correcto=false;
        }
        return correcto;
    }
    
    /**
     * Monta o resto de cadrados da ficha con respecto ao cadrado c0
     */
    public abstract void establecerFicha();
}
