/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sound;

import View.VentanaPrincipal;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

/**
 *
 * @author a22braisdr
 */
public class Sound {
    private Clip cancion;
    private Clip sonidoAcerto;
    private Clip sonidoGameOver;
    private Clip sonidoCambioObstaculos;
    private VentanaPrincipal ventanaPrincipal;
    
    public Sound(VentanaPrincipal ventanaPrincipal){
        this.ventanaPrincipal=ventanaPrincipal;
    }

    public Clip getCancion() {
        return cancion;
    }

    public void setCancion(Clip cancion) {
        this.cancion = cancion;
    }

    public Clip getSonidoAcerto() {
        return sonidoAcerto;
    }

    public void setSonidoAcerto(Clip sonidoAcerto) {
        this.sonidoAcerto = sonidoAcerto;
    }

    public Clip getSonidoGameOver() {
        return sonidoGameOver;
    }

    public void setSonidoGameOver(Clip sonidoGameOver) {
        this.sonidoGameOver = sonidoGameOver;
    }

    public Clip getSonidoCambioObstaculos() {
        return sonidoCambioObstaculos;
    }

    public void setSonidoCambioObstaculos(Clip sonidoCambioObstaculos) {
        this.sonidoCambioObstaculos = sonidoCambioObstaculos;
    }
    
    
    
    
    
    //MÉTODOS PARA OS SONS/////////////////////////////////////////
    
    /**
     * Executa a música do xogo
     */
    public void musica(){
        String sonido="";
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(sonido));
            cancion = AudioSystem.getClip();
            cancion.open(audioInputStream);
            cancion.start();
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            JOptionPane.showMessageDialog(ventanaPrincipal, "Error al reproducir la Música");
        }
    }
     
    /**
     * Executa un son cada vez que acertamos
     */
    public void acertoSound(){
        String sonido="";
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(sonido));
            sonidoAcerto = AudioSystem.getClip();
            sonidoAcerto.open(audioInputStream);
            sonidoAcerto.start();
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            ex.getMessage();
        }
    }
    
    /**
     * Executa unha música ao perder
     */
    public void gameOverSound(){
        String sonido="";
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(sonido));
            sonidoGameOver = AudioSystem.getClip();
            sonidoGameOver.open(audioInputStream);
            sonidoGameOver.start();
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            ex.getMessage();
        }
    }
    
    
    /**
     * Executa un son cada vez que os Obstáculos cambian de psoición
     */
    public void cambiarObstaculosSound(){
        String sonido="";
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(sonido));
            sonidoCambioObstaculos = AudioSystem.getClip();
            sonidoCambioObstaculos.open(audioInputStream);
            sonidoCambioObstaculos.start();
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            ex.getMessage();
        }
    }
}
