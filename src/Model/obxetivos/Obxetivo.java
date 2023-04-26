/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.obxetivos;

import Model.Cadrado;
import Model.Coloreable;
import Model.Xogo;
import javax.swing.JButton;


/**
 *
 * @author a22braisdr
 */
public abstract class Obxetivo extends Cadrado implements Coloreable {
    protected int ladoCadrado;

    
    public Obxetivo(Xogo xogo1) {
        super(xogo1);
        this.xogo1=xogo1;
        xogo1.getVentanaPrincipal().engadirObxetivos(this);
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        botonCadrado.setLocation(x, y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        botonCadrado.setLocation(x, y);
    }

    public JButton getLblCadrado() {
        return botonCadrado;
    }

    public void setLblCadrado(JButton botonCadrado) {
        this.botonCadrado = botonCadrado;
    }

    
    
    
    
    
    /**
     * Xéranse dous números aleatorios para darlle a unhas coordenadas x e y
     */
    public void xerarPosicionObxetivo(){
        if (xogo1.getBalas()>0){
            int numX = (int) Math.floor(Math.random() * (xogo1.getMAXX() - 0 + 1) + 0);
            int numY = (int) Math.floor(Math.random() * (xogo1.getMAXY() - 0 + 1) + 0);
            this.setX(numX);
            this.setY(numY);
            xogo1.comprobarPosicion(this);
        }
    }

    
    
    //PROBLEMAS AQUÍ
    public boolean comprobarPezas(Obxetivo obxetivo){
        boolean posicionLibre=true;
        for (int exeX=obxetivo.getX(); exeX<(obxetivo.getX()+obxetivo.ladoCadrado); exeX++) {
            for (int exeY=obxetivo.getY(); exeY<(obxetivo.getY()+obxetivo.ladoCadrado); exeY++) {
                if (xogo1.getVentanaPrincipal().getPanelJuego().getComponentAt(exeX, exeY)!=null){
                    posicionLibre=false;
                    xerarPosicionObxetivo();
                }
            }
        }
        return posicionLibre;
    }
    
    
    /**
     * Dalle unha cor aos obxetivos
     */
    @Override
    public abstract void cor();
}
