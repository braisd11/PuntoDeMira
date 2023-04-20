/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.obstaculos.Obstaculo;
import Model.obstaculos.ObstaculoVerticalGrande;
import Model.obxetivos.Obxetivo;
import Model.obxetivos.ObxetivoGrande;
import Model.obxetivos.ObxetivoMediano;
import Model.obxetivos.ObxetivoPequeno;
import View.VentanaPrincipal;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author a22braisdr
 */
public class Xogo {
    private final int MAXX=700;
    private final int MAXY=700;
    private VentanaPrincipal ventanaPrincipal;
    private ArrayList <Obxetivo> obxetivos=new ArrayList<>();
    private Iterator<Obxetivo> iterObxetivos;
    private ArrayList <Obstaculo> obstaculos=new ArrayList<>();
    private boolean pausa=false;
    private Obxetivo obxetivoPequeno;
    private Obxetivo obxetivoMediano;
    private Obxetivo obxetivoGrande;
    private Obstaculo obstaculoVerticalGrande;
    private int balas=10;
    private int acerto=5;
    private int erro=3;
    
    public Xogo(VentanaPrincipal ventanaPrincipal){
        this.ventanaPrincipal=ventanaPrincipal;
        xerarObxetivoPequeno();
        xerarObxetivoMediano();
        xerarObxetivoGrande();
        xerarObastaculoVerticalGrande();
        empezarPartida();
        
    }

    private Obstaculo xerarObastaculoVerticalGrande(){
        obstaculoVerticalGrande=new ObstaculoVerticalGrande(this, ventanaPrincipal);
        obstaculos.add(obstaculoVerticalGrande);
        return obstaculoVerticalGrande;
        
    }
    
    public int getMAXX() {
        return MAXX;
    }

    public int getMAXY() {
        return MAXY;
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

    public int getBalas() {
        return balas;
    }

    public void setBalas(int balas) {
        this.balas = balas;
    }

    public int getAcerto() {
        return acerto;
    }

    public void setAcerto(int acerto) {
        this.acerto = acerto;
    }

    public int getErro() {
        return erro;
    }

    public void setErro(int erro) {
        this.erro = erro;
    }
    
    
    /**
     * Dalle una posición na Ventana Principal aos tres Obxetivos
     */
    public void empezarPartida(){
        obxetivoPequeno.xerarPosicionObxetivo();
        obxetivoMediano.xerarPosicionObxetivo();
        obxetivoGrande.xerarPosicionObxetivo();
        obstaculoVerticalGrande.xerarPosicionObstaculo();
        
        ventanaPrincipal.pintarCadrado(obxetivoPequeno.getBotonCadrado());
        ventanaPrincipal.pintarCadrado(obxetivoMediano.getBotonCadrado());
        ventanaPrincipal.pintarCadrado(obxetivoGrande.getBotonCadrado());
        ventanaPrincipal.pintarCadrado(obstaculoVerticalGrande.getBotonCadrado());
        System.out.println(obstaculoVerticalGrande.getCoordenadas());
        System.out.println(obstaculoVerticalGrande.getC1().getCoordenadas());
    }
    
    
    /**
     * Crea un obxeto da clase ObxetivoPequeno e coloreao
     * @return Obxetivo obxetivoPequeno 
     */
    public Obxetivo xerarObxetivoPequeno (){
        obxetivoPequeno= new ObxetivoPequeno(this, ventanaPrincipal);
        obxetivos.add(obxetivoPequeno);
        return obxetivoPequeno;
    }
    
    
    /**
     * Crea un obxeto da clase ObxetivoMediano e coloreao
     * @return Obxetivo obxetivoMediano 
     */
    public Obxetivo xerarObxetivoMediano (){
        obxetivoMediano= new ObxetivoMediano(this, ventanaPrincipal);
        obxetivos.add(obxetivoMediano);
        return obxetivoMediano;
    }
    
    /**
     * Crea un obxeto da clase ObxetivoGrande e coloreao
     * @return Obxetivo obxetivoGrande 
     */
    public Obxetivo xerarObxetivoGrande (){
        obxetivoGrande= new ObxetivoGrande(this, ventanaPrincipal);
        obxetivos.add(obxetivoGrande);
        return obxetivoGrande;
    }
    
    
    
    
    
    /**
     * Comproba que o Obxetivo non se saia dos límites do JPanel
     * @param obxetivo Obxetivo do que queremos comprobar que as coordenadas sexan correctas
     * @return boolean de se a posición é correcta
     */
    public boolean comprobarPosicion(Obxetivo obxetivo){
        boolean posicionCorrecta=true;
        if (obxetivo.getX()>(MAXX-obxetivo.getLadoCadrado()) || obxetivo.getY()>(MAXY-obxetivo.getLadoCadrado())){
            posicionCorrecta=false;
            obxetivo.xerarPosicionObxetivo();
        }
        return posicionCorrecta;
    }
    
    public boolean comprobarPosicion(Obstaculo obstaculo){
        boolean posicionCorrecta=true;
        if (obstaculo.getX()>(MAXX-obstaculo.getLadoCadrado()) || obstaculo.getY()>(MAXY-obstaculo.getLadoCadrado())){
            posicionCorrecta=false;
            obstaculo.xerarPosicionObstaculo();
        }
        return posicionCorrecta;
    }
    
    
    public void eliminarTodo(){
        eliminarObxetivos();
    }
    
    private void eliminarObxetivos(){
        iterObxetivos=obxetivos.iterator();
        while (iterObxetivos.hasNext()){
            Obxetivo obxetivo = iterObxetivos.next();
            ventanaPrincipal.borrarCadrados(obxetivo.getBotonCadrado());
        }
        obxetivos.clear();
    }
}
