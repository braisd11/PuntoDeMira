/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.obstaculos;

import Model.Cadrado;
import Interfaces.Coloreable;
import Model.Xogo;
import java.awt.Color;

/**
 *
 * @author a22braisdr
 */
public class ObstaculoL extends Obstaculo implements Coloreable{
    
    /**
     * Construtor do Obstaculo en L
     * @param xogo1 Xogo
     */
    public ObstaculoL(Xogo xogo1) {
        super(xogo1);
        cor();
        
    }

    
    
    @Override
    public void cor() {
        setIterCadrados(getCadrados().iterator());
        while (getIterCadrados().hasNext()) {
            Cadrado cadrado2 = getIterCadrados().next();
            cadrado2.getBotonCadrado().setBackground(Color.ORANGE);
            cadrado2.getBotonCadrado().setOpaque(true);
            cadrado2.getBotonCadrado().setSize(ladoCadrado, ladoCadrado);
        }
    }

    @Override
    public void establecerFicha() {
        c1.setX(c0.getX());
        c1.setY(c0.getY()+ladoCadrado);
        c2.setX(c0.getX());
        c2.setY(c0.getY()+2*ladoCadrado);
        c3.setX(c0.getX()+ladoCadrado);
        c3.setY(c0.getY()+2*ladoCadrado);
    }
    
}
