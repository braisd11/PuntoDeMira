/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.obxetivos;

import Model.Xogo;
import java.awt.Color;

/**
 *
 * @author brais
 */
public class ObxetivoPequeno extends Obxetivo {
    
    public ObxetivoPequeno(Xogo xogo1) {
        super(xogo1);
        this.ladoCadrado=30;
        cor();
        xerarPosicionObxetivo();
        botonCadrado.setSize(ladoCadrado, ladoCadrado);
    }

    public int getLadoCadrado() {
        return ladoCadrado;
    }

    public void setLadoCadrado(int LADOCADRADO) {
        this.ladoCadrado = LADOCADRADO;
    }

    @Override
    public void cor() {
        botonCadrado.setBackground(Color.green);
        botonCadrado.setOpaque(true);
    }
}
