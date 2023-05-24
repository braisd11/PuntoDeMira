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
import Model.obxetivos.ObxetivoRosa;
import Model.obxetivos.ObxetivoVermello;
import Model.obxetivos.ObxetivoVerde;
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
    private String dificultad="Dinámico";
    private int balas=10;
    private int acerto=2;
    private int erro=5;
    private String usuario;
    private int acertosTotais=0;
    private int puntosTotais=0;
    private int duracionTotal=0;
    private int fallos=0;
    private Obxetivo obxetivoVerde;
    private Obxetivo obxetivoVermello;
    private Obxetivo obxetivoRosa;
    

    /**
     * Construtor da clase Xogo
     * @param ventanaPrincipal Interface gráfica 
     */
    public Xogo(VentanaPrincipal ventanaPrincipal){
        this.ventanaPrincipal=ventanaPrincipal;
        crearObstaculos();
    }

    /**
     *
     * @return
     */
    public ArrayList<Obxetivo> getObxetivos() {
        return obxetivos;
    }

    /**
     *
     * @param obxetivos
     */
    public void setObxetivos(ArrayList<Obxetivo> obxetivos) {
        this.obxetivos = obxetivos;
    }

    /**
     *
     * @return
     */
    public Iterator<Obxetivo> getIterObxetivos() {
        return iterObxetivos;
    }

    /**
     *
     * @param iterObxetivos
     */
    public void setIterObxetivos(Iterator<Obxetivo> iterObxetivos) {
        this.iterObxetivos = iterObxetivos;
    }

    /**
     *
     * @return
     */
    public String getDificultad() {
        return dificultad;
    }

    /**
     *
     * @param dificultad
     */
    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    /**
     *
     * @return
     */
    public int getMAXX() {
        return MAXX;
    }

    /**
     *
     * @return
     */
    public int getMAXY() {
        return MAXY;
    }
    
    /**
     *
     * @return
     */
    public VentanaPrincipal getVentanaPrincipal() {
        return ventanaPrincipal;
    }

    /**
     *
     * @param ventanaPrincipal
     */
    public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    /**
     *
     * @return
     */
    public boolean isPausa() {
        return pausa;
    }

    /**
     *
     * @param pausa
     */
    public void setPausa(boolean pausa) {
        this.pausa = pausa;
    }

    /**
     *
     * @return
     */
    public int getBalas() {
        return balas;
    }

    /**
     *
     * @param balas
     */
    public void setBalas(int balas) {
        this.balas = balas;
    }

    /**
     *
     * @return
     */
    public int getAcerto() {
        return acerto;
    }

    /**
     *
     * @param acerto
     */
    public void setAcerto(int acerto) {
        this.acerto = acerto;
    }

    /**
     *
     * @return
     */
    public int getErro() {
        return erro;
    }

    /**
     *
     * @param erro
     */
    public void setErro(int erro) {
        this.erro = erro;
    }

    /**
     *
     * @return
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     *
     * @param usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     *
     * @return
     */
    public int getDuracionTotal() {
        return duracionTotal;
    }

    /**
     *
     * @param duracionTotal
     */
    public void setDuracionTotal(int duracionTotal) {
        this.duracionTotal = duracionTotal;
    }

    /**
     *
     * @return
     */
    public int getFallos() {
        return fallos;
    }

    /**
     *
     * @param fallos
     */
    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    /**
     *
     * @return
     */
    public int getAcertosTotais() {
        return acertosTotais;
    }

    /**
     *
     * @param acertosTotais
     */
    public void setAcertosTotais(int acertosTotais) {
        this.acertosTotais = acertosTotais;
    }

    /**
     *
     * @return
     */
    public Obxetivo getObxetivoVerde() {
        return obxetivoVerde;
    }

    /**
     *
     * @param obxetivoVerde
     */
    public void setObxetivoVerde(Obxetivo obxetivoVerde) {
        this.obxetivoVerde = obxetivoVerde;
    }

    /**
     *
     * @return
     */
    public Obxetivo getObxetivoVermello() {
        return obxetivoVermello;
    }

    /**
     *
     * @param obxetivoVermello
     */
    public void setObxetivoVermello(Obxetivo obxetivoVermello) {
        this.obxetivoVermello = obxetivoVermello;
    }

    /**
     *
     * @return
     */
    public Obxetivo getObxetivoRosa() {
        return obxetivoRosa;
    }

    /**
     *
     * @param obxetivoRosa
     */
    public void setObxetivoRosa(Obxetivo obxetivoRosa) {
        this.obxetivoRosa = obxetivoRosa;
    }

    /**
     * 
     * @return Array obstaculos
     */
    public ArrayList<Obstaculo> getObstaculos() {
        return obstaculos;
    }

    public int getPuntosTotais() {
        return puntosTotais;
    }

    public void setPuntosTotais(int puntosTotais) {
        this.puntosTotais = puntosTotais;
    }
    
    
    
    /**
     * Xera os Obstáculos e os Obxetivos
     */
    public void empezarPartida(){
        xerarObstaculos();
        establecerPosicionObstaculos();
        xerarObxetivos();
        pintarObxetivos();
        pintarObstaculos();
    }
    
    
    
    private void xerarObxetivos(){
        obxetivoVerde=xerarObxetivoPequeno();
        obxetivoVermello=xerarObxetivoMediano();
        obxetivoRosa=xerarObxetivoGrande();
    }
    
    
    private Obxetivo xerarObxetivoPequeno (){
        Obxetivo obxetivoPequeno= new ObxetivoVerde(this);
        obxetivos.add(obxetivoPequeno);
        return obxetivoPequeno;
    }
    
    
    
    private Obxetivo xerarObxetivoMediano (){
        Obxetivo obxetivoMediano= new ObxetivoVermello(this);
        obxetivos.add(obxetivoMediano);
        return obxetivoMediano;
    }
    
    
    private Obxetivo xerarObxetivoGrande (){
        Obxetivo obxetivoGrande= new ObxetivoRosa(this);
        obxetivos.add(obxetivoGrande);
        return obxetivoGrande;
    }
    
    
    /**
     * Xera dous ou tres obstáculos dependendo da dificutade escollida
     */
    public void xerarObstaculos(){
        if (dificultad=="Estático"){
            for (int cont=1; cont<=obstaculosColeccion.size()-1; cont++) {
                engadirObstaculo(cont);
            }
        }
        else {
            for (int cont=1; cont<=obstaculosColeccion.size(); cont++) {
                engadirObstaculo(cont);
            }
        }
    }
    
    private void engadirObstaculo (int figura){
        engadirArray(obstaculosColeccion.get(figura));
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
        reiniciarEstadisticas();
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
    
    
    private void reiniciarEstadisticas(){
        acertosTotais=0;
        fallos=0;
        duracionTotal=0;
        erro=5;
        acerto=1;
    }
    
    
    /**
     * Elimina os obstáculos e crea unhos novos en outra posición
     */
    public void cambiarObstáculos (){
        if (acertosTotais%10==0){
            ventanaPrincipal.getArrayBotones().clear();
            obstaculos.clear();
            xerarObstaculos();
            establecerPosicionObstaculos();
            pintarObstaculos();
            ventanaPrincipal.getPanelJuego().setComponentZOrder(ventanaPrincipal.getFondoJuego(), ventanaPrincipal.getPanelJuego().getComponentCount()-1);
        }
    }
    
    
    /**
     * Realiza unha acción dependendo do tipo de Obxetivo
     * @param obxetivo Obxetivo clickado
     */
    public void obxetivoClickado(Obxetivo obxetivo) {
        if(obxetivo==obxetivoVerde){
            obxetivo.xerarPosicionObxetivo();
        }
        else if (obxetivo==obxetivoVermello){
            if (dificultad=="Dinámico"){
                obxetivo.getBotonCadrado().setVisible(false);
            }
            else {
                obxetivo.xerarPosicionObxetivo();
            }
        }
        else if (obxetivo==obxetivoRosa) {
            balas += 4;
            ventanaPrincipal.escribir(getBalas(), ventanaPrincipal.getLabelCargador());
            if (dificultad=="Dinámico"){
                obxetivo.getBotonCadrado().setVisible(false);
            }
            else {
                obxetivo.xerarPosicionObxetivo();
            }
        }
    }
}
