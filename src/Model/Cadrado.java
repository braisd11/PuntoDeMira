/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import javax.swing.JLabel;

/**
 *
 * @author brais
 */
public class Cadrado {
    public int x;
    public int y;
    public JLabel lblCadrado;

    public Cadrado() {
        lblCadrado = new javax.swing.JLabel();
        
    }
    
    
    //getter y setter
    public int getX() {    
        return x;
    }
    public void setX(int x) {
        this.x = x;
        lblCadrado.setLocation(x, y);
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
        lblCadrado.setLocation(x, y);
    }
    
    
    public JLabel getLblCadrado() {
        return lblCadrado;
    }
    
    public void setLblCadrado(JLabel lblCadrado) {    
        this.lblCadrado = lblCadrado;
    }

    /**
     * 
     * @return As coordenadas do cadrado
     */
    public String getCoordenadas() {
        return (x + ", " + y);
    }
    
    
    
}
