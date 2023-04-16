/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.obxetivos.Obxetivo;
import Model.obxetivos.ObxetivoGrande;
import Model.obxetivos.ObxetivoMediano;
import Model.obxetivos.ObxetivoPequeno;
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
    private Obxetivo obxetivoPequeno;
    private Obxetivo obxetivoMediano;
    private Obxetivo obxetivoGrande;
    
    public Xogo(VentanaPrincipal ventanaPrincipal){
        this.ventanaPrincipal=ventanaPrincipal;
        xerarObxetivoPequeno();
        xerarObxetivoMediano();
        xerarObxetivoGrande();
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

    public Obxetivo getObxetivoPequeno() {
        return obxetivoPequeno;
    }

    public void setObxetivoPequeno(Obxetivo obxetivoPequeno) {
        this.obxetivoPequeno = obxetivoPequeno;
    }

    public Obxetivo getObxetivoMediano() {
        return obxetivoMediano;
    }

    public void setObxetivoMediano(Obxetivo obxetivoMediano) {
        this.obxetivoMediano = obxetivoMediano;
    }

    public Obxetivo getObxetivoGrande() {
        return obxetivoGrande;
    }

    public void setObxetivoGrande(Obxetivo obxetivoGrande) {
        this.obxetivoGrande = obxetivoGrande;
    }
    
    
    /**
     * Dalle una posición na Ventana Principal aos tres Obxetivos
     */
    public void empezarPartida(){
        xerarPosicionObxetivo(obxetivoPequeno);
        xerarPosicionObxetivo(obxetivoMediano);
        xerarPosicionObxetivo(obxetivoGrande);
        ventanaPrincipal.pintarCadrado(obxetivoPequeno.getLblCadrado());
        ventanaPrincipal.pintarCadrado(obxetivoMediano.getLblCadrado());
        ventanaPrincipal.pintarCadrado(obxetivoGrande.getLblCadrado());
    }
    
    
    /**
     * Crea un obxeto da clase ObxetivoPequeno e coloreao
     * @return Obxetivo obxetivoPequeno 
     */
    public Obxetivo xerarObxetivoPequeno (){
        obxetivoPequeno= new ObxetivoPequeno(this, ventanaPrincipal);
        obxetivoPequeno.setCorRecheo();
        return obxetivoPequeno;
    }
    
    
    /**
     * Crea un obxeto da clase ObxetivoMediano e coloreao
     * @return Obxetivo obxetivoMediano 
     */
    public Obxetivo xerarObxetivoMediano (){
        obxetivoMediano= new ObxetivoMediano(this, ventanaPrincipal);
        obxetivoMediano.setCorRecheo();
        return obxetivoMediano;
    }
    
    /**
     * Crea un obxeto da clase ObxetivoGrande e coloreao
     * @return Obxetivo obxetivoGrande 
     */
    public Obxetivo xerarObxetivoGrande (){
        obxetivoGrande= new ObxetivoGrande(this, ventanaPrincipal);
        obxetivoGrande.setCorRecheo();
        return obxetivoGrande;
    }
    
    
    /**
     * Xéranse dous números aleatorios para darlle a unhas coordenadas x e y
     * @param obxetivo  Obxetivo ao que lle queremos cambiar a posición
     */
    public void xerarPosicionObxetivo(Obxetivo obxetivo){
        int numX = (int) Math.floor(Math.random() * (MAXX - 0 + 1) + 0);
        int numY = (int) Math.floor(Math.random() * (MAXY - 0 + 1) + 0);
        obxetivo.setX(numX);
        obxetivo.setY(numY);
        comprobarPosicion(obxetivo);
    }
    
    /**
     * Comproba que o Obxetivo non se saia dos límites do JPanel
     * @param obxetivo Obxetivo do que queremos comprobar que as coordenadas sexan correctas
     * @return boolean de se a posición é correcta
     */
    private boolean comprobarPosicion(Obxetivo obxetivo){
        boolean posicionCorrecta=true;
        if (obxetivo.getX()>(MAXX-obxetivo.getLadoCadrado()) || obxetivo.getY()>(MAXY-obxetivo.getLadoCadrado())){
            posicionCorrecta=false;
            xerarPosicionObxetivo(obxetivo);
        }
        return posicionCorrecta;
    }
}
