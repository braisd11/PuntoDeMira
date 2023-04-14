/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.VentanaPrincipal;

/**
 *
 * @author a22braisdr
 */
public class Xogo {
    private final int RADIO=30;
    private final int MAXX=700;
    private final int MAXY=700;
    private VentanaPrincipal ventanaPrincipal;
    
    public Xogo(VentanaPrincipal ventanaPrincipal){
        this.ventanaPrincipal=ventanaPrincipal;
    }
    
    
    
    
    
    
    
    public void empezarPartida(){
        Obxetivo cadrado1=new Obxetivo(RADIO);
        cadrado1.setCorRecheo();
        posicionCadrado(cadrado1);
        ventanaPrincipal.pintarCadrado(cadrado1.getLblCadrado());
    }
    
    public void posicionCadrado(Obxetivo cadrado){
        int numX = (int) Math.floor(Math.random() * ((MAXX/RADIO) - 0 + 1) + 0);
        int numY = (int) Math.floor(Math.random() * ((MAXY/RADIO) - 0 + 1) + 0);
        cadrado.setX(numX*RADIO);
        cadrado.setY(numY*RADIO);
    }
}
