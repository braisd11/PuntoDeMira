/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.obxetivos;

import Model.Cadrado;
import Model.Xogo;
import View.VentanaPrincipal;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;


/**
 *
 * @author a22braisdr
 */
public class Obxetivo extends Cadrado implements MouseListener {
    protected int ladoCadrado;
    private Color corRecheo=Color.RED;
    private Xogo xogo1;
    private VentanaPrincipal ventanaPrincipal;

    public Obxetivo(Xogo xogo1, VentanaPrincipal ventanaPrincipal) {
        super();
        this.xogo1=xogo1;
        this.ventanaPrincipal=ventanaPrincipal;
        lblCadrado.addMouseListener(this);
    }

    
    
    public Color getCorRecheo() {
        return corRecheo;
    }

    public int getLadoCadrado() {
        return ladoCadrado;
    }

    public void setLadoCadrado(int ladoCadrado) {
        this.ladoCadrado = ladoCadrado;
    }

    public void setCorRecheo(Color corRecheo) {
        this.corRecheo = corRecheo;
    }
    
    

    /**
     * Dalle unha cor e opacidade ao obxetivo
     */
    public void setCorRecheo() {
        this.corRecheo = corRecheo;
        lblCadrado.setBackground(corRecheo);
        lblCadrado.setOpaque(true);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        lblCadrado.setLocation(x, y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        lblCadrado.setLocation(x, y);
    }

    public JLabel getLblCadrado() {
        return lblCadrado;
    }

    public void setLblCadrado(JLabel lblCadrado) {
        this.lblCadrado = lblCadrado;
    }

    
    /**
     * Cada vez que se clicka no obxetivo, cambiao de posición, suma un acerto e resta unha bala
     * @param e 
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        this.xogo1.xerarPosicionObxetivo(this);
        ventanaPrincipal.pintarCadrado(lblCadrado);
        System.out.println(getCoordenadas());
        ventanaPrincipal.sumarAcerto();
        ventanaPrincipal.restarBala();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
