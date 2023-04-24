/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.obstaculos;

import Model.Cadrado;
import Model.Coloreable;
import Model.Xogo;
import java.awt.Color;

/**
 *
 * @author a22braisdr
 */
public class ObstaculoL extends Obstaculo implements Coloreable{

    

    public ObstaculoL(Xogo xogo1) {
        super(xogo1);
        this.ladoCadrado=40;
        cor();
        xerarPosicionObstaculo();
        
    }

    
    
    @Override
    public void cor() {
        setIterCadrados(getCadrados().iterator());
        while (getIterCadrados().hasNext()) {
            Cadrado cadrado = getIterCadrados().next();
            cadrado.getBotonCadrado().setBackground(Color.ORANGE);
            cadrado.getBotonCadrado().setOpaque(true);
            cadrado.getBotonCadrado().setSize(ladoCadrado, ladoCadrado);
        }
    }

    @Override
    public void establecerFicha() {
        c1.setX(c0.getX());
        c1.setY(c0.getY()+this.ladoCadrado);
        c2.setX(c0.getX());
        c2.setY(c0.getY()+2*this.ladoCadrado);
        c3.setX(c0.getX()+this.ladoCadrado);
        c3.setY(c0.getY()+3*this.ladoCadrado);
    }
    
}
