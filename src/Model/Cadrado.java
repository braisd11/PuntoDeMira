/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import javax.swing.JButton;

/**
 *
 * @author brais
 */
public class Cadrado {
    /**
     * Coordenada x do Cadrado
     */
    public int x;
    /**
     * Coordenada y do Cadrado
     */
    public int y;
    /**
     * Botón ligado ao Cadrado
     */
    public JButton botonCadrado;
    /**
     * Tamaño por defecto do cadrado
     */
    public int ladoCadrado=35;
    /**
     * Xogo
     */
    protected Xogo xogo1;

    /**
     * Construtor da clase Cadrado
     * @param xogo1 Xogo
     */
    public Cadrado(Xogo xogo1) {
        this.xogo1=xogo1;
        botonCadrado = new javax.swing.JButton();
        botonCadrado.setSize(ladoCadrado, ladoCadrado);
        botonCadrado.setFocusable(false);
    }
    
    
    

    //getter y setter

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
    public int getX() {
        return x;
    }

    /**
     *
     * @param x
     */
    public void setX(int x) {
        this.x = x;
        botonCadrado.setLocation(x, y);
    }

    /**
     *
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @param y
     */
    public void setY(int y) {
        this.y = y;
        botonCadrado.setLocation(x, y);
    }
    
    /**
     *
     * @return
     */
    public JButton getBotonCadrado() {
        return botonCadrado;
    }
    
    /**
     *
     * @param botonCadrado
     */
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
