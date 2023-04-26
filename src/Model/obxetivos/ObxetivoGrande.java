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
public class ObxetivoGrande extends Obxetivo {
    
    
    public ObxetivoGrande(Xogo xogo1) {
        super(xogo1);
        cor();
        botonCadrado.setSize(ladoCadrado, ladoCadrado);
        botonCadrado.setVisible(false);
        this.xerarPosicionObxetivo();
    }

    public int getLadoCadrado() {
        return ladoCadrado;
    }

    public void setLadoCadrado(int LADOCADRADO) {
        this.ladoCadrado = LADOCADRADO;
    }

    @Override
    public void cor() {
        botonCadrado.setBackground(Color.RED);
        botonCadrado.setOpaque(true);
    }
}
