/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.obstaculos.Obstaculo;
import Model.obstaculos.ObstaculoCadrado;
import Model.obstaculos.ObstaculoL;
import Model.obstaculos.ObstaculoVertical;
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
    private HashMap<Integer,Obstaculo> obstaculosColeccion=new HashMap<>();
    private boolean pausa=false;
    private boolean dinamico=true;
    private int balas=10;
    private int acerto=5;
    private int erro=3;
    
    public Xogo(VentanaPrincipal ventanaPrincipal){
        this.ventanaPrincipal=ventanaPrincipal;
        crearObstaculos();
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

    public boolean isDinamico() {
        return dinamico;
    }

    public void setDinamico(boolean dinamico) {
        this.dinamico = dinamico;
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
     * Xera os Obstáculos e os Obxetivos
     */
    public void empezarPartida(){
        Obstaculo obstaculo;
        if (!dinamico){
            for (int cont=1; cont<=obstaculosColeccion.size()-1; cont++) {
                obstaculo=xerarObstaculos(cont);
            }
        }
        else {
            for (int cont=1; cont<=obstaculosColeccion.size(); cont++) {
                obstaculo=xerarObstaculos(cont);
            }
        }
        establecerPosicionObstaculos();
        xerarObxetivos();
        pintarObxetivos();
        pintarObstaculos();
    }
    
    
    
    private void xerarObxetivos(){
        xerarObxetivoPequeno();
        xerarObxetivoMediano();
        xerarObxetivoGrande();
    }
    
    
    private Obxetivo xerarObxetivoPequeno (){
        Obxetivo obxetivoPequeno= new ObxetivoPequeno(this);
        obxetivos.add(obxetivoPequeno);
        return obxetivoPequeno;
    }
    
    
    
    private Obxetivo xerarObxetivoMediano (){
        Obxetivo obxetivoMediano= new ObxetivoMediano(this);
        obxetivos.add(obxetivoMediano);
        return obxetivoMediano;
    }
    
    
    private Obxetivo xerarObxetivoGrande (){
        Obxetivo obxetivoGrande= new ObxetivoGrande(this);
        obxetivos.add(obxetivoGrande);
        return obxetivoGrande;
    }
    
    
    private Obstaculo xerarObstaculos (int figura){
        engadirArray(obstaculosColeccion.get(figura));
        return obstaculosColeccion.get(figura);
    }
    
    private void engadirArray (Obstaculo obstaculo){
        obstaculos.add(obstaculo);
    }
    
    private void crearObstaculos (){
        obstaculosColeccion.put(1, new ObstaculoCadrado(this));
        obstaculosColeccion.put(2, new ObstaculoVertical(this));
        obstaculosColeccion.put(3, new ObstaculoL(this));
        ventanaPrincipal.engadirListener(obstaculosColeccion.get(1));
        ventanaPrincipal.engadirListener(obstaculosColeccion.get(2));
        ventanaPrincipal.engadirListener(obstaculosColeccion.get(3));
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
    
    /**
     * Recorre o array obstaculos e xera unha posición para eles,ademáis de engadilos ao arrayBotones da VentanaPrincipal 
     */
    public void establecerPosicionObstaculos(){
        iterObstaculos=obstaculos.iterator();
        while (iterObstaculos.hasNext()){
            Obstaculo obstaculo = iterObstaculos.next();
            obstaculo.xerarPosicionObstaculo();
            ventanaPrincipal.engadirObstaculos(obstaculo);
        }
    }
}
