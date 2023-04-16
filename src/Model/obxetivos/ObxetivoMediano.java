/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.obxetivos;

import Model.Xogo;
import View.VentanaPrincipal;
import java.awt.Color;

/**
 *
 * @author brais
 */
public class ObxetivoMediano extends Obxetivo{
    
    public ObxetivoMediano(Xogo xogo1, VentanaPrincipal ventanaPrincipal) {
        super(xogo1, ventanaPrincipal);
        this.ladoCadrado=50;
        setCorRecheo(Color.orange);
        lblCadrado.setSize(ladoCadrado, ladoCadrado);
    }

    public int getLadoCadrado() {
        return ladoCadrado;
    }

    public void setLadoCadrado(int LADOCADRADO) {
        this.ladoCadrado = LADOCADRADO;
    }
    
    
}
