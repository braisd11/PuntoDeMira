/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import View.VentanaPrincipal;
import javax.swing.JButton;

/**
 *
 * @author brais
 */
public class Cadrado {
    public int x;
    public int y;
    public JButton botonCadrado;
    public int ladoCadrado;
    protected Xogo xogo1;
    protected VentanaPrincipal ventanaPrincipal;

    public Cadrado(Xogo xogo1, VentanaPrincipal ventanaPrincipal) {
        this.xogo1=xogo1;
        this.ventanaPrincipal=ventanaPrincipal;
        ladoCadrado=40;
        botonCadrado = new javax.swing.JButton();
        botonCadrado.setSize(ladoCadrado, ladoCadrado);
        botonCadrado.setFocusable(false);
    }
    
    
    

    //getter y setter
    public int getLadoCadrado() {    
        return ladoCadrado;
    }
    public void setLadoCadrado(int ladoCadrado) {
        this.ladoCadrado = ladoCadrado;
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
    
    
    public JButton getBotonCadrado() {
        return botonCadrado;
    }
    
    public void setBotonCadrado(JButton botonCadrado) {    
        this.botonCadrado = botonCadrado;
    }

    /**
     * 
     * @return As coordenadas do cadrado
     */
    public String getCoordenadas() {
        return (x + ", " + y);
    }
}
