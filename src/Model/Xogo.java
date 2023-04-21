/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.obstaculos.Obstaculo;
import Model.obstaculos.ObstaculoCadradoGrande;
import Model.obstaculos.ObstaculoCadradoPequeno;
import Model.obstaculos.ObstaculoL;
import Model.obstaculos.ObstaculoVerticalGrande;
import Model.obstaculos.ObstaculoVerticalPequeno;
import Model.obxetivos.Obxetivo;
import Model.obxetivos.ObxetivoGrande;
import Model.obxetivos.ObxetivoMediano;
import Model.obxetivos.ObxetivoPequeno;
import View.VentanaPrincipal;
import java.util.ArrayList;
import java.util.HashMap;
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
    private HashMap<Integer,Obstaculo> obstaculos=new HashMap<>();
    private boolean pausa=false;
    private Obxetivo obxetivoPequeno;
    private Obxetivo obxetivoMediano;
    private Obxetivo obxetivoGrande;
    private Obstaculo obstaculoVerticalGrande;
    private int dificultad=2;
    private int balas=10;
    private int acerto=5;
    private int erro=3;
    
    public Xogo(VentanaPrincipal ventanaPrincipal){
        this.ventanaPrincipal=ventanaPrincipal;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
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
        xerarObxetivos();
        ventanaPrincipal.pintarObxetivos();
        if (dificultad==1){
            for (int cont=0; cont<=dificultad; cont++) {
                xerarObstaculos();
            }
            
        }
        else{
            for (int cont=0; cont<=2; cont++) {
                xerarObstaculos();
            }
        }
        
        //ventanaPrincipal.pintarCadrado(obstaculoVerticalGrande.getC0().getBotonCadrado());
        //ventanaPrincipal.pintarCadrado(obstaculoVerticalGrande.getC1().getBotonCadrado());
        //System.out.println(obstaculoVerticalGrande.getC0().getCoordenadas());
        //System.out.println(obstaculoVerticalGrande.getC1().getCoordenadas());
    }
    
    
    
    private void xerarObxetivos(){
        if (dificultad==3){
            xerarObxetivoPequeno();
            xerarObxetivoMediano();
            
        }
        else {
            xerarObxetivoPequeno();
            xerarObxetivoMediano();
            xerarObxetivoGrande();
        }
    }
    
    /**
     * Crea un obxeto da clase ObxetivoPequeno e coloreao
     * @return Obxetivo obxetivoPequeno 
     */
    private Obxetivo xerarObxetivoPequeno (){
        obxetivoPequeno= new ObxetivoPequeno(this);
        obxetivos.add(obxetivoPequeno);
        return obxetivoPequeno;
    }
    
    
    /**
     * Crea un obxeto da clase ObxetivoMediano e coloreao
     * @return Obxetivo obxetivoMediano 
     */
    private Obxetivo xerarObxetivoMediano (){
        obxetivoMediano= new ObxetivoMediano(this);
        obxetivos.add(obxetivoMediano);
        return obxetivoMediano;
    }
    
    /**
     * Crea un obxeto da clase ObxetivoGrande e coloreao
     * @return Obxetivo obxetivoGrande 
     */
    private Obxetivo xerarObxetivoGrande (){
        obxetivoGrande= new ObxetivoGrande(this);
        obxetivos.add(obxetivoGrande);
        return obxetivoGrande;
    }
    
    
    private Obstaculo xerarObstaculos (){
        Obstaculo obstaculoAXerar=null;
        HashMap<Integer,Obstaculo> map=new HashMap<>();
        map.put(1, obstaculoAXerar=new ObstaculoCadradoPequeno(this));
        map.put(2, obstaculoAXerar=new ObstaculoVerticalPequeno(this));
        map.put(3, obstaculoAXerar=new ObstaculoCadradoGrande(this));
        map.put(4, obstaculoAXerar=new ObstaculoVerticalGrande(this));
        map.put(5, obstaculoAXerar=new ObstaculoL(this));
        int figura=(int) Math.floor(Math.random() * (5 - 1 + 1) + 1);
        return map.get(figura);
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
        if (obstaculo.getC0().getX()>(MAXX-obstaculo.getLadoCadrado()) || obstaculo.getC0().getY()>(MAXY-obstaculo.getLadoCadrado())){
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
