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
    private ArrayList <Obstaculo> obstaculos=new ArrayList<>();
    private Iterator<Obstaculo> iterObstaculos;
    private boolean pausa=false;
    private Obxetivo obxetivo1;
    private Obstaculo obstaculo1;
    private int dificultad=2;
    private int balas=10;
    private int acerto=5;
    private int erro=3;
    
    public Xogo(VentanaPrincipal ventanaPrincipal){
        this.ventanaPrincipal=ventanaPrincipal;
    }

    public ArrayList<Obxetivo> getObxetivos() {
        return obxetivos;
    }

    public void setObxetivos(ArrayList<Obxetivo> obxetivos) {
        this.obxetivos = obxetivos;
    }

    public Iterator<Obxetivo> getIterObxetivos() {
        return iterObxetivos;
    }

    public void setIterObxetivos(Iterator<Obxetivo> iterObxetivos) {
        this.iterObxetivos = iterObxetivos;
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

    public Obxetivo getObxetivo1() {
        return obxetivo1;
    }

    public void setObxetivo1(Obxetivo obxetivo1) {
        this.obxetivo1 = obxetivo1;
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
        pintarObxetivos();
        if (dificultad==1){
            for (int cont=0; cont<=dificultad; cont++) {
                obstaculo1=xerarObstaculos();
            }
            
        }
        else{
            for (int cont=0; cont<=2; cont++) {
                obstaculo1=xerarObstaculos();
            }
        }
        pintarObstaculos();
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
    
    
    private Obxetivo xerarObxetivoPequeno (){
        obxetivo1= new ObxetivoPequeno(this);
        obxetivos.add(obxetivo1);
        return obxetivo1;
    }
    
    
    
    private Obxetivo xerarObxetivoMediano (){
        obxetivo1= new ObxetivoMediano(this);
        obxetivos.add(obxetivo1);
        return obxetivo1;
    }
    
    
    private Obxetivo xerarObxetivoGrande (){
        obxetivo1= new ObxetivoGrande(this);
        obxetivos.add(obxetivo1);
        return obxetivo1;
    }
    
    
    private Obstaculo xerarObstaculos (){
        HashMap<Integer,Obstaculo> obstaculosColeccion=new HashMap<>();
        obstaculosColeccion.put(1, new ObstaculoCadradoPequeno(this));
        obstaculosColeccion.put(2, new ObstaculoVerticalPequeno(this));
        obstaculosColeccion.put(3, new ObstaculoCadradoGrande(this));
        obstaculosColeccion.put(4, new ObstaculoVerticalGrande(this));
        obstaculosColeccion.put(5, new ObstaculoL(this));
        int figura=(int) Math.floor(Math.random() * (5 - 1 + 1) + 1);
        obstaculos.add(obstaculosColeccion.get(figura));
        return obstaculosColeccion.get(figura);
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
    
    /**
     * Comproba que o Obstaculo non se saia dos límites do JPanel
     * @param obstaculo Obstaculo do que queremos comprobar que as coordenadas sexan correctas
     * @return boolean de se a posición é correcta
     */
    public boolean comprobarPosicion(Obstaculo obstaculo){
        boolean posicionCorrecta=true;
        if(obstaculo.getC3().getX()>(MAXX-obstaculo.getLadoCadrado()) || obstaculo.getC3().getY()>(MAXY-obstaculo.getLadoCadrado())){
            posicionCorrecta=false;
            obstaculo.xerarPosicionObstaculo(obstaculo);
        }
        return posicionCorrecta;
    }
    
    /**
     * Elimina todos os obxetivos e obstáculos do jPanel
     */
    public void eliminarTodo(){
        eliminarObxetivos();
        eliminarObstaculos();
    }
    
    private void eliminarObxetivos(){
        iterObxetivos=obxetivos.iterator();
        while (iterObxetivos.hasNext()){
            Obxetivo obxetivo = iterObxetivos.next();
            ventanaPrincipal.borrarCadrados(obxetivo.getBotonCadrado());
        }
        obxetivos.clear();
    }
    
    private void eliminarObstaculos(){
        iterObstaculos=obstaculos.iterator();
        while (iterObstaculos.hasNext()){
            Obstaculo obstaculo = iterObstaculos.next();
            obstaculo.setIterCadrados(obstaculo.getCadrados().iterator());
            while (obstaculo.getIterCadrados().hasNext()){
                Cadrado cadrado = obstaculo.getIterCadrados().next();
                ventanaPrincipal.borrarCadrados(cadrado.getBotonCadrado());
            }
        }
        obstaculos.clear();
    }
    
    /**
     * Colorea os obxetivos do Array de obxetivos
     */
    private void pintarObxetivos(){
        iterObxetivos=obxetivos.iterator();
        while (iterObxetivos.hasNext()){
            Obxetivo obxetivo = iterObxetivos.next();
            ventanaPrincipal.pintarCadrado(obxetivo.getBotonCadrado());
        }
    }
    
    /**
     * Colorea os cadrados do Array de obstaculos
     */
    public void pintarObstaculos(){
        iterObstaculos=obstaculos.iterator();
        while (iterObstaculos.hasNext()){
            Obstaculo obstaculo = iterObstaculos.next();
            obstaculo.setIterCadrados(obstaculo.getCadrados().iterator());
            while (obstaculo.getIterCadrados().hasNext()){
                Cadrado cadrado = obstaculo.getIterCadrados().next();
                ventanaPrincipal.pintarCadrado(cadrado.getBotonCadrado());
            }
        }
    }
    
    
}
