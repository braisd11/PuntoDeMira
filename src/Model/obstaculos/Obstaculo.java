/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.obstaculos;

import Model.Cadrado;
import Model.Xogo;
import View.VentanaPrincipal;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author a22braisdr
 */
public abstract class Obstaculo extends Cadrado {
    private ArrayList<Cadrado> cadrados = new ArrayList<>();
    private Iterator<Cadrado> iterCadrados;
    protected Cadrado c0;
    protected Cadrado c1;
    protected Cadrado c2;
    protected Cadrado c3;

    public Obstaculo(Xogo xogo1, VentanaPrincipal ventanaPrincipal) {
        super(xogo1, ventanaPrincipal);
        this.xogo1 = xogo1;
        this.ventanaPrincipal=ventanaPrincipal;
        this.ladoCadrado=40;
        crearCadrados();
        ventanaPrincipal.engadirObstaculos(this);
    }

    
    
    
    
    public Xogo getXogo1() {
        return xogo1;
    }

    public void setXogo1(Xogo xogo1) {
        this.xogo1 = xogo1;
    }

    public ArrayList<Cadrado> getCadrados() {
        return cadrados;
    }

    public void setCadrados(ArrayList<Cadrado> cadrados) {
        this.cadrados = cadrados;
    }

    public Iterator<Cadrado> getIterCadrados() {
        return iterCadrados;
    }

    public void setIterCadrados(Iterator<Cadrado> iterCadrados) {
        this.iterCadrados = iterCadrados;
    }

    public Cadrado getC0() {
        return c0;
    }

    public void setC0(Cadrado c0) {
        this.c0 = c0;
    }

    public Cadrado getC1() {
        return c1;
    }

    public void setC1(Cadrado c1) {
        this.c1 = c1;
    }

    public Cadrado getC2() {
        return c2;
    }

    public void setC2(Cadrado c2) {
        this.c2 = c2;
    }

    public Cadrado getC3() {
        return c3;
    }

    public void setC3(Cadrado c3) {
        this.c3 = c3;
    }
    
    public void crearCadrados(){
        c0 = new Cadrado(xogo1, ventanaPrincipal);
        c1 = new Cadrado(xogo1, ventanaPrincipal);
        c2 = new Cadrado(xogo1, ventanaPrincipal);
        c3 = new Cadrado(xogo1, ventanaPrincipal);
        montarFicha(c0, c1, c2, c3);
    }
    
    private void montarFicha(Cadrado c0,Cadrado c2,Cadrado c3,Cadrado c4){
        getCadrados().add(c0);
        getCadrados().add(c1);
        getCadrados().add(c2);
        getCadrados().add(c3);
    }
    
    public void xerarPosicionObstaculo(){
        int numX = (int) Math.floor(Math.random() * (xogo1.getMAXX() - 0 + 1) + 0);
        int numY = (int) Math.floor(Math.random() * (xogo1.getMAXY() - 0 + 1) + 0);
        this.setX(numX);
        this.setY(numY);
        xogo1.comprobarPosicion(this);
    }
}
