/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author a22braisdr
 */
public class Timers {
    private VentanaPrincipal ventanaPrincipal;
    private javax.swing.Timer tiempo;
    private javax.swing.Timer duracion;
    private javax.swing.Timer tiempoRecarga;
    private int espera=3;
    private int recargando=0;
    

    public Timers(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        crearTimerPartida();
        crearTimerPuntos();
        crearTimerRecarga();
    }

    public Timer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Timer tiempo) {
        this.tiempo = tiempo;
    }

    public Timer getDuracion() {
        return duracion;
    }

    public void setDuracion(Timer duracion) {
        this.duracion = duracion;
    }

    public Timer getTiempoRecarga() {
        return tiempoRecarga;
    }

    public void setTiempoRecarga(Timer tiempoRecarga) {
        this.tiempoRecarga = tiempoRecarga;
    }

    
    
    
    
    
    private void crearTimerPartida(){
        duracion=new javax.swing.Timer(1000, new ActionListener() {
            int tempo=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                tempo++;
                ventanaPrincipal.getXogo1().setDuracionTotal(tempo);
                if (ventanaPrincipal.getXogo1().getDificultad()=="Dinámico"){
                    ventanaPrincipal.aparecerObxetivos(tempo);
                    ventanaPrincipal.desaparecerObxetivos(tempo);
                }
            }
        });
    }
    
    
    
    private void crearTimerRecarga(){
        tiempoRecarga=new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaPrincipal.getPanelJuego().requestFocus();
                espera--;
                ventanaPrincipal.getLabelRecargando().setText(espera+"");
                if (recargando==espera){
                    ventanaPrincipal.recargar();
                    tiempoRecarga.stop();
                    
                    espera=3;
                }
            }
        });
    }
    
    
    private void crearTimerPuntos(){
        tiempo=new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaPrincipal.getPanelJuego().requestFocus();
                String a=ventanaPrincipal.getLabelTiempo().getText();
                int b=(int) Double.parseDouble(a);
                b--;
                ventanaPrincipal.getLabelTiempo().setText(b+"");
                if (b<=0){
                    ventanaPrincipal.getLabelTiempo().setText("0");
                    ventanaPrincipal.mostrarFinDeXogo();
                }
            }
        });
    }
}
