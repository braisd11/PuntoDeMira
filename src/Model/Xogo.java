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
    private final int MAXX=700;
    private final int MAXY=700;
    private VentanaPrincipal ventanaPrincipal;
    private boolean pausa=false;
    private Obxetivo obxetivoActual;
    
    public Xogo(VentanaPrincipal ventanaPrincipal){
        this.ventanaPrincipal=ventanaPrincipal;
        xerarObxetivo();
        empezarPartida();
        
    }

    public VentanaPrincipal getVentanaPrincipal() {
        return ventanaPrincipal;
    }

    public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    public boolean isPausa() {
        return pausa;
    }

    public void setPausa(boolean pausa) {
        this.pausa = pausa;
    }

    public Obxetivo getObxetivoActual() {
        return obxetivoActual;
    }

    public void setObxetivoActual(Obxetivo obxetivoActual) {
        this.obxetivoActual = obxetivoActual;
    }
    
    
    
    
    
    
    /**
     * Crea un obxeto de clase Obxetivo e dalle una posición na Ventana Principal
     */
    public void empezarPartida(){
        xerarPosicionObxetivo();
        ventanaPrincipal.pintarCadrado(obxetivoActual.getLblCadrado());
        System.out.println(obxetivoActual.getCoordenadas());
    }
    
    
    /**
     * Crea un obxeto da clase Obxetivo e coloreao
     * @return Obxetivo 
     */
    public Obxetivo xerarObxetivo (){
        obxetivoActual= new Obxetivo(this, ventanaPrincipal);
        obxetivoActual.setCorRecheo();
        
        return obxetivoActual;
    }
    
    /**
     * Xéranse dous números aleatorios para darlle a unhas coordenadas x e y
     * @param obxetivo  
     */
    public void xerarPosicionObxetivo(){
        int numX = (int) Math.floor(Math.random() * (MAXX - 0 + 1) + 0);
        int numY = (int) Math.floor(Math.random() * (MAXY - 0 + 1) + 0);
        obxetivoActual.setX(numX);
        obxetivoActual.setY(numY);
        comprobarPosicion(numX,numY);
    }
    
    /**
     * Comproba que o obxetivo esté en una posición do panel e non quede parte fóra
     * @param numX Coordenada x
     * @param numY Coordenada y
     * @return Se a posición é correcta ou non con respecto aos límites do panel
     */
    private boolean comprobarPosicion(int numX, int numY){
        boolean posicionCorrecta=true;
        if (numX>(MAXX-obxetivoActual.getLADOCADRADO()) || numY>(MAXY-obxetivoActual.getLADOCADRADO())){
            posicionCorrecta=false;
            xerarPosicionObxetivo();
        }
        return posicionCorrecta;
    }
}
