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
public class ObstaculoCadradoGrande extends Obstaculo implements Coloreable{
    
    

    public ObstaculoCadradoGrande(Xogo xogo1) {
        super(xogo1);
        this.ladoCadrado=60;
        cor();
        xerarPosicionObstaculo();
    }

    
    
    @Override
    public void cor() {
        setIterCadrados(getCadrados().iterator());
        while (getIterCadrados().hasNext()) {
            Cadrado cadrado = getIterCadrados().next();
            cadrado.getBotonCadrado().setBackground(Color.RED);
            cadrado.getBotonCadrado().setSize(ladoCadrado, ladoCadrado);
            cadrado.getBotonCadrado().setOpaque(true);
        }
    }

    @Override
    public void establecerFicha() {
        c1.setX(c0.getX()+this.ladoCadrado);
        c1.setY(c0.getY());
        c2.setX(c0.getX());
        c2.setY(c0.getY()+this.ladoCadrado);
        c3.setX(c0.getX()+this.ladoCadrado);
        c3.setY(c0.getY()+this.ladoCadrado);
    }
    
}
