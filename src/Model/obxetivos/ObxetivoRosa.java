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
public class ObxetivoRosa extends Obxetivo {
    
    /**
     * Construtor do Obxetivo de cor vermello
     * @param xogo1 Xogo
     */
    public ObxetivoRosa(Xogo xogo1) {
        super(xogo1);
        cor();
        this.acerto=4;
        botonCadrado.setSize(ladoCadrado, ladoCadrado);
        this.xerarPosicionObxetivo();
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
     * @param LADOCADRADO
     */
    public void setLadoCadrado(int LADOCADRADO) {
        this.ladoCadrado = LADOCADRADO;
    }

    @Override
    public void cor() {
        botonCadrado.setBackground(Color.PINK);
        botonCadrado.setOpaque(true);
    }
}
