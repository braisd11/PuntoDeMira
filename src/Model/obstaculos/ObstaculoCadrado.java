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
public class ObstaculoCadrado extends Obstaculo implements Coloreable {

    
    /**
     * Construtor do Obstaculo Cadrado
     * @param xogo1 Xogo
     */
    public ObstaculoCadrado(Xogo xogo1) {
        super(xogo1);
        cor();
    }
    
    

    @Override
    public void cor() {
        setIterCadrados(getCadrados().iterator());
        while (getIterCadrados().hasNext()) {
            Cadrado cadrado2 = getIterCadrados().next();
            cadrado2.getBotonCadrado().setBackground(Color.CYAN);
            cadrado2.getBotonCadrado().setSize(ladoCadrado, ladoCadrado);
            cadrado2.getBotonCadrado().setOpaque(true);
        }
    }

    
    @Override
    public void establecerFicha() {
        c1.setX(c0.getX()+ladoCadrado);
        c1.setY(c0.getY());
        c2.setX(c0.getX());
        c2.setY(c0.getY()+ladoCadrado);
        c3.setX(c0.getX()+ladoCadrado);
        c3.setY(c0.getY()+ladoCadrado);
    }
    
}
