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
        this.ladoCadrado=35;
        cor();
        this.xerarPosicionObstaculo();
        
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
        c1.getBotonCadrado().setBounds(c0.getBotonCadrado().getX(), c0.getBotonCadrado().getY()+ladoCadrado, ladoCadrado, ladoCadrado);
        c2.getBotonCadrado().setBounds(c0.getBotonCadrado().getX(), c0.getBotonCadrado().getY()+ladoCadrado*2, ladoCadrado, ladoCadrado);
        c3.getBotonCadrado().setBounds(c0.getBotonCadrado().getX()+ladoCadrado, c0.getBotonCadrado().getY()+ladoCadrado*2, ladoCadrado, ladoCadrado);
        /*c1.setX(c0.getX());
        c1.setY(c0.getY()+this.ladoCadrado);
        c2.setX(c0.getX());
        c2.setY(c0.getY()+2*this.ladoCadrado);
        c3.setX(c0.getX()+this.ladoCadrado);
        c3.setY(c0.getY()+2*this.ladoCadrado);*/
    }
    
}
